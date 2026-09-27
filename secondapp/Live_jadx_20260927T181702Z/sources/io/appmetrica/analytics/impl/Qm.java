package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f96402a;

    public Qm() {
        HashMap map = new HashMap();
        this.f96402a = map;
        Km km2 = new Km();
        Lm lm2 = new Lm();
        Mm mm2 = new Mm();
        Nm nm2 = new Nm();
        map.put(C5183km.class, km2);
        map.put(U1.class, lm2);
        map.put(C5021ef.class, mm2);
        map.put(C5389t3.class, nm2);
    }

    public static Rm a(Class cls) {
        return (Rm) Pm.f96350a.f96402a.get(cls);
    }
}
