package com.myriadmobile.klien.androidchallenge.data.model.response;

import com.google.gson.annotations.SerializedName;
import com.myriadmobile.klien.androidchallenge.data.model.Kingdom;
import com.myriadmobile.klien.androidchallenge.data.model.Meta;

import java.util.List;

public class KingdomListResponse extends BaseResponse {

    @SerializedName("")
    public List<Kingdom> kingdomList;

    public KingdomListResponse() {
    }

    public KingdomListResponse(List<Kingdom> kingdomList) {
        this.kingdomList = kingdomList;
    }

    public KingdomListResponse(List<Kingdom> kingdomList, Meta meta) {
        this.kingdomList = kingdomList;
        this.meta = meta;
    }
}
