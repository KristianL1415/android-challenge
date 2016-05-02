package com.myriadmobile.klien.androidchallenge.data.domain.auth;

/**
 * Created by klien on 4/14/16.
 */
public interface IAuthDomain {
    void register(String email, OnAuthListener listener);
}
