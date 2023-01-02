// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.di.module;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("com.vishvendu.cleanarch.newsapp.di.ActivityContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FragmentModule_ProvideContextFactory implements Factory<Context> {
  private final FragmentModule module;

  public FragmentModule_ProvideContextFactory(FragmentModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideContext(module);
  }

  public static FragmentModule_ProvideContextFactory create(FragmentModule module) {
    return new FragmentModule_ProvideContextFactory(module);
  }

  public static Context provideContext(FragmentModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideContext());
  }
}