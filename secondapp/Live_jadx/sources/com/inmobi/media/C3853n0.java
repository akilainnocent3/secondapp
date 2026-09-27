package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3853n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f57064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f57065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f57067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f57068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f57069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57070h;

    public C3853n0(String clientRequestId, Map map, long j10, String monetizationContext, String str, Map map2, String str2, boolean z10) {
        kotlin.jvm.internal.m0.p(clientRequestId, "clientRequestId");
        kotlin.jvm.internal.m0.p("im", "integrationTypeString");
        kotlin.jvm.internal.m0.p(monetizationContext, "monetizationContext");
        kotlin.jvm.internal.m0.p("unifiedSdkJson", "adFormat");
        this.f57063a = clientRequestId;
        this.f57064b = map;
        this.f57065c = j10;
        this.f57066d = monetizationContext;
        this.f57067e = str;
        this.f57068f = map2;
        this.f57069g = str2;
        this.f57070h = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3853n0)) {
            return false;
        }
        C3853n0 c3853n0 = (C3853n0) obj;
        return kotlin.jvm.internal.m0.g(this.f57063a, c3853n0.f57063a) && kotlin.jvm.internal.m0.g("im", "im") && kotlin.jvm.internal.m0.g(this.f57064b, c3853n0.f57064b) && this.f57065c == c3853n0.f57065c && kotlin.jvm.internal.m0.g(this.f57066d, c3853n0.f57066d) && kotlin.jvm.internal.m0.g(this.f57067e, c3853n0.f57067e) && kotlin.jvm.internal.m0.g("unifiedSdkJson", "unifiedSdkJson") && kotlin.jvm.internal.m0.g(this.f57068f, c3853n0.f57068f) && kotlin.jvm.internal.m0.g(this.f57069g, c3853n0.f57069g) && this.f57070h == c3853n0.f57070h && kotlin.jvm.internal.m0.g(null, null);
    }

    public final int hashCode() {
        int iHashCode = ((this.f57063a.hashCode() * 31) + 3364) * 31;
        Map map = this.f57064b;
        int iHashCode2 = (this.f57066d.hashCode() + ((f0.p.a(this.f57065c) + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31)) * 31;
        String str = this.f57067e;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + 1309392464) * 31;
        Map map2 = this.f57068f;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str2 = this.f57069g;
        return (g8.a.a(this.f57070h) + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        return "AdMetaData(clientRequestId=" + this.f57063a + ", integrationTypeString=im, extras=" + this.f57064b + ", imPlacementId=" + this.f57065c + ", monetizationContext=" + this.f57066d + ", adType=" + this.f57067e + ", adFormat=unifiedSdkJson, adSpecificRequestParams=" + this.f57068f + ", keywords=" + this.f57069g + ", isApplicationMutedByPub=" + this.f57070h + ", extraInfo=" + ((Object) null) + gi.j.f86771d;
    }
}
