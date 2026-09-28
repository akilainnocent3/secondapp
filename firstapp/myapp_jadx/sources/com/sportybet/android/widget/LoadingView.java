package com.sportybet.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.rk30;
import defpackage.sn5;

/* JADX INFO: loaded from: classes6.dex */
public class LoadingView extends ConstraintLayout {
    public ErrorView F;
    public View G;
    public TextView H;
    public ImageView I;

    public LoadingView(Context context) {
        super(context);
        F(context, null);
    }

    public final void E() {
        if (getVisibility() == 0) {
            setVisibility(8);
            this.G.setVisibility(8);
        }
    }

    public final void F(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.spr_r_loading_view, this);
        this.G = findViewById(R.id.progress);
        this.F = (ErrorView) findViewById(R.id.error);
        this.H = (TextView) findViewById(R.id.empty);
        this.I = (ImageView) findViewById(R.id.error_icon);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.u, R.attr.loadingViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            ((ProgressBar) this.G).getIndeterminateDrawable().setColorFilter(typedArrayObtainStyledAttributes.getColor(0, 0), PorterDuff.Mode.SRC_IN);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            removeView(this.G);
            View viewInflate = LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(1, 0), (ViewGroup) this, false);
            this.G = viewInflate;
            addView(viewInflate, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void G(int i) {
        H(sn5.c(this, i, new Object[0]));
    }

    public final void H(String str) {
        setVisibility(0);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.H.setText(str);
        this.H.setVisibility(0);
        this.I.setVisibility(0);
    }

    public final void I() {
        setVisibility(0);
        this.G.setVisibility(8);
        this.F.setVisibility(0);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
    }

    public final void J(String str) {
        setVisibility(0);
        this.G.setVisibility(8);
        this.F.setVisibility(0);
        this.I.setVisibility(8);
        this.F.a(str, null, "");
        this.H.setVisibility(8);
    }

    public final void K() {
        setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(8);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
    }

    public final void L(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public TextView getEmptyView() {
        return this.H;
    }

    public ErrorView getErrorView() {
        return this.F;
    }

    public View getProgressView() {
        return this.G;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.F.setOnClickListener(onClickListener);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        F(context, attributeSet);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        F(context, attributeSet);
    }
}
