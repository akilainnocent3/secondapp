package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.kk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3798kk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f56837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f56838b;

    public C3798kk(Yj telemetryConfigMetaData, double d10) {
        kotlin.jvm.internal.m0.p(telemetryConfigMetaData, "telemetryConfigMetaData");
        this.f56837a = telemetryConfigMetaData;
        this.f56838b = d10;
    }

    public final int a(String eventType) {
        kotlin.jvm.internal.m0.p(eventType, "eventType");
        if (this.f56838b >= this.f56837a.f55847g) {
            return 0;
        }
        Wj wj2 = Wj.f55736a;
        return 2;
    }
}
