package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ef, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3642ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56353b;

    public C3642ef(String hyperId, String spHost) {
        kotlin.jvm.internal.m0.p(hyperId, "hyperId");
        kotlin.jvm.internal.m0.p("i6i", "sspId");
        kotlin.jvm.internal.m0.p(spHost, "spHost");
        kotlin.jvm.internal.m0.p("inmobi", "pubId");
        this.f56352a = hyperId;
        this.f56353b = spHost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3642ef)) {
            return false;
        }
        C3642ef c3642ef = (C3642ef) obj;
        return kotlin.jvm.internal.m0.g(this.f56352a, c3642ef.f56352a) && kotlin.jvm.internal.m0.g("i6i", "i6i") && kotlin.jvm.internal.m0.g(this.f56353b, c3642ef.f56353b) && kotlin.jvm.internal.m0.g("inmobi", "inmobi");
    }

    public final int hashCode() {
        return ((this.f56353b.hashCode() + (((this.f56352a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098;
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.f56352a + ", sspId=i6i, spHost=" + this.f56353b + ", pubId=inmobi" + gi.j.f86771d;
    }
}
