package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f55437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f55440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f55441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f55442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f55443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f55444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3697gi f55445k;

    public Rf(String url, String id2, Map headers, boolean z10, String priority, boolean z11, int i10, String ownerId, long j10, Long l10, C3697gi c3697gi) {
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(id2, "id");
        kotlin.jvm.internal.m0.p(headers, "headers");
        kotlin.jvm.internal.m0.p(priority, "priority");
        kotlin.jvm.internal.m0.p(ownerId, "ownerId");
        this.f55435a = url;
        this.f55436b = id2;
        this.f55437c = headers;
        this.f55438d = z10;
        this.f55439e = priority;
        this.f55440f = z11;
        this.f55441g = i10;
        this.f55442h = ownerId;
        this.f55443i = j10;
        this.f55444j = l10;
        this.f55445k = c3697gi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rf)) {
            return false;
        }
        Rf rf2 = (Rf) obj;
        return kotlin.jvm.internal.m0.g(this.f55435a, rf2.f55435a) && kotlin.jvm.internal.m0.g(this.f55436b, rf2.f55436b) && kotlin.jvm.internal.m0.g(this.f55437c, rf2.f55437c) && this.f55438d == rf2.f55438d && kotlin.jvm.internal.m0.g(this.f55439e, rf2.f55439e) && this.f55440f == rf2.f55440f && this.f55441g == rf2.f55441g && kotlin.jvm.internal.m0.g(this.f55442h, rf2.f55442h) && this.f55443i == rf2.f55443i && kotlin.jvm.internal.m0.g(this.f55444j, rf2.f55444j) && kotlin.jvm.internal.m0.g(this.f55445k, rf2.f55445k);
    }

    public final int hashCode() {
        int iA = (f0.p.a(this.f55443i) + ((this.f55442h.hashCode() + AbstractC3671fi.a(this.f55441g, (g8.a.a(this.f55440f) + ((this.f55439e.hashCode() + ((g8.a.a(this.f55438d) + ((this.f55437c.hashCode() + ((this.f55436b.hashCode() + (this.f55435a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        Long l10 = this.f55444j;
        int iHashCode = (iA + (l10 == null ? 0 : l10.hashCode())) * 31;
        C3697gi c3697gi = this.f55445k;
        return iHashCode + (c3697gi != null ? c3697gi.hashCode() : 0);
    }

    public final String toString() {
        return "Ping(url=" + this.f55435a + ", id=" + this.f55436b + ", headers=" + this.f55437c + ", allowRedirects=" + this.f55438d + ", priority=" + this.f55439e + ", ackRequired=" + this.f55440f + ", retryCount=" + this.f55441g + ", ownerId=" + this.f55442h + ", createdAt=" + this.f55443i + ", retryAfterTimestamp=" + this.f55444j + ", telemetryData=" + this.f55445k + gi.j.f86771d;
    }
}
