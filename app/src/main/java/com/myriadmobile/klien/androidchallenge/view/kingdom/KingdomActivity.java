package com.myriadmobile.klien.androidchallenge.view.kingdom;

import android.os.Bundle;
import android.view.ViewGroup;

import com.myriadmobile.klien.androidchallenge.R;
import com.myriadmobile.klien.androidchallenge.view.AppContainer;
import com.myriadmobile.klien.androidchallenge.view.BaseActivity;
import com.myriadmobile.klien.androidchallenge.view.kingdom.list.KingdomListFragment;

/**
 * Created by klien on 5/1/16.
 */
public class KingdomActivity extends BaseActivity {

    private ViewGroup container;

    private static AppContainer appContainer = AppContainer.DEFAULT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        container = appContainer.get(this);
        getLayoutInflater().inflate(R.layout.activity_kingdom, container);
        startFragment(new KingdomListFragment());
    }
}
