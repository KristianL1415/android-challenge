package com.myriadmobile.klien.androidchallenge.data.model.response;

import com.myriadmobile.klien.androidchallenge.data.model.Meta;

/**
 * Created by klien on 5/2/16.
 */
public class BaseResponse implements IResponse {

    public Meta meta;

    @Override
    public Meta getMeta() {
        return meta;
    }
}
