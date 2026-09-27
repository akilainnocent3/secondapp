package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mi f38842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38843b;

    public f1(mi advertisingIDState, String str) {
        kotlin.jvm.internal.m0.p(advertisingIDState, "advertisingIDState");
        this.f38842a = advertisingIDState;
        this.f38843b = str;
    }

    public final String a() {
        return this.f38843b;
    }

    public final mi b() {
        return this.f38842a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f38842a == f1Var.f38842a && kotlin.jvm.internal.m0.g(this.f38843b, f1Var.f38843b);
    }

    public int hashCode() {
        int iHashCode = this.f38842a.hashCode() * 31;
        String str = this.f38843b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AdvertisingIDHolder(advertisingIDState=" + this.f38842a + ", advertisingID=" + this.f38843b + gi.j.f86771d;
    }
}
