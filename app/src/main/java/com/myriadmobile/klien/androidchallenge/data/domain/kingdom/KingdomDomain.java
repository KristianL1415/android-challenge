package com.myriadmobile.klien.androidchallenge.data.domain.kingdom;

import com.myriadmobile.klien.androidchallenge.data.AppService;
import com.myriadmobile.klien.androidchallenge.data.model.Kingdom;
import com.myriadmobile.klien.androidchallenge.data.model.response.KingdomListResponse;

import javax.security.auth.callback.Callback;

import retrofit.RetrofitError;
import retrofit.client.Response;

public class KingdomDomain implements IKingdomDomain {

    private final AppService appService;

    public KingdomDomain(AppService appService) {
        this.appService = appService;
    }

    public final void getKingdomList(final OnKingdomListListener kingdomListListener) {
        appService.getKingdomList(new retrofit.Callback<KingdomListResponse>() {
            @Override
            public void success(KingdomListResponse kingdomListResponse, Response response) {
                kingdomListListener.onKingdomListSuccess(kingdomListResponse);
            }

            @Override
            public void failure(RetrofitError error) {
                kingdomListListener.onKingdomListFailure(new Kingdom.Error("Error retrieving kingdoms"));
            }
        });
    }
}
