package com.myriadmobile.klien.androidchallenge.view.auth.register;

import com.myriadmobile.klien.androidchallenge.view.IBasePresenter;

/**
 * Created by klien on 4/17/16.
 */
public interface IRegisterPresenter extends IBasePresenter {
    void validate(String name, String email);
}
