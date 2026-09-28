package com.sportybet.plugin.myfavorite.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ErrorView;
import defpackage.qh20;
import defpackage.rk30;

/* JADX INFO: loaded from: classes6.dex */
public class LoadingView extends FrameLayout {
    public ErrorView a;
    public ProgressBar b;
    public LinearLayout c;

    public LoadingView(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.my_favorite_loading_view, this);
        this.b = (ProgressBar) findViewById(R.id.progress);
        this.a = (ErrorView) findViewById(R.id.error);
        this.c = (LinearLayout) findViewById(R.id.error_layout);
        this.a.getButton().setVisibility(4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.u, R.attr.loadingViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.b.getIndeterminateDrawable().setColorFilter(typedArrayObtainStyledAttributes.getColor(0, 0), PorterDuff.Mode.SRC_IN);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(qh20 qh20Var) {
        super.setOnClickListener(qh20Var);
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
        a(context, attributeSet);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
