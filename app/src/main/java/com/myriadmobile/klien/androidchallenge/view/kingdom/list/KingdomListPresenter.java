package com.myriadmobile.klien.androidchallenge.view.kingdom.list;

import com.myriadmobile.klien.androidchallenge.data.model.Kingdom;
import com.myriadmobile.klien.androidchallenge.data.model.response.KingdomListResponse;
import com.myriadmobile.klien.androidchallenge.data.service.kingdom.IKingdomService;
import com.myriadmobile.klien.androidchallenge.view.BasePresenter;

/**
 * Created by klien on 5/1/16.
 */
public class KingdomListPresenter extends BasePresenter implements IKingdomListPresenter {

    private final IKingdomListView kingdomListView;
    private final IKingdomService kingdomService;

    public KingdomListPresenter(IKingdomListView kingdomListView, IKingdomService kingdomService) {
        this.kingdomListView = kingdomListView;
        this.kingdomService = kingdomService;
    }

    public void getKingdoms() {
        kingdomService.getKingdomList();
        kingdomListView.showProgress();
    }

    public void onKingdomClicked(Kingdom kingdom) {

    }

    public void onEventMainThread(KingdomListResponse kingdomListResponse) {
        kingdomListView.hideProgress();
        kingdomListView.appendKingdoms(kingdomListResponse);
    }

    public void onEventMainThread(Kingdom.Error error) {
        kingdomListView.hideProgress();
        kingdomListView.setNetworkError(error.message);
    }
}
