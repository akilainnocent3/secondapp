package com.sportybet.plugin.realsports.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public class SearchResultsErrorView extends LinearLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public SearchResultsErrorView(Context context) {
        super(context);
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(getContext()).inflate(R.layout.spr_search_results_error_view, this);
        this.a = (ImageView) findViewById(R.id.error_img);
        this.b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.retry);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public SearchResultsErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(getContext()).inflate(R.layout.spr_search_results_error_view, this);
        this.a = (ImageView) findViewById(R.id.error_img);
        this.b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.retry);
    }
}
