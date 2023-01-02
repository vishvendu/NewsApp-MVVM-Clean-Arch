// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.data.repository;

import com.vishvendu.cleanarch.newsapp.data.api.NetworkService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class SearchNewsRepository_Factory implements Factory<SearchNewsRepository> {
  private final Provider<NetworkService> networkServiceProvider;

  public SearchNewsRepository_Factory(Provider<NetworkService> networkServiceProvider) {
    this.networkServiceProvider = networkServiceProvider;
  }

  @Override
  public SearchNewsRepository get() {
    return newInstance(networkServiceProvider.get());
  }

  public static SearchNewsRepository_Factory create(
      Provider<NetworkService> networkServiceProvider) {
    return new SearchNewsRepository_Factory(networkServiceProvider);
  }

  public static SearchNewsRepository newInstance(NetworkService networkService) {
    return new SearchNewsRepository(networkService);
  }
}
