package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f44540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f44541l;

    public g(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f44540k = new e(this);
        this.f44541l = new f(this);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f44514g = cVar;
        InterstitialAd interstitialAd = new InterstitialAd(o.f47884a);
        this.f44516i = interstitialAd;
        interstitialAd.setAdListener(this.f44540k);
        ((InterstitialAd) this.f44516i).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.f44516i).loadAd(adRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        Object obj = this.f44516i;
        return obj != null && ((InterstitialAd) obj).isLoaded();
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(a aVar, Activity activity) {
        this.f44105j = aVar;
        Object obj = this.f44516i;
        if (obj != null) {
            ((InterstitialAd) obj).setAdListener(this.f44541l);
            ((InterstitialAd) this.f44516i).show();
        }
    }
}
