package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;
import cs.p;
import java.util.List;
import k.j0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
public interface NativeBulkAdLoadListener {
    void onAdsFailedToLoad(@l AdRequestError adRequestError);

    @p
    void onAdsLoaded(@l List<NativeAd> list);
}
