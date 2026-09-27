package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f95513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f95514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f95515g;

    public y(String str, boolean z10, String str2, boolean z11, int i10, byte[] bArr, Map map) {
        this.f95509a = str;
        this.f95510b = z10;
        this.f95511c = str2;
        this.f95512d = z11;
        this.f95513e = i10;
        this.f95514f = bArr;
        this.f95515g = map;
    }

    public final String toString() {
        return "RequestResult(type='" + this.f95509a + "', isCompleted=" + this.f95510b + ", url=" + this.f95511c + ", responseCodeIsValid=" + this.f95512d + ", responseCode=" + this.f95513e + ", responseBody=" + this.f95514f + ", responseHeaders=" + this.f95515g + ')';
    }
}
