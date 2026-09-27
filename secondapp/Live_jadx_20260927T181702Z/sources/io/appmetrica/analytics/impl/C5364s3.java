package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5364s3 implements U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f98282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T7 f98283b;

    public C5364s3(@oy.m Map<String, String> map, @oy.l T7 t10) {
        this.f98282a = map;
        this.f98283b = t10;
    }

    @oy.l
    public final C5364s3 a(@oy.m Map<String, String> map, @oy.l T7 t10) {
        return new C5364s3(map, t10);
    }

    @oy.m
    public final Map<String, String> b() {
        return this.f98282a;
    }

    @oy.l
    public final T7 c() {
        return this.f98283b;
    }

    @oy.m
    public final Map<String, String> d() {
        return this.f98282a;
    }

    public final boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5364s3)) {
            return false;
        }
        C5364s3 c5364s3 = (C5364s3) obj;
        return kotlin.jvm.internal.m0.g(this.f98282a, c5364s3.f98282a) && this.f98283b == c5364s3.f98283b;
    }

    public final int hashCode() {
        Map map = this.f98282a;
        return this.f98283b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    @oy.l
    public final String toString() {
        return "Candidate(clids=" + this.f98282a + ", source=" + this.f98283b + ')';
    }

    public static C5364s3 a(C5364s3 c5364s3, Map map, T7 t10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = c5364s3.f98282a;
        }
        if ((i10 & 2) != 0) {
            t10 = c5364s3.f98283b;
        }
        c5364s3.getClass();
        return new C5364s3(map, t10);
    }

    @Override // io.appmetrica.analytics.impl.U7
    @oy.l
    public final T7 a() {
        return this.f98283b;
    }
}
