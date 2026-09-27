package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ch implements nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38462b;

    public ch(String str, String str2) {
        this.f38461a = str;
        this.f38462b = str2;
    }

    public final String a() {
        return this.f38461a;
    }

    public final String b() {
        return this.f38462b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj;
        return kotlin.jvm.internal.m0.g(this.f38461a, chVar.f38461a) && kotlin.jvm.internal.m0.g(this.f38462b, chVar.f38462b);
    }

    public int hashCode() {
        String str = this.f38461a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38462b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StaticResource(creativeType=" + this.f38461a + ", url=" + this.f38462b + gi.j.f86771d;
    }
}
