package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5187l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f97780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97781b;

    public C5187l0(List list, boolean z10) {
        this.f97780a = list;
        this.f97781b = z10;
    }

    public final String toString() {
        return "AppMetricaConfigExtension(autoCollectedDataSubscribers=" + this.f97780a + ", needClearEnvironment=" + this.f97781b + ')';
    }
}
