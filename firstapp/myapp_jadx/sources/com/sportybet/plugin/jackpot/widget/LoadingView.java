package com.sportybet.plugin.jackpot.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ErrorView;
import defpackage.rk30;

/* JADX INFO: loaded from: classes4.dex */
public class LoadingView extends FrameLayout {
    public ErrorView a;
    public ProgressBar b;
    public TextView c;

    public LoadingView(Context context) {
        super(context);
        b(context, null);
    }

    public final void a() {
        setVisibility(8);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.jap_loading_view, this);
        this.b = (ProgressBar) findViewById(R.id.progress);
        this.a = (ErrorView) findViewById(R.id.error);
        this.c = (TextView) findViewById(R.id.empty);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.u, R.attr.loadingViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.b.getIndeterminateDrawable().setColorFilter(typedArrayObtainStyledAttributes.getColor(0, 0), PorterDuff.Mode.SRC_IN);
        }
        typedArrayObtainStyledAttributes.recycle();
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

    public final void e() {
        super.setOnClickListener(null);
    }

    public ErrorView getErrorView() {
        return this.a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context, attributeSet);
    }
}
