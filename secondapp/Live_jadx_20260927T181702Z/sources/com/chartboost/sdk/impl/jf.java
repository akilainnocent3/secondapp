package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f39644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f39645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sd f39647d;

    public jf(Integer num, Integer num2, String str, sd openRTBConnectionType) {
        kotlin.jvm.internal.m0.p(openRTBConnectionType, "openRTBConnectionType");
        this.f39644a = num;
        this.f39645b = num2;
        this.f39646c = str;
        this.f39647d = openRTBConnectionType;
    }

    public final Integer a() {
        return this.f39644a;
    }

    public final Integer b() {
        return this.f39645b;
    }

    public final String c() {
        return this.f39646c;
    }

    public final sd d() {
        return this.f39647d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf)) {
            return false;
        }
        jf jfVar = (jf) obj;
        return kotlin.jvm.internal.m0.g(this.f39644a, jfVar.f39644a) && kotlin.jvm.internal.m0.g(this.f39645b, jfVar.f39645b) && kotlin.jvm.internal.m0.g(this.f39646c, jfVar.f39646c) && this.f39647d == jfVar.f39647d;
    }

    public int hashCode() {
        Integer num = this.f39644a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f39645b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f39646c;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f39647d.hashCode();
    }

    public String toString() {
        return "ReachabilityBodyFields(cellularConnectionType=" + this.f39644a + ", connectionTypeFromActiveNetwork=" + this.f39645b + ", detailedConnectionType=" + this.f39646c + ", openRTBConnectionType=" + this.f39647d + gi.j.f86771d;
    }
}
