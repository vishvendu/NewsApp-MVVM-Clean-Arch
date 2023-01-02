package com.vishvendu.cleanarch.newsapp.di.component;

import java.lang.System;

@com.vishvendu.cleanarch.newsapp.di.ActivityScope()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/di/component/ActivityComponent;", "", "inject", "", "activity", "Landroid/app/Activity;", "Lcom/vishvendu/cleanarch/newsapp/ui/activity/NewsInLanguageActivity;", "Lcom/vishvendu/cleanarch/newsapp/ui/activity/NewsSourceDetailsActivity;", "app_debug"})
@dagger.Component(dependencies = {com.vishvendu.cleanarch.newsapp.di.component.ApplicationComponent.class}, modules = {com.vishvendu.cleanarch.newsapp.di.module.ActivityModule.class})
public abstract interface ActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.activity.NewsSourceDetailsActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.activity.NewsInLanguageActivity activity);
}