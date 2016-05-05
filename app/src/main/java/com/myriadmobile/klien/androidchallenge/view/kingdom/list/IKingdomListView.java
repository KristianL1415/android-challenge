package com.myriadmobile.klien.androidchallenge.view.kingdom.list;

import com.myriadmobile.klien.androidchallenge.data.model.response.KingdomListResponse;
import com.myriadmobile.klien.androidchallenge.view.IBaseView;

/**
 * Created by klien on 5/1/16.
 */
public interface IKingdomListView extends IBaseView {
    void appendKingdoms(KingdomListResponse kingdomListResponse);
}
