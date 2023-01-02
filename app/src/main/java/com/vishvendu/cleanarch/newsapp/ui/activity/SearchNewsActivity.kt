package com.vishvendu.cleanarch.newsapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.vishvendu.cleanarch.newsapp.R
import com.vishvendu.cleanarch.newsapp.databinding.ActivityNewsSourcesBinding
import com.vishvendu.cleanarch.newsapp.databinding.ActivitySearchNewsBinding
import com.vishvendu.cleanarch.newsapp.ui.fragment.NewsSourcesFragment
import com.vishvendu.cleanarch.newsapp.ui.fragment.SearchNewsFragment

class SearchNewsActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySearchNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchNewsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initView()
    }

    private fun initView() {
        val fragment = SearchNewsFragment.newInstance()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container,fragment).commit()
    }
}