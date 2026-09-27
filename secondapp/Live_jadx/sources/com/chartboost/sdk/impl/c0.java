package com.chartboost.sdk.impl;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f38344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38346c;

    public c0(ViewGroup bannerView, int i10, int i11) {
        kotlin.jvm.internal.m0.p(bannerView, "bannerView");
        this.f38344a = bannerView;
        this.f38345b = i10;
        this.f38346c = i11;
    }

    public final int a() {
        return this.f38346c;
    }

    public final ViewGroup b() {
        return this.f38344a;
    }

    public final int c() {
        return this.f38345b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m0.g(this.f38344a, c0Var.f38344a) && this.f38345b == c0Var.f38345b && this.f38346c == c0Var.f38346c;
    }

    public int hashCode() {
        return (((this.f38344a.hashCode() * 31) + this.f38345b) * 31) + this.f38346c;
    }

    public String toString() {
        return "AdUnitBannerData(bannerView=" + this.f38344a + ", bannerWidth=" + this.f38345b + ", bannerHeight=" + this.f38346c + gi.j.f86771d;
    }
}
