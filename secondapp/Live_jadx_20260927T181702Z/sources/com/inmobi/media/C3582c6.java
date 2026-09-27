package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3582c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f56133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f56134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f56135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f56137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f56138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f56139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f56140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f56141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f56142k;

    public C3582c6(int i10, long j10, long j11, long j12, int i11, int i12, int i13, int i14, long j13, long j14) {
        this.f56132a = i10;
        this.f56133b = j10;
        this.f56134c = j11;
        this.f56135d = j12;
        this.f56136e = i11;
        this.f56137f = i12;
        this.f56138g = i13;
        this.f56139h = i14;
        this.f56140i = j13;
        this.f56141j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3582c6)) {
            return false;
        }
        C3582c6 c3582c6 = (C3582c6) obj;
        return this.f56132a == c3582c6.f56132a && this.f56133b == c3582c6.f56133b && this.f56134c == c3582c6.f56134c && this.f56135d == c3582c6.f56135d && this.f56136e == c3582c6.f56136e && this.f56137f == c3582c6.f56137f && this.f56138g == c3582c6.f56138g && this.f56139h == c3582c6.f56139h && this.f56140i == c3582c6.f56140i && this.f56141j == c3582c6.f56141j;
    }

    public final int hashCode() {
        return f0.p.a(this.f56141j) + ((f0.p.a(this.f56140i) + AbstractC3671fi.a(this.f56139h, AbstractC3671fi.a(this.f56138g, AbstractC3671fi.a(this.f56137f, AbstractC3671fi.a(this.f56136e, (f0.p.a(this.f56135d) + ((f0.p.a(this.f56134c) + ((f0.p.a(this.f56133b) + (this.f56132a * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "EventConfig(maxRetryCount=" + this.f56132a + ", timeToLiveInSec=" + this.f56133b + ", processingInterval=" + this.f56134c + ", ingestionLatencyInSec=" + this.f56135d + ", minBatchSizeWifi=" + this.f56136e + ", maxBatchSizeWifi=" + this.f56137f + ", minBatchSizeMobile=" + this.f56138g + ", maxBatchSizeMobile=" + this.f56139h + ", retryIntervalWifi=" + this.f56140i + ", retryIntervalMobile=" + this.f56141j + gi.j.f86771d;
    }
}
