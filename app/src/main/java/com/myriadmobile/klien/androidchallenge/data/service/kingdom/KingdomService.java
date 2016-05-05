package com.myriadmobile.klien.androidchallenge.data.service.kingdom;

import android.app.usage.UsageEvents;

import com.myriadmobile.klien.androidchallenge.data.domain.kingdom.IKingdomDomain;
import com.myriadmobile.klien.androidchallenge.data.domain.kingdom.OnKingdomListListener;
import com.myriadmobile.klien.androidchallenge.data.model.Kingdom;
import com.myriadmobile.klien.androidchallenge.data.model.response.KingdomListResponse;

import de.greenrobot.event.EventBus;

public class KingdomService implements IKingdomService, OnKingdomListListener {

    private final IKingdomDomain kingdomDomain;

    public KingdomService(IKingdomDomain kingdomDomain) {
        this.kingdomDomain = kingdomDomain;
    }

    @Override
    public final void getKingdomList() {
        kingdomDomain.getKingdomList(this);
    }

    @Override
    public final void onKingdomListSuccess(KingdomListResponse kingdomListResponse) {
        EventBus.getDefault().post(kingdomListResponse);
    }

    @Override
    public final void onKingdomListFailure(Kingdom.Error error) {
        EventBus.getDefault().post(error);
    }
}
