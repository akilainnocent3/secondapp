package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f41689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f41690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f41691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41693e;

    public z(a0 adType, Integer num, Integer num2, String str, int i10) {
        kotlin.jvm.internal.m0.p(adType, "adType");
        this.f41689a = adType;
        this.f41690b = num;
        this.f41691c = num2;
        this.f41692d = str;
        this.f41693e = i10;
    }

    public final a0 a() {
        return this.f41689a;
    }

    public final Integer b() {
        return this.f41690b;
    }

    public final int c() {
        return this.f41693e;
    }

    public final String d() {
        return this.f41692d;
    }

    public final Integer e() {
        return this.f41691c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.m0.g(this.f41689a, zVar.f41689a) && kotlin.jvm.internal.m0.g(this.f41690b, zVar.f41690b) && kotlin.jvm.internal.m0.g(this.f41691c, zVar.f41691c) && kotlin.jvm.internal.m0.g(this.f41692d, zVar.f41692d) && this.f41693e == zVar.f41693e;
    }

    public int hashCode() {
        int iHashCode = this.f41689a.hashCode() * 31;
        Integer num = this.f41690b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f41691c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f41692d;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f41693e;
    }

    public String toString() {
        return "AdParameters(adType=" + this.f41689a + ", height=" + this.f41690b + ", width=" + this.f41691c + ", location=" + this.f41692d + ", impDepth=" + this.f41693e + gi.j.f86771d;
    }
}
