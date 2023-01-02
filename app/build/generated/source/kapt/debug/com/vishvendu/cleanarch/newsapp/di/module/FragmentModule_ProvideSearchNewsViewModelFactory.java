// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.di.module;

import com.vishvendu.cleanarch.newsapp.data.repository.SearchNewsRepository;
import com.vishvendu.cleanarch.newsapp.ui.viewmodel.SearchNewsViewModel;
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
public final class FragmentModule_ProvideSearchNewsViewModelFactory implements Factory<SearchNewsViewModel> {
  private final FragmentModule module;

  private final Provider<SearchNewsRepository> searchNewsRepositoryProvider;

  public FragmentModule_ProvideSearchNewsViewModelFactory(FragmentModule module,
      Provider<SearchNewsRepository> searchNewsRepositoryProvider) {
    this.module = module;
    this.searchNewsRepositoryProvider = searchNewsRepositoryProvider;
  }

  @Override
  public SearchNewsViewModel get() {
    return provideSearchNewsViewModel(module, searchNewsRepositoryProvider.get());
  }

  public static FragmentModule_ProvideSearchNewsViewModelFactory create(FragmentModule module,
      Provider<SearchNewsRepository> searchNewsRepositoryProvider) {
    return new FragmentModule_ProvideSearchNewsViewModelFactory(module, searchNewsRepositoryProvider);
  }

  public static SearchNewsViewModel provideSearchNewsViewModel(FragmentModule instance,
      SearchNewsRepository searchNewsRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideSearchNewsViewModel(searchNewsRepository));
  }
}