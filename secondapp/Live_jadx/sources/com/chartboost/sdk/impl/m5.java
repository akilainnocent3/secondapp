package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi f39990b;

    public m5(String str, pi piVar) {
        this.f39989a = str;
        this.f39990b = piVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return kotlin.jvm.internal.m0.g(this.f39989a, m5Var.f39989a) && kotlin.jvm.internal.m0.g(this.f39990b, m5Var.f39990b);
    }

    public int hashCode() {
        String str = this.f39989a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        pi piVar = this.f39990b;
        return iHashCode + (piVar != null ? piVar.hashCode() : 0);
    }

    public String toString() {
        return "CreativeExtension(type=" + this.f39989a + ", universalAdId=" + this.f39990b + gi.j.f86771d;
    }
}
