package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import dr.w2;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.List;
import nv.i;
import or.f;
import oy.l;
import oy.m;
import sp.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface ScarManager {
    @m
    Object getSignals(@m List<? extends AdFormatOuterClass.AdFormat> list, @l f<? super BiddingSignals> fVar);

    @m
    Object getVersion(@l f<? super String> fVar);

    @m
    Object loadAd(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, int i10, @l f<? super w2> fVar);

    @l
    i<GmaEventData> loadBannerAd(@l Context context, @l BannerView bannerView, @l d dVar, @l UnityBannerSize unityBannerSize, @l String str);

    @l
    i<GmaEventData> show(@l String str, @l String str2);
}
