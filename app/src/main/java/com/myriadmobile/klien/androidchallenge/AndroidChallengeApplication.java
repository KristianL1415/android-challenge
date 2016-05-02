package com.myriadmobile.klien.androidchallenge;

import android.app.Application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.myriadmobile.klien.androidchallenge.data.AppService;
import com.myriadmobile.klien.androidchallenge.data.domain.auth.AuthDomain;
import com.myriadmobile.klien.androidchallenge.data.domain.auth.IAuthDomain;
import com.myriadmobile.klien.androidchallenge.data.domain.kingdom.IKingdomDomain;
import com.myriadmobile.klien.androidchallenge.data.domain.kingdom.KingdomDomain;
import com.myriadmobile.klien.androidchallenge.data.service.auth.AuthService;
import com.myriadmobile.klien.androidchallenge.data.service.auth.IAuthService;
import com.myriadmobile.klien.androidchallenge.data.service.kingdom.IKingdomService;
import com.myriadmobile.klien.androidchallenge.data.service.kingdom.KingdomService;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Created by klien on 4/17/16.
 */
public class AndroidChallengeApplication extends Application {

    private static AndroidChallengeApplication app;
    private static IAuthDomain authDomain;
    private static IAuthService authService;
    private static IKingdomDomain kingdomDomain;
    private static IKingdomService kingdomService;
    private static final String API_URL = "https://challenge2015.myriadapps.com/api";

    @Override
    public void onCreate()
    {
        super.onCreate();
        app = this;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API_URL)
                .setConverter(new GsonConverter(gson))
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        AppService service = restAdapter.create(AppService.class);
        
        authDomain = new AuthDomain(service);
        authService = new AuthService(authDomain);
        kingdomDomain = new KingdomDomain(service);
        kingdomService = new KingdomService(kingdomDomain);
    }

    public static AndroidChallengeApplication get() { return app; }
    public static IAuthService getAuthService() { return authService; }
    public static IKingdomService getKingdomService() { return kingdomService; }
}
