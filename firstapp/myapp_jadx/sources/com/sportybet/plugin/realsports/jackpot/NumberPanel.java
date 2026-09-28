package com.sportybet.plugin.realsports.jackpot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import defpackage.r6p;

/* JADX INFO: loaded from: classes7.dex */
public class NumberPanel extends RelativeLayout implements View.OnClickListener {
    public RecyclerView a;
    public r6p b;

    public NumberPanel() {
        throw null;
    }

    public NumberPanel(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.jackpot_numbers_list, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.numbers_recycler_view);
        this.a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r6p r6pVar = this.b;
        if (r6pVar != null) {
            if (r6pVar.I.isShowing()) {
                r6pVar.I.dismiss();
            }
            r6pVar.E.setChecked(false);
        }
    }

    public NumberPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
