package com.inmobi.media;

import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.jk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3773jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f56752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fi f56753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3798kk f56754c;

    public C3773jk(Yj telemetryConfigMetaData, List samplingEvents) {
        kotlin.jvm.internal.m0.p(telemetryConfigMetaData, "telemetryConfigMetaData");
        kotlin.jvm.internal.m0.p(samplingEvents, "samplingEvents");
        this.f56752a = telemetryConfigMetaData;
        double dRandom = Math.random();
        this.f56753b = new Fi(telemetryConfigMetaData, dRandom, samplingEvents);
        this.f56754c = new C3798kk(telemetryConfigMetaData, dRandom);
    }
}
