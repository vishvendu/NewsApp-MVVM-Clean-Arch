// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.data.local.db;

import com.google.gson.Gson;
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
public final class Convertors_Factory implements Factory<Convertors> {
  private final Provider<Gson> gsonProvider;

  public Convertors_Factory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Convertors get() {
    return newInstance(gsonProvider.get());
  }

  public static Convertors_Factory create(Provider<Gson> gsonProvider) {
    return new Convertors_Factory(gsonProvider);
  }

  public static Convertors newInstance(Gson gson) {
    return new Convertors(gson);
  }
}