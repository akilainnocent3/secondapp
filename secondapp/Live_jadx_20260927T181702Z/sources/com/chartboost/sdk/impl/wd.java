package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f41344g;

    public wd(boolean z10, boolean z11, int i10, int i11, long j10, int i12, List list) {
        this.f41338a = z10;
        this.f41339b = z11;
        this.f41340c = i10;
        this.f41341d = i11;
        this.f41342e = j10;
        this.f41343f = i12;
        this.f41344g = list;
    }

    public final int a() {
        return this.f41340c;
    }

    public final int b() {
        return this.f41341d;
    }

    public final int c() {
        return this.f41343f;
    }

    public final boolean d() {
        return this.f41339b;
    }

    public final List e() {
        return this.f41344g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd)) {
            return false;
        }
        wd wdVar = (wd) obj;
        return this.f41338a == wdVar.f41338a && this.f41339b == wdVar.f41339b && this.f41340c == wdVar.f41340c && this.f41341d == wdVar.f41341d && this.f41342e == wdVar.f41342e && this.f41343f == wdVar.f41343f && kotlin.jvm.internal.m0.g(this.f41344g, wdVar.f41344g);
    }

    public final long f() {
        return this.f41342e;
    }

    public final boolean g() {
        return this.f41338a;
    }

    public int hashCode() {
        int iA = ((((((((((g8.a.a(this.f41338a) * 31) + g8.a.a(this.f41339b)) * 31) + this.f41340c) * 31) + this.f41341d) * 31) + f0.p.a(this.f41342e)) * 31) + this.f41343f) * 31;
        List list = this.f41344g;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "OmSdkModel(isEnabled=" + this.f41338a + ", verificationEnabled=" + this.f41339b + ", minVisibleDips=" + this.f41340c + ", minVisibleDurationMs=" + this.f41341d + ", visibilityCheckIntervalMs=" + this.f41342e + ", traversalLimit=" + this.f41343f + ", verificationList=" + this.f41344g + gi.j.f86771d;
    }

    public /* synthetic */ wd(boolean z10, boolean z11, int i10, int i11, long j10, int i12, List list, int i13, kotlin.jvm.internal.x xVar) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? false : z11, (i13 & 4) != 0 ? 1 : i10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 100L : j10, (i13 & 32) != 0 ? 25 : i12, (i13 & 64) != 0 ? null : list);
    }
}
