package com.myriadmobile.klien.androidchallenge.data;

import com.myriadmobile.klien.androidchallenge.data.model.Auth;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.POST;
import retrofit.http.Query;
import retrofit.http.Streaming;

/**
 * Created by klien on 4/14/16.
 */
public interface AppService {

    @POST("/v1/subscribe")
    void register(@Query("email") String email,
                  Callback<Auth> callback);
}
