package com.vishvendu.cleanarch.newsapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishvendu.cleanarch.newsapp.data.model.languagelist.LanguageItem
import com.vishvendu.cleanarch.newsapp.data.repository.LanguageListRepository
import com.vishvendu.cleanarch.newsapp.utils.DispatcherProvider
import com.vishvendu.cleanarch.newsapp.utils.Resource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class LanguageListViewModel(private val languageListRepository: LanguageListRepository, private val dispatcherProvider: DispatcherProvider) : ViewModel()  {

    private val _languageList = MutableStateFlow<Resource<List<LanguageItem>>>(Resource.loading())

    val languageList: StateFlow<Resource<List<LanguageItem>>> = _languageList

    init {
        fetchLanguageListDetails()
    }

    private fun fetchLanguageListDetails() {
        viewModelScope.launch(dispatcherProvider.main) {
            languageListRepository.getLanguageList()
                .catch { e ->
                    _languageList.value = Resource.error(e.toString())
                }
                .collect {
                    _languageList.value = Resource.success(it)
                }
        }
    }
}