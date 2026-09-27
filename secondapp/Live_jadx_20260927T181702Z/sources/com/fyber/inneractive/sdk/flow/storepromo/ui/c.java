package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f44969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f44970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Animation f44971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Animation f44972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f44973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.b f44974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f44975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44976h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f44977i = new a(this);

    public c(Context context, View view, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        float f10;
        this.f44969a = view;
        this.f44971c = AnimationUtils.loadAnimation(context, R.anim.store_promo_appear_anim);
        this.f44972d = AnimationUtils.loadAnimation(context, R.anim.store_promo_disappear_anim);
        o oVar = IAConfigManager.O.f44311u.f44480b;
        oVar.getClass();
        try {
            f10 = Float.parseFloat(oVar.a("dtx_store_promo_height", Float.toString(0.7f)));
        } catch (Throwable unused) {
            f10 = 0.7f;
        }
        this.f44975g = Math.max(f10, 0.7f);
        this.f44974f = bVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.dt_store_promo_layout, (ViewGroup) null);
        this.f44970b = viewGroup;
        viewGroup.setOnClickListener(null);
        this.f44970b.setBackgroundColor(context.getResources().getColor(R.color.dtx_store_promo_bg_fade));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        this.f44969a.setLayoutParams(layoutParams2);
        this.f44970b.setVisibility(8);
        ViewGroup viewGroup2 = this.f44970b;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
            this.f44970b.addView(this.f44969a);
        }
        if (this.f44973e == null) {
            b bVar2 = new b(this);
            this.f44973e = bVar2;
            com.fyber.inneractive.sdk.util.o.f47884a.registerReceiver(bVar2, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    public final void a() {
        View view;
        int iC = com.fyber.inneractive.sdk.util.o.c();
        if (iC == this.f44976h || (view = this.f44969a) == null || view.getLayoutParams() == null) {
            return;
        }
        this.f44976h = iC;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f44969a.getLayoutParams();
        layoutParams.height = iC == 2 ? com.fyber.inneractive.sdk.util.o.e() : (int) (com.fyber.inneractive.sdk.util.o.d() * this.f44975g);
        this.f44969a.setLayoutParams(layoutParams);
    }
}
