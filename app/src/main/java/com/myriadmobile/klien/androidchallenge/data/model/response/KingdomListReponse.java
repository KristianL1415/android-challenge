package com.myriadmobile.klien.androidchallenge.data.model.response;

import com.google.gson.annotations.SerializedName;
import com.myriadmobile.klien.androidchallenge.data.model.Kingdom;
import com.myriadmobile.klien.androidchallenge.data.model.Meta;

import java.util.List;

/**
 * Created by klien on 5/2/16.
 */
public class KingdomListReponse extends BaseResponse {

    @SerializedName("data")
    public List<Kingdom> kingdomList;

    public KingdomListReponse() {
    }

    public KingdomListReponse(List<Kingdom> kingdomList, Meta meta) {
        this.kingdomList = kingdomList;
        this.meta = meta;
    }
}
