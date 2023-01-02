// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.di.module;

import com.vishvendu.cleanarch.newsapp.ui.adapter.TopHeadlinesAdapter;
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
public final class FragmentModule_ProvideDummiesAdapterFactory implements Factory<TopHeadlinesAdapter> {
  private final FragmentModule module;

  public FragmentModule_ProvideDummiesAdapterFactory(FragmentModule module) {
    this.module = module;
  }

  @Override
  public TopHeadlinesAdapter get() {
    return provideDummiesAdapter(module);
  }

  public static FragmentModule_ProvideDummiesAdapterFactory create(FragmentModule module) {
    return new FragmentModule_ProvideDummiesAdapterFactory(module);
  }

  public static TopHeadlinesAdapter provideDummiesAdapter(FragmentModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideDummiesAdapter());
  }
}