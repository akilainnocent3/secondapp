package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Je extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f54913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3923pk f54914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f54915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ai f54916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f54917f;

    public Je(String url, HashMap map, C3923pk c3923pk, Map map2, Ai ai2, boolean z10, int i10) {
        map = (i10 & 2) != 0 ? null : map;
        c3923pk = (i10 & 4) != 0 ? null : c3923pk;
        map2 = (i10 & 8) != 0 ? null : map2;
        ai2 = (i10 & 16) != 0 ? null : ai2;
        z10 = (i10 & 32) != 0 ? true : z10;
        kotlin.jvm.internal.m0.p(url, "url");
        this.f54912a = url;
        this.f54913b = map;
        this.f54914c = c3923pk;
        this.f54915d = map2;
        this.f54916e = ai2;
        this.f54917f = z10;
        String strA = Se.a(url, map2);
        kotlin.jvm.internal.m0.p(strA, "<set-?>");
        this.f54912a = strA;
    }

    @Override // com.inmobi.media.Me
    public final Map a() {
        return this.f54913b;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return this.f54916e;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f54912a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Je)) {
            return false;
        }
        Je je2 = (Je) obj;
        return kotlin.jvm.internal.m0.g(this.f54912a, je2.f54912a) && kotlin.jvm.internal.m0.g(this.f54913b, je2.f54913b) && kotlin.jvm.internal.m0.g(this.f54914c, je2.f54914c) && kotlin.jvm.internal.m0.g(this.f54915d, je2.f54915d) && kotlin.jvm.internal.m0.g(this.f54916e, je2.f54916e) && this.f54917f == je2.f54917f;
    }

    public final int hashCode() {
        int iHashCode = this.f54912a.hashCode() * 31;
        Map map = this.f54913b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C3923pk c3923pk = this.f54914c;
        int iHashCode3 = (iHashCode2 + (c3923pk == null ? 0 : c3923pk.hashCode())) * 31;
        Map map2 = this.f54915d;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Ai ai2 = this.f54916e;
        return g8.a.a(this.f54917f) + ((iHashCode4 + (ai2 != null ? ai2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GetRequest(url='" + this.f54912a + "', headers=" + this.f54913b + ", queryParams=" + this.f54915d + ", retryPolicy=" + this.f54916e + ", timeouts=" + this.f54914c + ", followRedirects=" + this.f54917f + gi.j.f86771d;
    }
}
