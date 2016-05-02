package com.myriadmobile.klien.androidchallenge.view.auth.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.myriadmobile.klien.androidchallenge.AndroidChallengeApplication;
import com.myriadmobile.klien.androidchallenge.R;
import com.myriadmobile.klien.androidchallenge.view.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by klien on 4/17/16.
 */
public class RegistrationFragment extends BaseFragment implements IRegistrationView {

    private IRegisterPresenter registerPresenter;

    @Bind(R.id.reg_container)
    LinearLayout container;
    @Bind(R.id.et_register_name)
    EditText etName;
    @Bind(R.id.et_register_email)
    EditText etEmail;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerPresenter = new RegisterPresenter(this, AndroidChallengeApplication.getAuthService());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        ButterKnife.bind(this, view);

        setupProgressDialog("Progress loading...");

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        registerPresenter.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        registerPresenter.onPause();
    }

    @Override
    public final void setNameError(String message) {
        etName.setError(message);
        etName.requestFocus();
    }

    @Override
    public final void setEmailError(String message) {
        etEmail.setError(message);
        etEmail.requestFocus();
    }

    @Override
    public final void showProgress(String message) {
        progressDialog.setContent(message);
        progressDialog.show();
    }

    @Override
    public final void hideProgress() {
        progressDialog.dismiss();
        progressDialog.setContent("Registering...");
    }

    @Override
    public final void success() {
        // new intent
    }

    @Override
    public final void clearErrors() {
        etName.setError(null);
        etEmail.setError(null);
    }

    @OnClick(R.id.btn_register_submit)
    public final void submit(View view) {
        registerPresenter.validate(etName.getText().toString(), etEmail.getText().toString());
    }
}
