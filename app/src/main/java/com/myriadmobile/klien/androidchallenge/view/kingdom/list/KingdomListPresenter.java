package com.myriadmobile.klien.androidchallenge.view.kingdom.list;

import com.myriadmobile.klien.androidchallenge.data.service.kingdom.IKingdomService;
import com.myriadmobile.klien.androidchallenge.view.BasePresenter;

/**
 * Created by klien on 5/1/16.
 */
public class KingdomListPresenter extends BasePresenter {

    private final IKingdomListView kingdomListView;
    private final IKingdomService kingdomService;

    public KingdomListPresenter(IKingdomListView kingdomListView, IKingdomService kingdomService) {
        this.kingdomListView = kingdomListView;
        this.kingdomService = kingdomService;
    }
}
