package com.myriadmobile.klien.androidchallenge.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.myriadmobile.klien.androidchallenge.R;
import com.myriadmobile.klien.androidchallenge.data.model.Kingdom;

import butterknife.Bind;
import butterknife.ButterKnife;

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
        init();
    }

    public KingdomCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    public KingdomCard(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init();
    }

    private void init() {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.kingdom_card, this, true);
        ButterKnife.bind(this, view);
    }

    public final void setup(Kingdom kingdom) {
        this.name = kingdom.name;
        this.image = kingdom.image;

        redraw();
    }

    private void redraw() {
        kingdomName.setText(name);

        invalidate();
        requestLayout();
    }
}
