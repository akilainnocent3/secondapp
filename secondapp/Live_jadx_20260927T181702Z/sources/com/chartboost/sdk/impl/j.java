package com.chartboost.sdk.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f39451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f39452b;

    public j(s adFormat, Map extras) {
        kotlin.jvm.internal.m0.p(adFormat, "adFormat");
        kotlin.jvm.internal.m0.p(extras, "extras");
        this.f39451a = adFormat;
        this.f39452b = extras;
    }

    public final s a() {
        return this.f39451a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f39451a == jVar.f39451a && kotlin.jvm.internal.m0.g(this.f39452b, jVar.f39452b);
    }

    public int hashCode() {
        return (this.f39451a.hashCode() * 31) + this.f39452b.hashCode();
    }

    public String toString() {
        return "AdConfig(adFormat=" + this.f39451a + ", extras=" + this.f39452b + gi.j.f86771d;
    }

    public /* synthetic */ j(s sVar, Map map, int i10, kotlin.jvm.internal.x xVar) {
        this(sVar, (i10 & 2) != 0 ? fr.n1.z() : map);
    }
}
