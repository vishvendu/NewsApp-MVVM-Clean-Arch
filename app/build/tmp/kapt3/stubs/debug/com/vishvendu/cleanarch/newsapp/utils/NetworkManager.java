package com.vishvendu.cleanarch.newsapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/utils/NetworkManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkForInternet", "", "app_debug"})
public final class NetworkManager {
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public NetworkManager(@org.jetbrains.annotations.NotNull()
    @com.vishvendu.cleanarch.newsapp.di.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    public final boolean checkForInternet() {
        return false;
    }
}