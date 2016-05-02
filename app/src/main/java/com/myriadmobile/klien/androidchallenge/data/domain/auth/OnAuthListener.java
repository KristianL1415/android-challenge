package com.myriadmobile.klien.androidchallenge.data.domain.auth;

import com.myriadmobile.klien.androidchallenge.data.model.Auth;

/**
 * Created by klien on 4/17/16.
 */
public interface OnAuthListener {
    void onAuthSuccess(Auth auth);
    void onAuthError(Auth.Error error);
}
