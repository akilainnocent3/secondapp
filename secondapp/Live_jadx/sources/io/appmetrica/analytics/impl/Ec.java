package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f95769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f95770b;

    public Ec(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f95769a.put(obj, obj2);
    }

    public Ec(HashMap map, Object obj) {
        this.f95769a = map;
        this.f95770b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f95769a.get(obj);
        return obj2 == null ? this.f95770b : obj2;
    }
}
