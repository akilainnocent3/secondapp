package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5389t3 implements R7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5364s3 f98342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f98343b;

    public C5389t3(@oy.l C5364s3 c5364s3, @oy.l List<C5364s3> list) {
        this.f98342a = c5364s3;
        this.f98343b = list;
    }

    @oy.l
    public final C5389t3 a(@oy.l C5364s3 c5364s3, @oy.l List<C5364s3> list) {
        return new C5389t3(c5364s3, list);
    }

    @Override // io.appmetrica.analytics.impl.R7
    public final Object b() {
        return this.f98342a;
    }

    @oy.l
    public final C5364s3 c() {
        return this.f98342a;
    }

    @oy.l
    public final List<C5364s3> d() {
        return this.f98343b;
    }

    @oy.l
    public final C5364s3 e() {
        return this.f98342a;
    }

    public final boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5389t3)) {
            return false;
        }
        C5389t3 c5389t3 = (C5389t3) obj;
        return kotlin.jvm.internal.m0.g(this.f98342a, c5389t3.f98342a) && kotlin.jvm.internal.m0.g(this.f98343b, c5389t3.f98343b);
    }

    public final int hashCode() {
        return this.f98343b.hashCode() + (this.f98342a.hashCode() * 31);
    }

    @oy.l
    public final String toString() {
        return "ClidsInfo(chosen=" + this.f98342a + ", candidates=" + this.f98343b + ')';
    }

    public static C5389t3 a(C5389t3 c5389t3, C5364s3 c5364s3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c5364s3 = c5389t3.f98342a;
        }
        if ((i10 & 2) != 0) {
            list = c5389t3.f98343b;
        }
        c5389t3.getClass();
        return new C5389t3(c5364s3, list);
    }

    @Override // io.appmetrica.analytics.impl.R7
    @oy.l
    public final List<C5364s3> a() {
        return this.f98343b;
    }
}
