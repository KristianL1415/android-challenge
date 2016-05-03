package com.myriadmobile.klien.androidchallenge.view.auth.register;

import com.myriadmobile.klien.androidchallenge.view.IBaseView;

/**
 * Created by klien on 4/17/16.
 */
public interface IRegistrationView extends IBaseView {
    void setNameError(String message);
    void setEmailError(String message);
    void clearErrors();
    void showProgress(String message);
    void success();
}
