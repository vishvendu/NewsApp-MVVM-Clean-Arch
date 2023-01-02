// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("com.vishvendu.cleanarch.newsapp.di.NetworkBASEURL")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideBaseURLFactory implements Factory<String> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideBaseURLFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideBaseURL(module);
  }

  public static ApplicationModule_ProvideBaseURLFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideBaseURLFactory(module);
  }

  public static String provideBaseURL(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBaseURL());
  }
}
