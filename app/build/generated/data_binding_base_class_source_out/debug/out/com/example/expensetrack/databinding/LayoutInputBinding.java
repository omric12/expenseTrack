// Generated by view binder compiler. Do not edit!
package com.example.expensetrack.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.expensetrack.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutInputBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final EditText amountET;

  @NonNull
  public final Button cancelBTN;

  @NonNull
  public final EditText noteET;

  @NonNull
  public final Spinner spinner;

  @NonNull
  public final Button submitBTN;

  private LayoutInputBinding(@NonNull CardView rootView, @NonNull EditText amountET,
      @NonNull Button cancelBTN, @NonNull EditText noteET, @NonNull Spinner spinner,
      @NonNull Button submitBTN) {
    this.rootView = rootView;
    this.amountET = amountET;
    this.cancelBTN = cancelBTN;
    this.noteET = noteET;
    this.spinner = spinner;
    this.submitBTN = submitBTN;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutInputBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutInputBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_input, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutInputBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amountET;
      EditText amountET = ViewBindings.findChildViewById(rootView, id);
      if (amountET == null) {
        break missingId;
      }

      id = R.id.cancelBTN;
      Button cancelBTN = ViewBindings.findChildViewById(rootView, id);
      if (cancelBTN == null) {
        break missingId;
      }

      id = R.id.noteET;
      EditText noteET = ViewBindings.findChildViewById(rootView, id);
      if (noteET == null) {
        break missingId;
      }

      id = R.id.spinner;
      Spinner spinner = ViewBindings.findChildViewById(rootView, id);
      if (spinner == null) {
        break missingId;
      }

      id = R.id.submitBTN;
      Button submitBTN = ViewBindings.findChildViewById(rootView, id);
      if (submitBTN == null) {
        break missingId;
      }

      return new LayoutInputBinding((CardView) rootView, amountET, cancelBTN, noteET, spinner,
          submitBTN);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
