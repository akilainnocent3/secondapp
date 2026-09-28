package com.sportybet.plugin.myfavorite.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.widget.viewholder.MyFavoriteViewHolder;
import defpackage.rww;

/* JADX INFO: loaded from: classes6.dex */
public class MyFavoriteAdapter extends BaseQuickAdapter<rww, MyFavoriteViewHolder> {
    public MyFavoriteAdapter() {
        super(R.layout.my_favorite_layout, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(MyFavoriteViewHolder myFavoriteViewHolder, rww rwwVar) {
        myFavoriteViewHolder.setData(rwwVar);
    }
}
