package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38916d;

    public fc(String mediationName, String libraryVersion, String adapterVersion, String mediationType) {
        kotlin.jvm.internal.m0.p(mediationName, "mediationName");
        kotlin.jvm.internal.m0.p(libraryVersion, "libraryVersion");
        kotlin.jvm.internal.m0.p(adapterVersion, "adapterVersion");
        kotlin.jvm.internal.m0.p(mediationType, "mediationType");
        this.f38913a = mediationName;
        this.f38914b = libraryVersion;
        this.f38915c = adapterVersion;
        this.f38916d = mediationType;
    }

    public final String a() {
        return this.f38915c;
    }

    public final String b() {
        return this.f38914b;
    }

    public final String c() {
        return this.f38913a;
    }

    public final String d() {
        return this.f38916d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        return kotlin.jvm.internal.m0.g(this.f38913a, fcVar.f38913a) && kotlin.jvm.internal.m0.g(this.f38914b, fcVar.f38914b) && kotlin.jvm.internal.m0.g(this.f38915c, fcVar.f38915c) && kotlin.jvm.internal.m0.g(this.f38916d, fcVar.f38916d);
    }

    public int hashCode() {
        return (((((this.f38913a.hashCode() * 31) + this.f38914b.hashCode()) * 31) + this.f38915c.hashCode()) * 31) + this.f38916d.hashCode();
    }

    public String toString() {
        return "MediationBodyFields(mediationName=" + this.f38913a + ", libraryVersion=" + this.f38914b + ", adapterVersion=" + this.f38915c + ", mediationType=" + this.f38916d + gi.j.f86771d;
    }
}
