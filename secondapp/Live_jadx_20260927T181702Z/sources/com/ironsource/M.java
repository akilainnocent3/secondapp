package com.ironsource;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final M f59462a = new M();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private static final HashMap<String, Long> f59463b = new HashMap<>();

    private M() {
    }

    @oy.l
    public final HashMap<String, Long> a() {
        return f59463b;
    }

    public final long b(@oy.l String instance) {
        kotlin.jvm.internal.m0.p(instance, "instance");
        Long l10 = f59463b.get(instance);
        if (l10 != null) {
            return System.currentTimeMillis() - l10.longValue();
        }
        return -1L;
    }

    public final long c(@oy.l String instance) {
        kotlin.jvm.internal.m0.p(instance, "instance");
        Long l10 = f59463b.get(instance);
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }

    public final boolean a(@oy.l String instance, long j10) {
        kotlin.jvm.internal.m0.p(instance, "instance");
        if (instance.length() == 0) {
            return false;
        }
        HashMap<String, Long> map = f59463b;
        if (map.containsKey(instance)) {
            return false;
        }
        map.put(instance, Long.valueOf(j10));
        return true;
    }

    public final boolean a(@oy.l String instance) {
        kotlin.jvm.internal.m0.p(instance, "instance");
        HashMap<String, Long> map = f59463b;
        if (map.get(instance) == null) {
            return false;
        }
        map.remove(instance);
        return true;
    }
}
