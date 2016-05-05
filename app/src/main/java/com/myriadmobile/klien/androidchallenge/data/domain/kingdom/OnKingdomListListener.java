package com.myriadmobile.klien.androidchallenge.data.domain.kingdom;

import com.myriadmobile.klien.androidchallenge.data.model.Kingdom;
import com.myriadmobile.klien.androidchallenge.data.model.response.KingdomListResponse;

public interface OnKingdomListListener {
    void onKingdomListSuccess(KingdomListResponse kingdomListResponse);
    void onKingdomListFailure(Kingdom.Error error);
}
