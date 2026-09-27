package com.fyber.inneractive.sdk.dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f44547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f44548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f44549m;

    public d(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f44547k = new a(this);
        this.f44548l = new b(this);
        this.f44549m = new c(this);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f44514g = cVar;
        RewardedAd.load(o.f47884a, "FyberRewarded", adRequest, this.f44547k);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f44516i != null;
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.f44105j = aVar;
        Object obj = this.f44516i;
        if (obj != null) {
            ((RewardedAd) obj).setFullScreenContentCallback(this.f44548l);
            ((RewardedAd) this.f44516i).show(activity, this.f44549m);
        }
    }
}
