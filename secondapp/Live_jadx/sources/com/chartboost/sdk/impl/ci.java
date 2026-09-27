package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f38469g;

    public ci(boolean z10, List blackList, String endpoint, int i10, int i11, boolean z11, int i12) {
        kotlin.jvm.internal.m0.p(blackList, "blackList");
        kotlin.jvm.internal.m0.p(endpoint, "endpoint");
        this.f38463a = z10;
        this.f38464b = blackList;
        this.f38465c = endpoint;
        this.f38466d = i10;
        this.f38467e = i11;
        this.f38468f = z11;
        this.f38469g = i12;
    }

    public final List a() {
        return this.f38464b;
    }

    public final String b() {
        return this.f38465c;
    }

    public final int c() {
        return this.f38466d;
    }

    public final boolean d() {
        return this.f38468f;
    }

    public final int e() {
        return this.f38469g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return this.f38463a == ciVar.f38463a && kotlin.jvm.internal.m0.g(this.f38464b, ciVar.f38464b) && kotlin.jvm.internal.m0.g(this.f38465c, ciVar.f38465c) && this.f38466d == ciVar.f38466d && this.f38467e == ciVar.f38467e && this.f38468f == ciVar.f38468f && this.f38469g == ciVar.f38469g;
    }

    public final int f() {
        return this.f38467e;
    }

    public final boolean g() {
        return this.f38463a;
    }

    public int hashCode() {
        return (((((((((((g8.a.a(this.f38463a) * 31) + this.f38464b.hashCode()) * 31) + this.f38465c.hashCode()) * 31) + this.f38466d) * 31) + this.f38467e) * 31) + g8.a.a(this.f38468f)) * 31) + this.f38469g;
    }

    public String toString() {
        return "TrackingConfig(isEnabled=" + this.f38463a + ", blackList=" + this.f38464b + ", endpoint=" + this.f38465c + ", eventLimit=" + this.f38466d + ", windowDuration=" + this.f38467e + ", persistenceEnabled=" + this.f38468f + ", persistenceMaxEvents=" + this.f38469g + gi.j.f86771d;
    }

    public /* synthetic */ ci(boolean z10, List list, String str, int i10, int i11, boolean z11, int i12, int i13, kotlin.jvm.internal.x xVar) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? di.a() : list, (i13 & 4) != 0 ? "https://ssp-events.chartboost.com/track/sdk" : str, (i13 & 8) != 0 ? 10 : i10, (i13 & 16) != 0 ? 60 : i11, (i13 & 32) != 0 ? true : z11, (i13 & 64) != 0 ? 100 : i12);
    }
}
