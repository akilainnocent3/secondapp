package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5443v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f98441a;

    public C5443v7() {
        HashMap map = new HashMap();
        this.f98441a = map;
        map.put("events", AbstractC5391t5.f98344a);
        map.put("sessions", AbstractC5441v5.f98436a);
        map.put("preferences", InterfaceC5416u5.f98398a);
        map.put("binary_data", AbstractC5366s5.f98285a);
    }
}
