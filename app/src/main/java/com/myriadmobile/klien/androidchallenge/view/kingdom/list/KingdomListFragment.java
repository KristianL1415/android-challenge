package com.myriadmobile.klien.androidchallenge.view.kingdom.list;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.myriadmobile.klien.androidchallenge.AndroidChallengeApplication;
import com.myriadmobile.klien.androidchallenge.R;
import com.myriadmobile.klien.androidchallenge.view.BaseFragment;

import butterknife.Bind;

/**
 * Created by klien on 5/1/16.
 */
public class KingdomListFragment extends BaseFragment implements IKingdomListView {

    private KingdomListAdapter kingdomListAdapter;
    private IKingdomListPresenter kingdomListPresenter;

    @Bind(R.id.rv_kingdomlist)
    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        kingdomListPresenter = new KingdomListPresenter(this, AndroidChallengeApplication.getKingdomService());
        kingdomListAdapter = new KingdomListAdapter(kingdomListPresenter);
    }


}
