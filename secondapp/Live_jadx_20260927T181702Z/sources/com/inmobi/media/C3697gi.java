package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;

/* JADX INFO: renamed from: com.inmobi.media.gi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3697gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4052v0 f56508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f56513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f56514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f56515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f56516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3929q1 f56517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3821li f56518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f56519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InlineParams f56520m;

    public C3697gi(C4052v0 placement, String markupType, String impressionId, String telemetryMetadataBlob, int i10, String creativeType, String creativeId, boolean z10, int i11, C3929q1 c3929q1, C3821li c3821li, String str, InlineParams inlineParams) {
        kotlin.jvm.internal.m0.p(placement, "placement");
        kotlin.jvm.internal.m0.p(markupType, "markupType");
        kotlin.jvm.internal.m0.p(impressionId, "impressionId");
        kotlin.jvm.internal.m0.p(telemetryMetadataBlob, "telemetryMetadataBlob");
        kotlin.jvm.internal.m0.p(creativeType, "creativeType");
        kotlin.jvm.internal.m0.p(creativeId, "creativeId");
        this.f56508a = placement;
        this.f56509b = markupType;
        this.f56510c = impressionId;
        this.f56511d = telemetryMetadataBlob;
        this.f56512e = i10;
        this.f56513f = creativeType;
        this.f56514g = creativeId;
        this.f56515h = z10;
        this.f56516i = i11;
        this.f56517j = c3929q1;
        this.f56518k = c3821li;
        this.f56519l = str;
        this.f56520m = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3697gi)) {
            return false;
        }
        C3697gi c3697gi = (C3697gi) obj;
        return kotlin.jvm.internal.m0.g(this.f56508a, c3697gi.f56508a) && kotlin.jvm.internal.m0.g(this.f56509b, c3697gi.f56509b) && kotlin.jvm.internal.m0.g(this.f56510c, c3697gi.f56510c) && kotlin.jvm.internal.m0.g(this.f56511d, c3697gi.f56511d) && this.f56512e == c3697gi.f56512e && kotlin.jvm.internal.m0.g(this.f56513f, c3697gi.f56513f) && kotlin.jvm.internal.m0.g(this.f56514g, c3697gi.f56514g) && this.f56515h == c3697gi.f56515h && this.f56516i == c3697gi.f56516i && kotlin.jvm.internal.m0.g(this.f56517j, c3697gi.f56517j) && kotlin.jvm.internal.m0.g(this.f56518k, c3697gi.f56518k) && kotlin.jvm.internal.m0.g(this.f56519l, c3697gi.f56519l) && kotlin.jvm.internal.m0.g(this.f56520m, c3697gi.f56520m);
    }

    public final int hashCode() {
        int iA = AbstractC3671fi.a(this.f56516i, (g8.a.a(this.f56515h) + ((this.f56514g.hashCode() + ((this.f56513f.hashCode() + AbstractC3671fi.a(this.f56512e, (this.f56511d.hashCode() + ((this.f56510c.hashCode() + ((this.f56509b.hashCode() + (this.f56508a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31);
        C3929q1 c3929q1 = this.f56517j;
        int iHashCode = (iA + (c3929q1 == null ? 0 : c3929q1.hashCode())) * 31;
        C3821li c3821li = this.f56518k;
        int i10 = (iHashCode + (c3821li == null ? 0 : c3821li.f56939a)) * 31;
        String str = this.f56519l;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        InlineParams inlineParams = this.f56520m;
        return iHashCode2 + (inlineParams != null ? inlineParams.hashCode() : 0);
    }

    public final String toString() {
        return "RenderViewMetaData(placement=" + this.f56508a + ", markupType=" + this.f56509b + ", impressionId=" + this.f56510c + ", telemetryMetadataBlob=" + this.f56511d + ", internetAvailabilityAdRetryCount=" + this.f56512e + ", creativeType=" + this.f56513f + ", creativeId=" + this.f56514g + ", isRewarded=" + this.f56515h + ", adIndex=" + this.f56516i + ", adUnitTelemetryData=" + this.f56517j + ", renderViewTelemetryData=" + this.f56518k + ", renderViewId=" + this.f56519l + ", inlineParams=" + this.f56520m + gi.j.f86771d;
    }
}
