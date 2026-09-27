package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Le extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f55066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3923pk f55067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC4045ui f55068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ai f55069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f55070f;

    public Le(String url, Map map, C3923pk c3923pk, AbstractC4045ui abstractC4045ui, Ai ai2, int i10) {
        map = (i10 & 2) != 0 ? null : map;
        c3923pk = (i10 & 4) != 0 ? null : c3923pk;
        ai2 = (i10 & 16) != 0 ? null : ai2;
        kotlin.jvm.internal.m0.p(url, "url");
        this.f55065a = url;
        this.f55066b = map;
        this.f55067c = c3923pk;
        this.f55068d = abstractC4045ui;
        this.f55069e = ai2;
        this.f55070f = true;
    }

    @Override // com.inmobi.media.Me
    public final Map a() {
        return this.f55066b;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return this.f55069e;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f55065a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Le)) {
            return false;
        }
        Le le2 = (Le) obj;
        return kotlin.jvm.internal.m0.g(this.f55065a, le2.f55065a) && kotlin.jvm.internal.m0.g(this.f55066b, le2.f55066b) && kotlin.jvm.internal.m0.g(this.f55067c, le2.f55067c) && kotlin.jvm.internal.m0.g(this.f55068d, le2.f55068d) && kotlin.jvm.internal.m0.g(this.f55069e, le2.f55069e) && this.f55070f == le2.f55070f;
    }

    public final int hashCode() {
        int iHashCode = this.f55065a.hashCode() * 31;
        Map map = this.f55066b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C3923pk c3923pk = this.f55067c;
        int iHashCode3 = (iHashCode2 + (c3923pk == null ? 0 : c3923pk.hashCode())) * 31;
        AbstractC4045ui abstractC4045ui = this.f55068d;
        int iHashCode4 = (iHashCode3 + (abstractC4045ui == null ? 0 : abstractC4045ui.hashCode())) * 31;
        Ai ai2 = this.f55069e;
        return g8.a.a(this.f55070f) + ((iHashCode4 + (ai2 != null ? ai2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PostRequest(url='" + this.f55065a + "', headers=" + this.f55066b + ", body=" + this.f55068d + ", retryPolicy=" + this.f55069e + ", timeouts=" + this.f55067c + ", followRedirects=" + this.f55070f + gi.j.f86771d;
    }
}
