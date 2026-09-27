package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40470b;

    public pi(String str, String str2) {
        this.f40469a = str;
        this.f40470b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi)) {
            return false;
        }
        pi piVar = (pi) obj;
        return kotlin.jvm.internal.m0.g(this.f40469a, piVar.f40469a) && kotlin.jvm.internal.m0.g(this.f40470b, piVar.f40470b);
    }

    public int hashCode() {
        String str = this.f40469a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f40470b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UniversalAdId(idRegistry=" + this.f40469a + ", value=" + this.f40470b + gi.j.f86771d;
    }
}
