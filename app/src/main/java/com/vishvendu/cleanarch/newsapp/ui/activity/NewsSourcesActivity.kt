package com.vishvendu.cleanarch.newsapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.vishvendu.cleanarch.newsapp.R
import com.vishvendu.cleanarch.newsapp.databinding.ActivityMainBinding
import com.vishvendu.cleanarch.newsapp.databinding.ActivityNewsSourcesBinding
import com.vishvendu.cleanarch.newsapp.ui.fragment.NewsSourcesFragment

class NewsSourcesActivity : AppCompatActivity() {
    private lateinit var binding : ActivityNewsSourcesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsSourcesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initView()
    }

    private fun initView() {
        val fragment = NewsSourcesFragment().getInstance()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.newsSourceContainer,fragment).commit()
    }
}