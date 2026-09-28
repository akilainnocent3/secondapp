package com.sportybet.plugin.myfavorite.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.widget.viewholder.MyTeamLeftViewHolder;
import defpackage.j2x;

/* JADX INFO: loaded from: classes6.dex */
public class MyTeamLeftAdapter extends BaseQuickAdapter<j2x, MyTeamLeftViewHolder> {
    public MyTeamLeftAdapter() {
        super(R.layout.my_team_left_layout, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(MyTeamLeftViewHolder myTeamLeftViewHolder, j2x j2xVar) {
        myTeamLeftViewHolder.setData(j2xVar);
    }
}
