package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f41096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f41097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f41098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f41100g;

    public ub(long j10, int i10, Integer num, Integer num2, Integer num3, String appBundle, String omidPartner) {
        kotlin.jvm.internal.m0.p(appBundle, "appBundle");
        kotlin.jvm.internal.m0.p(omidPartner, "omidPartner");
        this.f41094a = j10;
        this.f41095b = i10;
        this.f41096c = num;
        this.f41097d = num2;
        this.f41098e = num3;
        this.f41099f = appBundle;
        this.f41100g = omidPartner;
    }

    public final String a() {
        return this.f41099f;
    }

    public final int b() {
        return this.f41095b;
    }

    public final long c() {
        return this.f41094a;
    }

    public final Integer d() {
        return this.f41096c;
    }

    public final Integer e() {
        return this.f41098e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub)) {
            return false;
        }
        ub ubVar = (ub) obj;
        return this.f41094a == ubVar.f41094a && this.f41095b == ubVar.f41095b && kotlin.jvm.internal.m0.g(this.f41096c, ubVar.f41096c) && kotlin.jvm.internal.m0.g(this.f41097d, ubVar.f41097d) && kotlin.jvm.internal.m0.g(this.f41098e, ubVar.f41098e) && kotlin.jvm.internal.m0.g(this.f41099f, ubVar.f41099f) && kotlin.jvm.internal.m0.g(this.f41100g, ubVar.f41100g);
    }

    public final String f() {
        return this.f41100g;
    }

    public final Integer g() {
        return this.f41097d;
    }

    public int hashCode() {
        int iA = ((f0.p.a(this.f41094a) * 31) + this.f41095b) * 31;
        Integer num = this.f41096c;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f41097d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f41098e;
        return ((((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.f41099f.hashCode()) * 31) + this.f41100g.hashCode();
    }

    public String toString() {
        return "MacroContext(currentTimeMs=" + this.f41094a + ", cacheBusting=" + this.f41095b + ", errorCode=" + this.f41096c + ", reasonCode=" + this.f41097d + ", limitAdTracking=" + this.f41098e + ", appBundle=" + this.f41099f + ", omidPartner=" + this.f41100g + gi.j.f86771d;
    }
}
