package com.sportybet.plugin.realsports.widget;

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

/* JADX INFO: loaded from: classes6.dex */
public class LoadingViewWithHint extends FrameLayout {
    public ErrorView a;
    public ProgressBar b;
    public TextView c;
    public TextView d;

    public LoadingViewWithHint(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.spr_r_loading_view_with_hint, this);
        this.b = (ProgressBar) findViewById(R.id.progress);
        this.a = (ErrorView) findViewById(R.id.error);
        this.c = (TextView) findViewById(R.id.empty);
        this.d = (TextView) findViewById(R.id.older_hint);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.u, R.attr.loadingViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.b.getIndeterminateDrawable().setColorFilter(typedArrayObtainStyledAttributes.getColor(0, 0), PorterDuff.Mode.SRC_IN);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public ErrorView getErrorView() {
        return this.a;
    }

    public TextView getHintView() {
        return this.d;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public LoadingViewWithHint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public LoadingViewWithHint(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
