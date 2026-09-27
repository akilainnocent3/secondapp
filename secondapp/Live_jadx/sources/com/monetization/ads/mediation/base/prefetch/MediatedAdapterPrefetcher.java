package com.monetization.ads.mediation.base.prefetch;

import android.content.Context;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface MediatedAdapterPrefetcher {
    void onInvalidate();

    void prefetchAd(@l Context context, @l Map<String, String> map, @l MediatedAdapterPrefetchListener mediatedAdapterPrefetchListener);
}
