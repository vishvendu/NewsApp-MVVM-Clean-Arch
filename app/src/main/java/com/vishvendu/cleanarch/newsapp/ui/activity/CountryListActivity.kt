package com.vishvendu.cleanarch.newsapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.vishvendu.cleanarch.newsapp.R
import com.vishvendu.cleanarch.newsapp.databinding.ActivityCountryListBinding
import com.vishvendu.cleanarch.newsapp.databinding.ActivityMainBinding
import com.vishvendu.cleanarch.newsapp.ui.fragment.CountryListFragment
import com.vishvendu.cleanarch.newsapp.ui.fragment.MainFragment

class CountryListActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCountryListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountryListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initView()
    }

    private fun initView() {
        val countryListFragment = CountryListFragment.newInstance()
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, countryListFragment).commit()
    }
}