package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5478wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q5 f98534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f98535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f98537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Gh f98538e;

    public C5478wh(Q5 q10, boolean z10, int i10, HashMap map, Gh gh2) {
        this.f98534a = q10;
        this.f98535b = z10;
        this.f98536c = i10;
        this.f98537d = map;
        this.f98538e = gh2;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f98534a + ", serviceDataReporterType=" + this.f98536c + ", environment=" + this.f98538e + ", isCrashReport=" + this.f98535b + ", trimmedFields=" + this.f98537d + ')';
    }
}
