// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.di.module;

import com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceAdapter;
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
public final class FragmentModule_ProvideNewsSourceAdapterFactory implements Factory<NewsSourceAdapter> {
  private final FragmentModule module;

  public FragmentModule_ProvideNewsSourceAdapterFactory(FragmentModule module) {
    this.module = module;
  }

  @Override
  public NewsSourceAdapter get() {
    return provideNewsSourceAdapter(module);
  }

  public static FragmentModule_ProvideNewsSourceAdapterFactory create(FragmentModule module) {
    return new FragmentModule_ProvideNewsSourceAdapterFactory(module);
  }

  public static NewsSourceAdapter provideNewsSourceAdapter(FragmentModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideNewsSourceAdapter());
  }
}
