package com.sportybet.plugin.realsports.results;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.gr0;
import defpackage.rk30;
import defpackage.sn5;

/* JADX INFO: loaded from: classes7.dex */
public class ResultsLoadingView extends FrameLayout {
    public ResultsErrorView a;
    public ProgressBar b;
    public TextView c;

    public ResultsLoadingView(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.spr_results_loding_view, this);
        this.b = (ProgressBar) findViewById(R.id.results_progress);
        this.a = (ResultsErrorView) findViewById(R.id.results_error);
        this.c = (TextView) findViewById(R.id.results_empty);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.u, R.attr.loadingViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.b.getIndeterminateDrawable().setColorFilter(typedArrayObtainStyledAttributes.getColor(0, 0), PorterDuff.Mode.SRC_IN);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b() {
        setVisibility(0);
        this.b.setVisibility(8);
        this.a.setVisibility(8);
        this.c.setVisibility(0);
        this.c.setText(sn5.c(this, R.string.wap_search__search_no_result, new Object[0]));
        this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, gr0.a(getContext(), R.drawable.spr_results_no_result), (Drawable) null, (Drawable) null);
    }

    public final void c() {
        setVisibility(0);
        this.b.setVisibility(8);
        this.a.setVisibility(0);
        this.c.setVisibility(8);
    }

    public final void d() {
        setVisibility(0);
        this.b.setVisibility(0);
        this.a.setVisibility(8);
        this.c.setVisibility(8);
    }

    public ResultsErrorView getErrorView() {
        return this.a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public ResultsLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ResultsLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
