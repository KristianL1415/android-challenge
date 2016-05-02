package com.myriadmobile.klien.androidchallenge.view;

import de.greenrobot.event.EventBus;

/**
 * Created by klien on 4/17/16.
 */
public abstract class BasePresenter {

    public void onResume() { EventBus.getDefault().register(this); }

    public void onPause() { EventBus.getDefault().unregister(this); }
}
