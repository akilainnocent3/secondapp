package com.sportygames.roulette.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public class LoadingView extends LinearLayout {

    public class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    public LoadingView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.sg_rut_loading, this);
        setOnClickListener(new a());
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.sg_rut_loading, this);
        setOnClickListener(new a());
    }
}
