// Generated by Dagger (https://dagger.dev).
package com.vishvendu.cleanarch.newsapp.di.module;

import com.vishvendu.cleanarch.newsapp.ui.adapter.CountryListAdapter;
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
public final class FragmentModule_ProvideCountryListAdapterFactory implements Factory<CountryListAdapter> {
  private final FragmentModule module;

  public FragmentModule_ProvideCountryListAdapterFactory(FragmentModule module) {
    this.module = module;
  }

  @Override
  public CountryListAdapter get() {
    return provideCountryListAdapter(module);
  }

  public static FragmentModule_ProvideCountryListAdapterFactory create(FragmentModule module) {
    return new FragmentModule_ProvideCountryListAdapterFactory(module);
  }

  public static CountryListAdapter provideCountryListAdapter(FragmentModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCountryListAdapter());
  }
}
