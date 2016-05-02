package com.myriadmobile.klien.androidchallenge.view;

import android.app.Activity;
import android.view.ViewGroup;

import static butterknife.ButterKnife.findById;

/**
 * Created by klien on 4/19/16.
 */
public interface AppContainer {
    /** The root {@link ViewGroup} into which the activity should place its contents. */
    ViewGroup get(Activity activity);

    /** An {@link AppContainer} which returns the normal activity content view. */
    AppContainer DEFAULT = new AppContainer() {
        @Override
        public ViewGroup get(Activity activity) {
            return findById(activity, android.R.id.content);
        }
    };
}
