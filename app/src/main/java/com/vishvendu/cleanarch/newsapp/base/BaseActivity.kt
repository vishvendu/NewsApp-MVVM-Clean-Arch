package com.vishvendu.cleanarch.newsapp.base

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.vishvendu.cleanarch.newsapp.MyNewsApplication
import com.vishvendu.cleanarch.newsapp.di.component.DaggerActivityComponent
import com.vishvendu.cleanarch.newsapp.di.module.ActivityModule

abstract class BaseActivity<VM : ViewModel>(private val mViewModelClass: Class<VM>) : AppCompatActivity() {


    @LayoutRes
    abstract fun getLayoutRes(): Int

    /*val binding by lazy {

    }*/

    val viewModel by lazy {
        ViewModelProvider(this)[mViewModelClass]
    }


    abstract fun initViewModel(viewModel: VM)





    abstract fun setupViews()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutRes())
        initViewModel(viewModel)
        setupViews()
    }

    fun injectDependencyToActivity(activity: Activity, application: Application) {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyNewsApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(activity)
    }

    companion object {
        fun initFragment(fragment: Fragment, layoutID : Int, fragmentManager: FragmentManager){
            val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(layoutID,fragment).commit()
        }


    }

}