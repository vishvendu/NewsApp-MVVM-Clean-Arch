package com.vishvendu.cleanarch.newsapp.di

import javax.inject.Qualifier

    @Qualifier
    @Retention(AnnotationRetention.SOURCE)
    annotation class ApplicationContext

    @Qualifier
    @Retention(AnnotationRetention.SOURCE)
    annotation class ActivityContext

    @Qualifier
    @Retention(AnnotationRetention.SOURCE)
    annotation class NetworkApiKey

    @Qualifier
    @Retention(AnnotationRetention.SOURCE)
    annotation class NetworkBASEURL
