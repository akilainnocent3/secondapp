package com.ironsource;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.xd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4596xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final Map<String, List<String>> f64452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final Map<String, List<String>> f64453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final Map<String, List<String>> f64454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    private final Map<String, List<String>> f64455d;

    public C4596xd() {
        this(null, null, null, null, 15, null);
    }

    @oy.m
    public final Map<String, List<String>> a() {
        return this.f64452a;
    }

    @oy.m
    public final Map<String, List<String>> b() {
        return this.f64453b;
    }

    @oy.m
    public final Map<String, List<String>> c() {
        return this.f64454c;
    }

    @oy.m
    public final Map<String, List<String>> d() {
        return this.f64455d;
    }

    @oy.m
    public final Map<String, List<String>> e() {
        return this.f64454c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4596xd)) {
            return false;
        }
        C4596xd c4596xd = (C4596xd) obj;
        return kotlin.jvm.internal.m0.g(this.f64452a, c4596xd.f64452a) && kotlin.jvm.internal.m0.g(this.f64453b, c4596xd.f64453b) && kotlin.jvm.internal.m0.g(this.f64454c, c4596xd.f64454c) && kotlin.jvm.internal.m0.g(this.f64455d, c4596xd.f64455d);
    }

    @oy.m
    public final Map<String, List<String>> f() {
        return this.f64453b;
    }

    @oy.m
    public final Map<String, List<String>> g() {
        return this.f64455d;
    }

    @oy.m
    public final Map<String, List<String>> h() {
        return this.f64452a;
    }

    public int hashCode() {
        Map<String, List<String>> map = this.f64452a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, List<String>> map2 = this.f64453b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, List<String>> map3 = this.f64454c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, List<String>> map4 = this.f64455d;
        return iHashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    @oy.l
    public String toString() {
        return "ProviderOrder2(rewarded=" + this.f64452a + ", interstitial=" + this.f64453b + ", banner=" + this.f64454c + ", nativeAd=" + this.f64455d + gi.j.f86771d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4596xd(@oy.m Map<String, ? extends List<String>> map, @oy.m Map<String, ? extends List<String>> map2, @oy.m Map<String, ? extends List<String>> map3, @oy.m Map<String, ? extends List<String>> map4) {
        this.f64452a = map;
        this.f64453b = map2;
        this.f64454c = map3;
        this.f64455d = map4;
    }

    @oy.l
    public final C4596xd a(@oy.m Map<String, ? extends List<String>> map, @oy.m Map<String, ? extends List<String>> map2, @oy.m Map<String, ? extends List<String>> map3, @oy.m Map<String, ? extends List<String>> map4) {
        return new C4596xd(map, map2, map3, map4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4596xd a(C4596xd c4596xd, Map map, Map map2, Map map3, Map map4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = c4596xd.f64452a;
        }
        if ((i10 & 2) != 0) {
            map2 = c4596xd.f64453b;
        }
        if ((i10 & 4) != 0) {
            map3 = c4596xd.f64454c;
        }
        if ((i10 & 8) != 0) {
            map4 = c4596xd.f64455d;
        }
        return c4596xd.a(map, map2, map3, map4);
    }

    public /* synthetic */ C4596xd(Map map, Map map2, Map map3, Map map4, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2, (i10 & 4) != 0 ? null : map3, (i10 & 8) != 0 ? null : map4);
    }
}
