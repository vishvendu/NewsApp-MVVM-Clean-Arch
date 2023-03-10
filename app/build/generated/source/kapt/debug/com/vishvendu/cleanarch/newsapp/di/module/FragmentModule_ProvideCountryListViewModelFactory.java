// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.di.module;

import com.vishvendu.cleanarch.newsapp.data.repository.CountryListRepository;
import com.vishvendu.cleanarch.newsapp.ui.viewmodel.CountryListViewModel;
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
public final class FragmentModule_ProvideCountryListViewModelFactory implements Factory<CountryListViewModel> {
  private final FragmentModule module;

  private final Provider<CountryListRepository> countryListRepositoryProvider;

  private final Provider<DefaultDispatcherProvider> dispatcherProvider;

  public FragmentModule_ProvideCountryListViewModelFactory(FragmentModule module,
      Provider<CountryListRepository> countryListRepositoryProvider,
      Provider<DefaultDispatcherProvider> dispatcherProvider) {
    this.module = module;
    this.countryListRepositoryProvider = countryListRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public CountryListViewModel get() {
    return provideCountryListViewModel(module, countryListRepositoryProvider.get(), dispatcherProvider.get());
  }

  public static FragmentModule_ProvideCountryListViewModelFactory create(FragmentModule module,
      Provider<CountryListRepository> countryListRepositoryProvider,
      Provider<DefaultDispatcherProvider> dispatcherProvider) {
    return new FragmentModule_ProvideCountryListViewModelFactory(module, countryListRepositoryProvider, dispatcherProvider);
  }

  public static CountryListViewModel provideCountryListViewModel(FragmentModule instance,
      CountryListRepository countryListRepository, DefaultDispatcherProvider dispatcherProvider) {
    return Preconditions.checkNotNullFromProvides(instance.provideCountryListViewModel(countryListRepository, dispatcherProvider));
  }
}
