package com.myriadmobile.klien.androidchallenge.view.auth;

import android.os.Bundle;
import android.view.ViewGroup;

import com.myriadmobile.klien.androidchallenge.R;
import com.myriadmobile.klien.androidchallenge.view.AppContainer;
import com.myriadmobile.klien.androidchallenge.view.auth.register.RegistrationFragment;
import com.myriadmobile.klien.androidchallenge.view.BaseActivity;

import static butterknife.ButterKnife.findById;

public class AuthActivity extends BaseActivity {

    private ViewGroup container;

    private static AppContainer appContainer = AppContainer.DEFAULT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        container = appContainer.get(this);
        getLayoutInflater().inflate(R.layout.activity_auth, container);
        startFragment(new RegistrationFragment());
    }
}
