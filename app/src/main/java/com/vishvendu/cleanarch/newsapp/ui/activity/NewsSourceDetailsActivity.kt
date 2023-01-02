package com.vishvendu.cleanarch.newsapp.ui.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.vishvendu.cleanarch.newsapp.MyNewsApplication
import com.vishvendu.cleanarch.newsapp.data.model.newssourcedetails.Article
import com.vishvendu.cleanarch.newsapp.databinding.ActivityNewsSourceDetailsBinding
import com.vishvendu.cleanarch.newsapp.di.component.DaggerActivityComponent
import com.vishvendu.cleanarch.newsapp.di.module.ActivityModule
import com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceDetailsAdapter
import com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsSourceDetailsViewModel
import com.vishvendu.cleanarch.newsapp.utils.Status
import kotlinx.coroutines.launch
import javax.inject.Inject


class NewsSourceDetailsActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NEWS_ID = "news_id"

        fun getStartIntent(context: Context, newsID : String) : Intent {
           return Intent(context, NewsSourceDetailsActivity::class.java)
                .apply {
                    putExtra(EXTRA_NEWS_ID,newsID)
                }
        }
    }

    private lateinit var binding : ActivityNewsSourceDetailsBinding

    @Inject
    lateinit var newsSourceDetailsViewModel : NewsSourceDetailsViewModel

    @Inject
    lateinit var adapter: NewsSourceDetailsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies()
        super.onCreate(savedInstanceState)
        binding = ActivityNewsSourceDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initView()
        getIntentExtra()
        initObserver()
    }

    private fun getIntentExtra(){
        var bundle :Bundle ?=intent.extras
        var message = bundle!!.getString(EXTRA_NEWS_ID)
        message?.let { newsSourceDetailsViewModel.fetchNewsSourceDetails(it) }
    }

    private fun initObserver() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                newsSourceDetailsViewModel.articleList.collect{
                    when(it.status){
                        Status.SUCCESS ->{
                            binding.progressBar.visibility = View.GONE
                            it.data?.let { newsList -> renderList(newsList) }
                            binding.recyclerView.visibility = View.VISIBLE
                        }
                        Status.LOADING -> {
                            binding.progressBar.visibility = View.VISIBLE
                            binding.recyclerView.visibility = View.GONE
                        }
                        Status.ERROR -> {
                            //Handle Error
                            binding.progressBar.visibility = View.GONE
                        }
                    }
                }
            }
        }
    }


    private fun initView() {
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,0
            )
        )
        recyclerView.adapter = adapter
    }

    private fun renderList(articleList: List<Article>) {
        adapter.addData(articleList)
        adapter.notifyDataSetChanged()
    }

    private fun injectDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyNewsApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }
}