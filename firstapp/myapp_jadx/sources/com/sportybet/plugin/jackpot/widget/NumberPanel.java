package com.sportybet.plugin.jackpot.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import defpackage.s6p;

/* JADX INFO: loaded from: classes4.dex */
public class NumberPanel extends RelativeLayout implements View.OnClickListener {
    public s6p a;
    public RecyclerView b;

    public NumberPanel() {
        throw null;
    }

    public NumberPanel(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.jackpot_numbers_list, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.numbers_recycler_view);
        this.b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s6p s6pVar = this.a;
        if (s6pVar != null) {
            if (s6pVar.a.isShowing()) {
                s6pVar.a.dismiss();
            }
            s6pVar.F.setChecked(false);
        }
    }

    public NumberPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
