// Generated by view binder compiler. Do not edit!
package com.vishvendu.cleanarch.newsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vishvendu.cleanarch.newsapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SearchNewsItemLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView imageViewBanner;

  @NonNull
  public final AppCompatTextView textViewDescription;

  @NonNull
  public final AppCompatTextView textViewSource;

  @NonNull
  public final AppCompatTextView textViewTitle;

  private SearchNewsItemLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView imageViewBanner, @NonNull AppCompatTextView textViewDescription,
      @NonNull AppCompatTextView textViewSource, @NonNull AppCompatTextView textViewTitle) {
    this.rootView = rootView;
    this.imageViewBanner = imageViewBanner;
    this.textViewDescription = textViewDescription;
    this.textViewSource = textViewSource;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SearchNewsItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SearchNewsItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.search_news_item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SearchNewsItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewBanner;
      AppCompatImageView imageViewBanner = ViewBindings.findChildViewById(rootView, id);
      if (imageViewBanner == null) {
        break missingId;
      }

      id = R.id.textViewDescription;
      AppCompatTextView textViewDescription = ViewBindings.findChildViewById(rootView, id);
      if (textViewDescription == null) {
        break missingId;
      }

      id = R.id.textViewSource;
      AppCompatTextView textViewSource = ViewBindings.findChildViewById(rootView, id);
      if (textViewSource == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      AppCompatTextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new SearchNewsItemLayoutBinding((ConstraintLayout) rootView, imageViewBanner,
          textViewDescription, textViewSource, textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
