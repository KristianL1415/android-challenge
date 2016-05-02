package com.myriadmobile.klien.androidchallenge.view;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.myriadmobile.klien.androidchallenge.R;

/**
 * Created by klien on 4/17/16.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        AndroidChallengeApplication.get().inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Register EventBus defaults
    }

    @Override
    protected void onPause() {
        super.onPause();
        // unregister EventBus
    }

    protected void startFragment(Fragment fragment) {
        getFragmentManager().beginTransaction()
                .add(R.id.frame_container, fragment)
                .commit();
    }

    protected void removeFragment() {
        Fragment fragment = getFragmentManager().findFragmentById(R.id.frame_container);
        getFragmentManager()
                .beginTransaction()
                .remove(fragment)
                .commit();
    }
}
