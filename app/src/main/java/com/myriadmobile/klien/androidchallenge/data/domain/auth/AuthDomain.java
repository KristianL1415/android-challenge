package com.myriadmobile.klien.androidchallenge.data.domain.auth;

import com.myriadmobile.klien.androidchallenge.data.AppService;
import com.myriadmobile.klien.androidchallenge.data.model.Auth;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by klien on 4/14/16.
 */
public class AuthDomain implements IAuthDomain {

    private final AppService appService;

    public AuthDomain(AppService appService) { this.appService = appService; }

    public final void register(final String email, final OnAuthListener authListener) {
        appService.register(email, new Callback<Auth>() {
            @Override
            public void success(Auth auth, Response response) { authListener.onAuthSuccess(auth); }

            @Override
            public void failure(RetrofitError error) {
                authListener.onAuthError(new Auth.Error("Error Registering"));
            }
        });
    }
}
