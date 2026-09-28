package com.sportybet.plugin.jackpot.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ErrorView;
import com.sportybet.plugin.jackpot.data.AdsData;
import defpackage.ba3;
import defpackage.lo0;
import defpackage.rk30;
import defpackage.su5;
import defpackage.t5p;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationBarLoadingView extends FrameLayout {
    public static final /* synthetic */ int y = 0;
    public ErrorView a;
    public ProgressBar b;
    public TextView c;
    public LinearLayout d;
    public AspectRatioImageView e;
    public TextView f;
    public TextView i;
    public final lo0 v;
    public su5<BaseResponse<AdsData>> w;

    public NavigationBarLoadingView(Context context) {
        super(context);
        this.v = t5p.a();
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.jap_navigation_bar_loading_view, this);
        this.b = (ProgressBar) findViewById(R.id.progress);
        this.a = (ErrorView) findViewById(R.id.error);
        this.c = (TextView) findViewById(R.id.empty);
        this.f = (TextView) findViewById(R.id.empty1);
        this.i = (TextView) findViewById(R.id.empty2);
        this.d = (LinearLayout) findViewById(R.id.entry_container);
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) findViewById(R.id.banner_ad);
        this.e = aspectRatioImageView;
        aspectRatioImageView.setAspectRatio(0.24840765f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.u, R.attr.loadingViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.b.getIndeterminateDrawable().setColorFilter(typedArrayObtainStyledAttributes.getColor(0, 0), PorterDuff.Mode.SRC_IN);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b() {
        setVisibility(0);
        this.b.setVisibility(8);
        this.a.setVisibility(0);
        this.c.setVisibility(8);
        this.f.setVisibility(8);
        this.i.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    public final void c() {
        setVisibility(0);
        this.b.setVisibility(0);
        this.a.setVisibility(8);
        this.c.setVisibility(8);
        this.f.setVisibility(8);
        this.i.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    public final void d(ba3 ba3Var) {
        super.setOnClickListener(ba3Var);
    }

    public ErrorView getErrorView() {
        return this.a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public NavigationBarLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = t5p.a();
        a(context, attributeSet);
    }

    public NavigationBarLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v = t5p.a();
        a(context, attributeSet);
    }
}
