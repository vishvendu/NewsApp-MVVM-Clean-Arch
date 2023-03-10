// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.ui.fragment;

import com.vishvendu.cleanarch.newsapp.ui.adapter.TopHeadlinesAdapter;
import com.vishvendu.cleanarch.newsapp.ui.viewmodel.TopHeadlinesViewModel;
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
public final class TopHeadlinesFragment_MembersInjector implements MembersInjector<TopHeadlinesFragment> {
  private final Provider<TopHeadlinesAdapter> adapterProvider;

  private final Provider<TopHeadlinesViewModel> topHeadlinesViewModelProvider;

  public TopHeadlinesFragment_MembersInjector(Provider<TopHeadlinesAdapter> adapterProvider,
      Provider<TopHeadlinesViewModel> topHeadlinesViewModelProvider) {
    this.adapterProvider = adapterProvider;
    this.topHeadlinesViewModelProvider = topHeadlinesViewModelProvider;
  }

  public static MembersInjector<TopHeadlinesFragment> create(
      Provider<TopHeadlinesAdapter> adapterProvider,
      Provider<TopHeadlinesViewModel> topHeadlinesViewModelProvider) {
    return new TopHeadlinesFragment_MembersInjector(adapterProvider, topHeadlinesViewModelProvider);
  }

  @Override
  public void injectMembers(TopHeadlinesFragment instance) {
    injectAdapter(instance, adapterProvider.get());
    injectTopHeadlinesViewModel(instance, topHeadlinesViewModelProvider.get());
  }

  @InjectedFieldSignature("com.vishvendu.cleanarch.newsapp.ui.fragment.TopHeadlinesFragment.adapter")
  public static void injectAdapter(TopHeadlinesFragment instance, TopHeadlinesAdapter adapter) {
    instance.adapter = adapter;
  }

  @InjectedFieldSignature("com.vishvendu.cleanarch.newsapp.ui.fragment.TopHeadlinesFragment.topHeadlinesViewModel")
  public static void injectTopHeadlinesViewModel(TopHeadlinesFragment instance,
      TopHeadlinesViewModel topHeadlinesViewModel) {
    instance.topHeadlinesViewModel = topHeadlinesViewModel;
  }
}
