package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41426b;

    public x4(String str, List companionAds) {
        kotlin.jvm.internal.m0.p(companionAds, "companionAds");
        this.f41425a = str;
        this.f41426b = companionAds;
    }

    public final List a() {
        return this.f41426b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        return kotlin.jvm.internal.m0.g(this.f41425a, x4Var.f41425a) && kotlin.jvm.internal.m0.g(this.f41426b, x4Var.f41426b);
    }

    public int hashCode() {
        String str = this.f41425a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f41426b.hashCode();
    }

    public String toString() {
        return "CompanionAds(required=" + this.f41425a + ", companionAds=" + this.f41426b + gi.j.f86771d;
    }
}
