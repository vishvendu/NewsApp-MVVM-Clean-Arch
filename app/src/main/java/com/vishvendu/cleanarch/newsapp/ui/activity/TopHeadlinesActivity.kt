package com.vishvendu.cleanarch.newsapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.vishvendu.cleanarch.newsapp.R
import com.vishvendu.cleanarch.newsapp.databinding.ActivityTopHeadlineBinding
import com.vishvendu.cleanarch.newsapp.ui.fragment.TopHeadlinesFragment

class TopHeadlinesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTopHeadlineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopHeadlineBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initView()
    }

    private fun initView() {
        val topHeadlinesFragment = TopHeadlinesFragment.newInstance()
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.topHeadlineContainer, topHeadlinesFragment).commit()
    }
}