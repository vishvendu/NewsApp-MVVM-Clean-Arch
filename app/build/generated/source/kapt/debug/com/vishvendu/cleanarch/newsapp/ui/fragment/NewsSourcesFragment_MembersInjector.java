// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.ui.fragment;

import com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceAdapter;
import com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsSourcesViewModel;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsSourcesFragment_MembersInjector implements MembersInjector<NewsSourcesFragment> {
  private final Provider<NewsSourceAdapter> adapterProvider;

  private final Provider<NewsSourcesViewModel> newsSourcesViewModelProvider;

  public NewsSourcesFragment_MembersInjector(Provider<NewsSourceAdapter> adapterProvider,
      Provider<NewsSourcesViewModel> newsSourcesViewModelProvider) {
    this.adapterProvider = adapterProvider;
    this.newsSourcesViewModelProvider = newsSourcesViewModelProvider;
  }

  public static MembersInjector<NewsSourcesFragment> create(
      Provider<NewsSourceAdapter> adapterProvider,
      Provider<NewsSourcesViewModel> newsSourcesViewModelProvider) {
    return new NewsSourcesFragment_MembersInjector(adapterProvider, newsSourcesViewModelProvider);
  }

  @Override
  public void injectMembers(NewsSourcesFragment instance) {
    injectAdapter(instance, adapterProvider.get());
    injectNewsSourcesViewModel(instance, newsSourcesViewModelProvider.get());
  }

  @InjectedFieldSignature("com.vishvendu.cleanarch.newsapp.ui.fragment.NewsSourcesFragment.adapter")
  public static void injectAdapter(NewsSourcesFragment instance, NewsSourceAdapter adapter) {
    instance.adapter = adapter;
  }

  @InjectedFieldSignature("com.vishvendu.cleanarch.newsapp.ui.fragment.NewsSourcesFragment.newsSourcesViewModel")
  public static void injectNewsSourcesViewModel(NewsSourcesFragment instance,
      NewsSourcesViewModel newsSourcesViewModel) {
    instance.newsSourcesViewModel = newsSourcesViewModel;
  }
}
