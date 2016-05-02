package com.myriadmobile.klien.androidchallenge.view.kingdom.list;

import com.myriadmobile.klien.androidchallenge.data.model.Kingdom;
import com.myriadmobile.klien.androidchallenge.view.IBasePresenter;

/**
 * Created by klien on 5/1/16.
 */
public interface IKingdomListPresenter extends IBasePresenter {
    void getKingdoms();
    void onKingdomClicked(Kingdom kingdom);
}
