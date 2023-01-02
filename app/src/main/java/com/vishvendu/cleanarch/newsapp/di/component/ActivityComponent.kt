package com.vishvendu.cleanarch.newsapp.di.component

import android.app.Activity
import android.content.Context
import com.vishvendu.cleanarch.newsapp.di.ActivityContext
import com.vishvendu.cleanarch.newsapp.di.ActivityScope
import com.vishvendu.cleanarch.newsapp.di.ApplicationContext
import com.vishvendu.cleanarch.newsapp.di.module.ActivityModule
import com.vishvendu.cleanarch.newsapp.ui.activity.MainActivity
import com.vishvendu.cleanarch.newsapp.ui.activity.NewsInLanguageActivity
import com.vishvendu.cleanarch.newsapp.ui.activity.NewsSourceDetailsActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: Activity)
    fun inject(activity: NewsSourceDetailsActivity)
    fun inject(activity: NewsInLanguageActivity)
}

