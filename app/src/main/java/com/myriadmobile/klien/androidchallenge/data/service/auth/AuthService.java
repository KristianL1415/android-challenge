package com.myriadmobile.klien.androidchallenge.data.service.auth;

import com.myriadmobile.klien.androidchallenge.data.domain.auth.IAuthDomain;
import com.myriadmobile.klien.androidchallenge.data.domain.auth.OnAuthListener;
import com.myriadmobile.klien.androidchallenge.data.model.Auth;

import de.greenrobot.event.EventBus;

/**
 * Created by klien on 4/17/16.
 */
public class AuthService implements IAuthService, OnAuthListener {

    private final IAuthDomain authDomain;

    public AuthService(IAuthDomain authDomain) {
        this.authDomain = authDomain;
    }

    @Override
    public final void register(String email) {
        authDomain.register(email, this);
    }

    @Override
    public final void onAuthSuccess(Auth auth) {
        // store email
        EventBus.getDefault().post(auth);
    }

    @Override
    public final void onAuthError(Auth.Error error) {
        EventBus.getDefault().post(error);
    }
}
