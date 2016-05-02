package com.myriadmobile.klien.androidchallenge.view.custom;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.myriadmobile.klien.androidchallenge.R;
import com.myriadmobile.klien.androidchallenge.data.model.Kingdom;

import butterknife.Bind;

/**
 * Created by klien on 5/1/16.
 */
public class KingdomCard extends FrameLayout {

    private final Context context;
    private String name;
    private String image;

    @Bind(R.id.tv_kingdom_name)
    TextView kingdomName;

    public KingdomCard(Context context) {
        super(context);
        this.context = context;
    }

    public final void setup(Kingdom kingdom) {
        this.name = kingdom.name;
        this.image = kingdom.image;
    }
}
