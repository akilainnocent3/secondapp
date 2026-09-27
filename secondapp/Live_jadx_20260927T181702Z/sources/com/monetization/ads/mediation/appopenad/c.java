package com.monetization.ads.mediation.appopenad;

import android.content.Context;
import java.util.Map;
import yads.lo1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements lo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediatedAppOpenAdAdapter f71848a;

    @Override // yads.lo1
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        ((MediatedAppOpenAdAdapter) aVar).onInvalidate();
    }

    @Override // yads.lo1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedAppOpenAdAdapter mediatedAppOpenAdAdapter = (MediatedAppOpenAdAdapter) aVar;
        this.f71848a = mediatedAppOpenAdAdapter;
        mediatedAppOpenAdAdapter.loadAppOpenAd(context, (MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener) obj, map, map2);
    }
}
