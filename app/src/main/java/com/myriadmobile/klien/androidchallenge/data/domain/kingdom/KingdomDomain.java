package com.myriadmobile.klien.androidchallenge.data.domain.kingdom;

import com.myriadmobile.klien.androidchallenge.data.AppService;

/**
 * Created by klien on 5/2/16.
 */
public class KingdomDomain implements IKingdomDomain {

    private final AppService appService;

    public KingdomDomain(AppService appService) {
        this.appService = appService;
    }
}
