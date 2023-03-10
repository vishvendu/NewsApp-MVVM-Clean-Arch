// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.di.module;

import com.vishvendu.cleanarch.newsapp.data.repository.NewsInLanguageRepository;
import com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsInLanguageViewModel;
import com.vishvendu.cleanarch.newsapp.utils.DefaultDispatcherProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityModule_ProvideNewsInLanguageViewModelFactory implements Factory<NewsInLanguageViewModel> {
  private final ActivityModule module;

  private final Provider<NewsInLanguageRepository> newsInLanguageRepositoryProvider;

  private final Provider<DefaultDispatcherProvider> dispatcherProvider;

  public ActivityModule_ProvideNewsInLanguageViewModelFactory(ActivityModule module,
      Provider<NewsInLanguageRepository> newsInLanguageRepositoryProvider,
      Provider<DefaultDispatcherProvider> dispatcherProvider) {
    this.module = module;
    this.newsInLanguageRepositoryProvider = newsInLanguageRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public NewsInLanguageViewModel get() {
    return provideNewsInLanguageViewModel(module, newsInLanguageRepositoryProvider.get(), dispatcherProvider.get());
  }

  public static ActivityModule_ProvideNewsInLanguageViewModelFactory create(ActivityModule module,
      Provider<NewsInLanguageRepository> newsInLanguageRepositoryProvider,
      Provider<DefaultDispatcherProvider> dispatcherProvider) {
    return new ActivityModule_ProvideNewsInLanguageViewModelFactory(module, newsInLanguageRepositoryProvider, dispatcherProvider);
  }

  public static NewsInLanguageViewModel provideNewsInLanguageViewModel(ActivityModule instance,
      NewsInLanguageRepository newsInLanguageRepository,
      DefaultDispatcherProvider dispatcherProvider) {
    return Preconditions.checkNotNullFromProvides(instance.provideNewsInLanguageViewModel(newsInLanguageRepository, dispatcherProvider));
  }
}
