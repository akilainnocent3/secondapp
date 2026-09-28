package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ErrorView;
import defpackage.rk30;

/* JADX INFO: loaded from: classes7.dex */
public class FloatLoadingView extends FrameLayout {
    public ErrorView a;
    public TextView b;
    public View c;

    public FloatLoadingView(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        View.inflate(context, R.layout.spr_float_loading_view, this);
        this.a = (ErrorView) findViewById(R.id.error);
        this.b = (TextView) findViewById(R.id.empty);
        View viewFindViewById = findViewById(R.id.pg_container);
        this.c = viewFindViewById;
        ProgressBar progressBar = (ProgressBar) viewFindViewById.findViewById(R.id.progress_bar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.u, R.attr.loadingViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            progressBar.getIndeterminateDrawable().setColorFilter(typedArrayObtainStyledAttributes.getColor(0, 0), PorterDuff.Mode.SRC_IN);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public ErrorView getErrorView() {
        return this.a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public FloatLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public FloatLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
