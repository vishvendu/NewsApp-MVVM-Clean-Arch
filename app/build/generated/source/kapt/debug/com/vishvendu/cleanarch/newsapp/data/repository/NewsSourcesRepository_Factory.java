// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.data.repository;

import com.vishvendu.cleanarch.newsapp.data.api.NetworkService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsSourcesRepository_Factory implements Factory<NewsSourcesRepository> {
  private final Provider<NetworkService> networkServiceProvider;

  public NewsSourcesRepository_Factory(Provider<NetworkService> networkServiceProvider) {
    this.networkServiceProvider = networkServiceProvider;
  }

  @Override
  public NewsSourcesRepository get() {
    return newInstance(networkServiceProvider.get());
  }

  public static NewsSourcesRepository_Factory create(
      Provider<NetworkService> networkServiceProvider) {
    return new NewsSourcesRepository_Factory(networkServiceProvider);
  }

  public static NewsSourcesRepository newInstance(NetworkService networkService) {
    return new NewsSourcesRepository(networkService);
  }
}
