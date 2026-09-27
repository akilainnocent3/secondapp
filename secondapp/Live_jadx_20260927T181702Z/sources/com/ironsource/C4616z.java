package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4616z implements InterfaceC4419n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final P8 f64543a;

    public C4616z(@oy.l P8 sessionDepthService) {
        kotlin.jvm.internal.m0.p(sessionDepthService, "sessionDepthService");
        this.f64543a = sessionDepthService;
    }

    @Override // com.ironsource.InterfaceC4419n7
    public void a(@oy.l Map<String, Object> output) {
        kotlin.jvm.internal.m0.p(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Q6.J0, Integer.valueOf(this.f64543a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(Q6.J0, Integer.valueOf(this.f64543a.a(LevelPlay.AdFormat.REWARDED)));
        output.put(Q6.G0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(Q6.J0, Integer.valueOf(this.f64543a.a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(Q6.J0, Integer.valueOf(this.f64543a.a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}
