package com.sportybet.android.user;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.rk30;
import defpackage.sn5;

/* JADX INFO: loaded from: classes6.dex */
public class LoadingView extends FrameLayout {
    public ErrorView a;
    public ProgressBar b;

    public LoadingView(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.loading_view, this);
        this.b = (ProgressBar) findViewById(R.id.progress);
        this.a = (ErrorView) findViewById(R.id.error);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.u, R.attr.loadingViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.b.getIndeterminateDrawable().setColorFilter(typedArrayObtainStyledAttributes.getColor(0, 0), PorterDuff.Mode.SRC_IN);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(String str) {
        setVisibility(0);
        this.b.setVisibility(8);
        this.a.setVisibility(0);
        ErrorView errorView = this.a;
        TextView textView = errorView.b;
        textView.setVisibility(0);
        errorView.a.setText(sn5.c(errorView, R.string.common_functions__reload, new Object[0]));
        if (TextUtils.isEmpty(str)) {
            textView.setText(sn5.c(errorView, R.string.common_feedback__sorry_something_went_wrong, new Object[0]));
        } else {
            textView.setText(str);
        }
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
