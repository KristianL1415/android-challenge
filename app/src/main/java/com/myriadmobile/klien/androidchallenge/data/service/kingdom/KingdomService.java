package com.myriadmobile.klien.androidchallenge.data.service.kingdom;

import com.myriadmobile.klien.androidchallenge.data.domain.kingdom.IKingdomDomain;

/**
 * Created by klien on 5/2/16.
 */
public class KingdomService implements IKingdomService {

    private final IKingdomDomain kingdomDomain;

    public KingdomService(IKingdomDomain kingdomDomain) {
        this.kingdomDomain = kingdomDomain;
    }
}
