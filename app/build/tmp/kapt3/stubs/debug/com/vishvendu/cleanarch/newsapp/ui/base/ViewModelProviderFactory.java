package com.vishvendu.cleanarch.newsapp.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/base/ViewModelProviderFactory;", "T", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "kClass", "Lkotlin/reflect/KClass;", "creator", "Lkotlin/Function0;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V", "create", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
@javax.inject.Singleton()
public final class ViewModelProviderFactory<T extends androidx.lifecycle.ViewModel> extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
    private final kotlin.reflect.KClass<T> kClass = null;
    private final kotlin.jvm.functions.Function0<T> creator = null;
    
    public ViewModelProviderFactory(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<T> kClass, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> creator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}