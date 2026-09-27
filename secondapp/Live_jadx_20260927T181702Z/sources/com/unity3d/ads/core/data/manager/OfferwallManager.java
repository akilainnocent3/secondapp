package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import dr.w2;
import nv.i;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface OfferwallManager {
    @m
    Object getVersion(@l f<? super String> fVar);

    @m
    Object isAdReady(@l String str, @l f<? super Boolean> fVar);

    @m
    Object isConnected(@l f<? super Boolean> fVar);

    @m
    Object loadAd(@l String str, @l f<? super w2> fVar);

    @l
    i<OfferwallEventData> showAd(@l String str);
}
