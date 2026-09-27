package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import java.util.Map;
import yads.lo1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements lo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediatedInterstitialAdapter f71886a;

    @Override // yads.lo1
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        ((MediatedInterstitialAdapter) aVar).onInvalidate();
    }

    @Override // yads.lo1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedInterstitialAdapter mediatedInterstitialAdapter = (MediatedInterstitialAdapter) aVar;
        this.f71886a = mediatedInterstitialAdapter;
        mediatedInterstitialAdapter.loadInterstitial(context, (MediatedInterstitialAdapter.MediatedInterstitialAdapterListener) obj, map, map2);
    }
}
