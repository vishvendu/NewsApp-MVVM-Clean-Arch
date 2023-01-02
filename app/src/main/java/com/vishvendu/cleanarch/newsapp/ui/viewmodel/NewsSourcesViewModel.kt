package com.vishvendu.cleanarch.newsapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishvendu.cleanarch.newsapp.data.model.newssources.Source
import com.vishvendu.cleanarch.newsapp.data.repository.NewsSourcesRepository
import com.vishvendu.cleanarch.newsapp.utils.DispatcherProvider
import com.vishvendu.cleanarch.newsapp.utils.Resource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

class NewsSourcesViewModel(
    private val newsSourcesRepository: NewsSourcesRepository,
    private val dispatcherProvider: DispatcherProvider
) : ViewModel() {

    private val _sourceList = MutableStateFlow<Resource<List<Source>>>(Resource.loading())
    val sourceList: StateFlow<Resource<List<Source>>> = _sourceList

    init {
        fetchSource()
    }

    private fun fetchSource() {
        viewModelScope.launch(dispatcherProvider.main){
            newsSourcesRepository.getNewsSources()
                .flowOn(dispatcherProvider.io)
                .catch {e ->
                    _sourceList.value = Resource.error(e.toString())
                }
                .collect {
                    _sourceList.value = Resource.success(it)
                }
        }
    }
}