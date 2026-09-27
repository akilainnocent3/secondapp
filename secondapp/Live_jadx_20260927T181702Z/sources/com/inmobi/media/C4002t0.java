package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4002t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3953r1 f57677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f57679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f57681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f57682f;

    public C4002t0(C3953r1 adUnitTelemetry, String str, Boolean bool, String str2, byte b10, String str3) {
        kotlin.jvm.internal.m0.p(adUnitTelemetry, "adUnitTelemetry");
        this.f57677a = adUnitTelemetry;
        this.f57678b = str;
        this.f57679c = bool;
        this.f57680d = str2;
        this.f57681e = b10;
        this.f57682f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4002t0)) {
            return false;
        }
        C4002t0 c4002t0 = (C4002t0) obj;
        return kotlin.jvm.internal.m0.g(this.f57677a, c4002t0.f57677a) && kotlin.jvm.internal.m0.g(this.f57678b, c4002t0.f57678b) && kotlin.jvm.internal.m0.g(this.f57679c, c4002t0.f57679c) && kotlin.jvm.internal.m0.g(this.f57680d, c4002t0.f57680d) && this.f57681e == c4002t0.f57681e && kotlin.jvm.internal.m0.g(this.f57682f, c4002t0.f57682f);
    }

    public final int hashCode() {
        int iHashCode = this.f57677a.hashCode() * 31;
        String str = this.f57678b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f57679c;
        int iHashCode3 = (this.f57681e + ((this.f57680d.hashCode() + ((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f57682f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        C3953r1 c3953r1 = this.f57677a;
        String str = this.f57678b;
        Boolean bool = this.f57679c;
        String str2 = this.f57680d;
        byte b10 = this.f57681e;
        return "AdNotReadyMetadata(adUnitTelemetry=" + c3953r1 + ", creativeType=" + str + ", isRewarded=" + bool + ", markupType=" + str2 + ", adState=" + ((int) b10) + ", impressionId=" + this.f57682f + gi.j.f86771d;
    }
}
