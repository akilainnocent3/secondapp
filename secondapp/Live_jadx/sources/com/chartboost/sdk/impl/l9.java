package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39860c;

    public l9(String str, List iconClickTracking, List iconClickFallbackImages) {
        kotlin.jvm.internal.m0.p(iconClickTracking, "iconClickTracking");
        kotlin.jvm.internal.m0.p(iconClickFallbackImages, "iconClickFallbackImages");
        this.f39858a = str;
        this.f39859b = iconClickTracking;
        this.f39860c = iconClickFallbackImages;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj;
        return kotlin.jvm.internal.m0.g(this.f39858a, l9Var.f39858a) && kotlin.jvm.internal.m0.g(this.f39859b, l9Var.f39859b) && kotlin.jvm.internal.m0.g(this.f39860c, l9Var.f39860c);
    }

    public int hashCode() {
        String str = this.f39858a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f39859b.hashCode()) * 31) + this.f39860c.hashCode();
    }

    public String toString() {
        return "IconClicks(iconClickThrough=" + this.f39858a + ", iconClickTracking=" + this.f39859b + ", iconClickFallbackImages=" + this.f39860c + gi.j.f86771d;
    }
}
