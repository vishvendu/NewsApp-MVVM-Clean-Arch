// Generated by view binder compiler. Do not edit!
package com.vishvendu.cleanarch.newsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vishvendu.cleanarch.newsapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button country;

  @NonNull
  public final Button languages;

  @NonNull
  public final Button newsSources;

  @NonNull
  public final Button search;

  @NonNull
  public final Button topHeadlines;

  private FragmentMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button country,
      @NonNull Button languages, @NonNull Button newsSources, @NonNull Button search,
      @NonNull Button topHeadlines) {
    this.rootView = rootView;
    this.country = country;
    this.languages = languages;
    this.newsSources = newsSources;
    this.search = search;
    this.topHeadlines = topHeadlines;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.country;
      Button country = ViewBindings.findChildViewById(rootView, id);
      if (country == null) {
        break missingId;
      }

      id = R.id.languages;
      Button languages = ViewBindings.findChildViewById(rootView, id);
      if (languages == null) {
        break missingId;
      }

      id = R.id.news_sources;
      Button newsSources = ViewBindings.findChildViewById(rootView, id);
      if (newsSources == null) {
        break missingId;
      }

      id = R.id.search;
      Button search = ViewBindings.findChildViewById(rootView, id);
      if (search == null) {
        break missingId;
      }

      id = R.id.top_headlines;
      Button topHeadlines = ViewBindings.findChildViewById(rootView, id);
      if (topHeadlines == null) {
        break missingId;
      }

      return new FragmentMainBinding((ConstraintLayout) rootView, country, languages, newsSources,
          search, topHeadlines);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
