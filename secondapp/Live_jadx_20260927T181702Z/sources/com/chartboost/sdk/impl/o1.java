package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c0 f40255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f40256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40258g;

    public o1(int i10, String location, String str, c0 c0Var, b0 b0Var, boolean z10, boolean z11) {
        kotlin.jvm.internal.m0.p(location, "location");
        this.f40252a = i10;
        this.f40253b = location;
        this.f40254c = str;
        this.f40255d = c0Var;
        this.f40256e = b0Var;
        this.f40257f = z10;
        this.f40258g = z11;
    }

    public final b0 a() {
        return this.f40256e;
    }

    public final c0 b() {
        return this.f40255d;
    }

    public final String c() {
        return this.f40254c;
    }

    public final String d() {
        return this.f40253b;
    }

    public final boolean e() {
        return this.f40258g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f40252a == o1Var.f40252a && kotlin.jvm.internal.m0.g(this.f40253b, o1Var.f40253b) && kotlin.jvm.internal.m0.g(this.f40254c, o1Var.f40254c) && kotlin.jvm.internal.m0.g(this.f40255d, o1Var.f40255d) && kotlin.jvm.internal.m0.g(this.f40256e, o1Var.f40256e) && this.f40257f == o1Var.f40257f && this.f40258g == o1Var.f40258g;
    }

    public int hashCode() {
        int iHashCode = ((this.f40252a * 31) + this.f40253b.hashCode()) * 31;
        String str = this.f40254c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        c0 c0Var = this.f40255d;
        int iHashCode3 = (iHashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        b0 b0Var = this.f40256e;
        return ((((iHashCode3 + (b0Var != null ? b0Var.hashCode() : 0)) * 31) + g8.a.a(this.f40257f)) * 31) + g8.a.a(this.f40258g);
    }

    public String toString() {
        return "AppRequest(id=" + this.f40252a + ", location=" + this.f40253b + ", bidResponse=" + this.f40254c + ", bannerData=" + this.f40255d + ", adUnit=" + this.f40256e + ", isTrackedCache=" + this.f40257f + ", isTrackedShow=" + this.f40258g + gi.j.f86771d;
    }

    public final void a(b0 b0Var) {
        this.f40256e = b0Var;
    }

    public final void b(boolean z10) {
        this.f40258g = z10;
    }

    public final void a(c0 c0Var) {
        this.f40255d = c0Var;
    }

    public final void a(String str) {
        this.f40254c = str;
    }

    public final void a(boolean z10) {
        this.f40257f = z10;
    }

    public /* synthetic */ o1(int i10, String str, String str2, c0 c0Var, b0 b0Var, boolean z10, boolean z11, int i11, kotlin.jvm.internal.x xVar) {
        this(i10, str, str2, (i11 & 8) != 0 ? null : c0Var, (i11 & 16) != 0 ? null : b0Var, (i11 & 32) != 0 ? false : z10, (i11 & 64) != 0 ? false : z11);
    }
}
