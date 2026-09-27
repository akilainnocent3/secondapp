package io.appmetrica.analytics.identifiers.impl;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f95419c;

    public a(String str, String str2, Boolean bool) {
        this.f95417a = str;
        this.f95418b = str2;
        this.f95419c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m0.g(this.f95417a, aVar.f95417a) && m0.g(this.f95418b, aVar.f95418b) && m0.g(this.f95419c, aVar.f95419c);
    }

    public final int hashCode() {
        int iHashCode = this.f95417a.hashCode() * 31;
        String str = this.f95418b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f95419c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f95417a + ", advId=" + this.f95418b + ", limitedAdTracking=" + this.f95419c + ')';
    }
}
