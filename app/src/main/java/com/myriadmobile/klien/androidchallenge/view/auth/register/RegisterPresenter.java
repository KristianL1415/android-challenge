package com.myriadmobile.klien.androidchallenge.view.auth.register;

import android.app.Fragment;
import android.text.TextUtils;

import com.myriadmobile.klien.androidchallenge.view.BasePresenter;
import com.myriadmobile.klien.androidchallenge.data.model.Auth;
import com.myriadmobile.klien.androidchallenge.data.service.auth.IAuthService;

public class RegisterPresenter extends BasePresenter implements IRegisterPresenter {

    private final IRegistrationView registrationView;
    private final IAuthService authService;

    public RegisterPresenter(IRegistrationView registrationView,
                             IAuthService authService) {
        this.registrationView = registrationView;
        this.authService = authService;
    }

    @Override
    public final void validate(String name, String email) {
        registrationView.clearErrors();

        boolean isError = false;

        if (TextUtils.isEmpty(email)) {
            registrationView.setEmailError("Email cannot be empty.");
            isError = true;
        }
        if (TextUtils.isEmpty(name)) {
            registrationView.setNameError("Name cannot be empty.");
            isError = true;
        }

        if (!isError) {
            registrationView.showProgress("Registering...");
            register(email);
        }
    }

    private void register(String email) {
        authService.register(email);
    }

    public final void onEventMainThread(Auth auth) {
        registrationView.hideProgress();
        registrationView.success();
    }

    public final void onEventMainThread(Auth.Error error) {
        registrationView.hideProgress();
    }
}
