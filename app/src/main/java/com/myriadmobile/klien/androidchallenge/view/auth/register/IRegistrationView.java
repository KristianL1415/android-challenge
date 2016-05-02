package com.myriadmobile.klien.androidchallenge.view.auth.register;

/**
 * Created by klien on 4/17/16.
 */
public interface IRegistrationView {
    void setNameError(String message);
    void setEmailError(String message);
    void clearErrors();
    void showProgress(String message);
    void hideProgress();
    void success();
}
