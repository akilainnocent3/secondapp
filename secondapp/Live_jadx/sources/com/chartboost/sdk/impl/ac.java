package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f38183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f38184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f38185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38186e;

    public ac(String mimeType, Integer num, Integer num2, Integer num3, String url) {
        kotlin.jvm.internal.m0.p(mimeType, "mimeType");
        kotlin.jvm.internal.m0.p(url, "url");
        this.f38182a = mimeType;
        this.f38183b = num;
        this.f38184c = num2;
        this.f38185d = num3;
        this.f38186e = url;
    }

    public final Integer a() {
        return this.f38185d;
    }

    public final Integer b() {
        return this.f38184c;
    }

    public final String c() {
        return this.f38182a;
    }

    public final String d() {
        return this.f38186e;
    }

    public final Integer e() {
        return this.f38183b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return kotlin.jvm.internal.m0.g(this.f38182a, acVar.f38182a) && kotlin.jvm.internal.m0.g(this.f38183b, acVar.f38183b) && kotlin.jvm.internal.m0.g(this.f38184c, acVar.f38184c) && kotlin.jvm.internal.m0.g(this.f38185d, acVar.f38185d) && kotlin.jvm.internal.m0.g(this.f38186e, acVar.f38186e);
    }

    public int hashCode() {
        int iHashCode = this.f38182a.hashCode() * 31;
        Integer num = this.f38183b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f38184c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f38185d;
        return ((iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.f38186e.hashCode();
    }

    public String toString() {
        return "MediaFile(mimeType=" + this.f38182a + ", width=" + this.f38183b + ", height=" + this.f38184c + ", bitrate=" + this.f38185d + ", url=" + this.f38186e + gi.j.f86771d;
    }
}
