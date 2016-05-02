package com.myriadmobile.klien.androidchallenge.view;

import android.app.Fragment;

import com.afollestad.materialdialogs.MaterialDialog;
import com.myriadmobile.klien.androidchallenge.R;

/**
 * Created by klien on 4/17/16.
 */
public abstract class BaseFragment extends Fragment {

    protected MaterialDialog progressDialog;

    public final void setupProgressDialog(String message) {
        if (progressDialog != null)
            return;
        progressDialog = new MaterialDialog.Builder(getActivity())
                .content(message)
                .progress(true, 0)
                .widgetColorRes(R.color.outstandingBlue)
                .build();
    }
}
