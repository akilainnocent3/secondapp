package com.monetization.ads.mediation.base.prefetch;

import com.monetization.ads.mediation.base.prefetch.model.MediatedPrefetchAdapterData;
import k.j0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface MediatedAdapterPrefetchListener {
    @j0
    void onPrefetchFailed(@m Integer num, @m String str);

    @j0
    void onPrefetched(@l MediatedPrefetchAdapterData mediatedPrefetchAdapterData);
}
