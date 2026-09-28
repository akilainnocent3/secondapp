package com.sportybet.plugin.myfavorite.widget.viewholder;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.fragment.MyTeamFragment;
import defpackage.j2x;
import defpackage.jsd;
import defpackage.pvw;

/* JADX INFO: loaded from: classes6.dex */
public class MyTeamLeftViewHolder extends BaseViewHolder {
    private TextView count;
    private RelativeLayout myTeamLeftItem;
    private TextView subTitle;
    private TextView title;

    public MyTeamLeftViewHolder(View view) {
        super(view);
        this.title = (TextView) view.findViewById(R.id.title);
        this.subTitle = (TextView) view.findViewById(R.id.sub_title);
        this.count = (TextView) view.findViewById(R.id.count);
        this.myTeamLeftItem = (RelativeLayout) view.findViewById(R.id.my_team_left_item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setData$0(j2x j2xVar, View view) {
        MyTeamFragment myTeamFragment = j2xVar.f;
        if (myTeamFragment == null || getAdapterPosition() < 0) {
            return;
        }
        myTeamFragment.C.B1(new pvw(j2xVar, 6));
    }

    public void setData(j2x j2xVar) {
        this.title.setText(j2xVar.b);
        this.subTitle.setText(j2xVar.c);
        int i = j2xVar.d;
        TextView textView = this.count;
        if (i > 0) {
            textView.setText("" + j2xVar.d);
        } else {
            textView.setText("");
        }
        this.myTeamLeftItem.setSelected(j2xVar.e);
        this.myTeamLeftItem.setOnClickListener(new jsd(1, this, j2xVar));
    }
}
