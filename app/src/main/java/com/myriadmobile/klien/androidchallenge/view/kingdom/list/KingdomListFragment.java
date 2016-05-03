package com.myriadmobile.klien.androidchallenge.view.kingdom.list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.myriadmobile.klien.androidchallenge.AndroidChallengeApplication;
import com.myriadmobile.klien.androidchallenge.R;
import com.myriadmobile.klien.androidchallenge.data.model.response.KingdomListReponse;
import com.myriadmobile.klien.androidchallenge.view.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kingdomlist, container, false);
        ButterKnife.bind(this, view);
        setupProgressDialog("Loading...");

        recyclerView.setLayoutManager(
                new GridLayoutManager(recyclerView.getContext(), 1));
        recyclerView.setAdapter(kingdomListAdapter);
        // Add onScrollListener for pagination?

        if (kingdomListAdapter.getItemCount() == 0) {
            kingdomListPresenter.getKingdoms();
        }

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        kingdomListPresenter.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        kingdomListPresenter.onPause();
    }

    @Override
    public final void appendKingdoms(KingdomListReponse kingdomListReponse) {
        kingdomListAdapter.append(kingdomListReponse.kingdomList);
    }

    @Override
    public final void showProgress() {
        progressDialog.show();
    }

    @Override
    public final void hideProgress() {
        progressDialog.dismiss();
    }

    @Override
    public final void setNetworkError(String message) {
        Toast.makeText(AndroidChallengeApplication.get(), message, Toast.LENGTH_SHORT).show();
    }
}
