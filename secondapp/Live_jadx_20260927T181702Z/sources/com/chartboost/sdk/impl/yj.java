package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41678b;

    public yj(String str, List clickTracking) {
        kotlin.jvm.internal.m0.p(clickTracking, "clickTracking");
        this.f41677a = str;
        this.f41678b = clickTracking;
    }

    public final String a() {
        return this.f41677a;
    }

    public final List b() {
        return this.f41678b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj)) {
            return false;
        }
        yj yjVar = (yj) obj;
        return kotlin.jvm.internal.m0.g(this.f41677a, yjVar.f41677a) && kotlin.jvm.internal.m0.g(this.f41678b, yjVar.f41678b);
    }

    public int hashCode() {
        String str = this.f41677a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f41678b.hashCode();
    }

    public String toString() {
        return "VideoClicks(clickThrough=" + this.f41677a + ", clickTracking=" + this.f41678b + gi.j.f86771d;
    }
}
