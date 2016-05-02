package com.myriadmobile.klien.androidchallenge.view.kingdom.list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.myriadmobile.klien.androidchallenge.data.model.Kingdom;
import com.myriadmobile.klien.androidchallenge.view.custom.KingdomCard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by klien on 5/1/16.
 */
public class KingdomListAdapter extends RecyclerView.Adapter<KingdomListAdapter.ViewHolder> {

    private final IKingdomListPresenter kingdomListPresenter;
    private final List<Kingdom> kingdomList;

    public KingdomListAdapter(IKingdomListPresenter kingdomListPresenter) {
        this.kingdomListPresenter = kingdomListPresenter;
        this.kingdomList = new ArrayList<>();
    }

    public final void append(List<Kingdom> kingdoms) {
        // If pagination is used, pass pagination object here
        this.kingdomList.clear();
        this.kingdomList.addAll(kingdoms);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = new KingdomCard(parent.getContext());
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        KingdomCard kingdomCard = holder.kingdomCard;
        kingdomCard.setup(kingdomList.get(position));
        // TODO onClick
    }

    @Override
    public int getItemCount() { return kingdomList.size(); }

    protected static class ViewHolder extends RecyclerView.ViewHolder {

        public final KingdomCard kingdomCard;

        public ViewHolder(View itemView) {
            super(itemView);
            kingdomCard = (KingdomCard) itemView;
        }
    }
}
