package com.myriadmobile.klien.androidchallenge.data;

import com.myriadmobile.klien.androidchallenge.data.model.Auth;
import com.myriadmobile.klien.androidchallenge.data.model.response.KingdomListResponse;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.GET;
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

    @GET("/v1/kingdoms")
    void getKingdomList(Callback<KingdomListResponse> callback);
}
