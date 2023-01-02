// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.di.module;

import com.vishvendu.cleanarch.newsapp.ui.adapter.SearchNewsAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FragmentModule_ProvideSearchNewsAdapterFactory implements Factory<SearchNewsAdapter> {
  private final FragmentModule module;

  public FragmentModule_ProvideSearchNewsAdapterFactory(FragmentModule module) {
    this.module = module;
  }

  @Override
  public SearchNewsAdapter get() {
    return provideSearchNewsAdapter(module);
  }

  public static FragmentModule_ProvideSearchNewsAdapterFactory create(FragmentModule module) {
    return new FragmentModule_ProvideSearchNewsAdapterFactory(module);
  }

  public static SearchNewsAdapter provideSearchNewsAdapter(FragmentModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSearchNewsAdapter());
  }
}
