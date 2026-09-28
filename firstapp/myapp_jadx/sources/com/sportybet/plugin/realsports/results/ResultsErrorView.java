package com.sportybet.plugin.realsports.results;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.zch0;

/* JADX INFO: loaded from: classes7.dex */
public class ResultsErrorView extends LinearLayout {
    public final TextView a;

    public ResultsErrorView(Context context) {
        super(context);
        setOrientation(1);
        setPadding(zch0.a(getContext(), 60), 0, zch0.a(getContext(), 60), 0);
        setGravity(1);
        LayoutInflater.from(getContext()).inflate(R.layout.spr_results_error_view, this);
        this.a = (TextView) findViewById(R.id.results_retry);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public ResultsErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        setPadding(zch0.a(getContext(), 60), 0, zch0.a(getContext(), 60), 0);
        setGravity(1);
        LayoutInflater.from(getContext()).inflate(R.layout.spr_results_error_view, this);
        this.a = (TextView) findViewById(R.id.results_retry);
    }
}
