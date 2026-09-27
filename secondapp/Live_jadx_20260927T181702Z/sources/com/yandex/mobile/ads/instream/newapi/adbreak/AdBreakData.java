package com.yandex.mobile.ads.instream.newapi.adbreak;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.instream.newapi.InstreamExperimentalApi;
import dr.o;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@InstreamExperimentalApi
public interface AdBreakData {
    @l
    InstreamAdBreakPosition getAdBreakPosition();

    @l
    AdBreakRequestData getRequestData();

    @l
    String getType();

    @l
    @o(message = "")
    /* synthetic */ List getVideoAds();
}
