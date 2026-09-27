package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh f39256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39257b;

    public i7(hh eventData, List pendingTrackers) {
        kotlin.jvm.internal.m0.p(eventData, "eventData");
        kotlin.jvm.internal.m0.p(pendingTrackers, "pendingTrackers");
        this.f39256a = eventData;
        this.f39257b = pendingTrackers;
    }

    public final hh a() {
        return this.f39256a;
    }

    public final List b() {
        return this.f39257b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return kotlin.jvm.internal.m0.g(this.f39256a, i7Var.f39256a) && kotlin.jvm.internal.m0.g(this.f39257b, i7Var.f39257b);
    }

    public int hashCode() {
        return (this.f39256a.hashCode() * 31) + this.f39257b.hashCode();
    }

    public String toString() {
        return "EventProcessingRequest(eventData=" + this.f39256a + ", pendingTrackers=" + this.f39257b + gi.j.f86771d;
    }
}
