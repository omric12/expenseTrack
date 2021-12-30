// Generated by view binder compiler. Do not edit!
package com.example.expensetrack.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.expensetrack.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final FloatingActionButton FAB;

  @NonNull
  public final Toolbar toolbarTB;

  @NonNull
  public final TextView totalSpentTV;

  @NonNull
  public final RecyclerView transactionsRV;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull FloatingActionButton FAB,
      @NonNull Toolbar toolbarTB, @NonNull TextView totalSpentTV,
      @NonNull RecyclerView transactionsRV) {
    this.rootView = rootView;
    this.FAB = FAB;
    this.toolbarTB = toolbarTB;
    this.totalSpentTV = totalSpentTV;
    this.transactionsRV = transactionsRV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.FAB;
      FloatingActionButton FAB = ViewBindings.findChildViewById(rootView, id);
      if (FAB == null) {
        break missingId;
      }

      id = R.id.toolbarTB;
      Toolbar toolbarTB = ViewBindings.findChildViewById(rootView, id);
      if (toolbarTB == null) {
        break missingId;
      }

      id = R.id.totalSpentTV;
      TextView totalSpentTV = ViewBindings.findChildViewById(rootView, id);
      if (totalSpentTV == null) {
        break missingId;
      }

      id = R.id.transactionsRV;
      RecyclerView transactionsRV = ViewBindings.findChildViewById(rootView, id);
      if (transactionsRV == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, FAB, toolbarTB, totalSpentTV,
          transactionsRV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}