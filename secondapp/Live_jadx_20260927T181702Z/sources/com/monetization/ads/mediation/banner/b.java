package com.monetization.ads.mediation.banner;

import android.content.Context;
import java.util.Map;
import yads.lo1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements lo1 {
    @Override // yads.lo1
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        ((MediatedBannerAdapter) aVar).onInvalidate();
    }

    @Override // yads.lo1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        ((MediatedBannerAdapter) aVar).loadBanner(context, (MediatedBannerAdapter.MediatedBannerAdapterListener) obj, map, map2);
    }
}
