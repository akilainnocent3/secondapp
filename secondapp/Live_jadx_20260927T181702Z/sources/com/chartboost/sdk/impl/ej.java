package com.chartboost.sdk.impl;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f38837e;

    public ej(String str, List ads, List aggregatedTrackingEvents, List aggregatedAdVerifications, Set viewabilityVendors) {
        kotlin.jvm.internal.m0.p(ads, "ads");
        kotlin.jvm.internal.m0.p(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        kotlin.jvm.internal.m0.p(aggregatedAdVerifications, "aggregatedAdVerifications");
        kotlin.jvm.internal.m0.p(viewabilityVendors, "viewabilityVendors");
        this.f38833a = str;
        this.f38834b = ads;
        this.f38835c = aggregatedTrackingEvents;
        this.f38836d = aggregatedAdVerifications;
        this.f38837e = viewabilityVendors;
    }

    public final List a() {
        return this.f38834b;
    }

    public final List b() {
        return this.f38835c;
    }

    public final Set c() {
        return this.f38837e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej)) {
            return false;
        }
        ej ejVar = (ej) obj;
        return kotlin.jvm.internal.m0.g(this.f38833a, ejVar.f38833a) && kotlin.jvm.internal.m0.g(this.f38834b, ejVar.f38834b) && kotlin.jvm.internal.m0.g(this.f38835c, ejVar.f38835c) && kotlin.jvm.internal.m0.g(this.f38836d, ejVar.f38836d) && kotlin.jvm.internal.m0.g(this.f38837e, ejVar.f38837e);
    }

    public int hashCode() {
        String str = this.f38833a;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.f38834b.hashCode()) * 31) + this.f38835c.hashCode()) * 31) + this.f38836d.hashCode()) * 31) + this.f38837e.hashCode();
    }

    public String toString() {
        return "Vast(version=" + this.f38833a + ", ads=" + this.f38834b + ", aggregatedTrackingEvents=" + this.f38835c + ", aggregatedAdVerifications=" + this.f38836d + ", viewabilityVendors=" + this.f38837e + gi.j.f86771d;
    }

    public /* synthetic */ ej(String str, List list, List list2, List list3, Set set, int i10, kotlin.jvm.internal.x xVar) {
        this(str, list, list2, list3, (i10 & 16) != 0 ? yk.f41679e.a(list3) : set);
    }
}
