package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f40542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f40543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CBError f40544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40546e;

    public qb(o1 appRequest, b0 b0Var, CBError cBError, long j10, long j11) {
        kotlin.jvm.internal.m0.p(appRequest, "appRequest");
        this.f40542a = appRequest;
        this.f40543b = b0Var;
        this.f40544c = cBError;
        this.f40545d = j10;
        this.f40546e = j11;
    }

    public final b0 a() {
        return this.f40543b;
    }

    public final CBError b() {
        return this.f40544c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj;
        return kotlin.jvm.internal.m0.g(this.f40542a, qbVar.f40542a) && kotlin.jvm.internal.m0.g(this.f40543b, qbVar.f40543b) && kotlin.jvm.internal.m0.g(this.f40544c, qbVar.f40544c) && this.f40545d == qbVar.f40545d && this.f40546e == qbVar.f40546e;
    }

    public int hashCode() {
        int iHashCode = this.f40542a.hashCode() * 31;
        b0 b0Var = this.f40543b;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        CBError cBError = this.f40544c;
        return ((((iHashCode2 + (cBError != null ? cBError.hashCode() : 0)) * 31) + f0.p.a(this.f40545d)) * 31) + f0.p.a(this.f40546e);
    }

    public String toString() {
        return "LoadResult(appRequest=" + this.f40542a + ", adUnit=" + this.f40543b + ", error=" + this.f40544c + ", requestResponseCodeNs=" + this.f40545d + ", readDataNs=" + this.f40546e + gi.j.f86771d;
    }

    public /* synthetic */ qb(o1 o1Var, b0 b0Var, CBError cBError, long j10, long j11, int i10, kotlin.jvm.internal.x xVar) {
        this(o1Var, (i10 & 2) != 0 ? null : b0Var, (i10 & 4) != 0 ? null : cBError, (i10 & 8) != 0 ? 0L : j10, (i10 & 16) != 0 ? 0L : j11);
    }
}
