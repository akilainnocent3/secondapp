package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.md, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4405md implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f62370a;

    public C4405md(@oy.l String placementName) {
        kotlin.jvm.internal.m0.p(placementName, "placementName");
        this.f62370a = placementName;
    }

    @Override // com.ironsource.D0
    @oy.l
    public Map<String, Object> a(@oy.m B0 b10) {
        HashMap map = new HashMap();
        map.put("placement", this.f62370a);
        return map;
    }
}
