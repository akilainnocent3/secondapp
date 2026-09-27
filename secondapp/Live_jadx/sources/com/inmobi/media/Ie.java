package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f54847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f54848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54850d;

    public Ie(long j10, Map headers, int i10, String str) {
        kotlin.jvm.internal.m0.p(headers, "headers");
        this.f54847a = j10;
        this.f54848b = headers;
        this.f54849c = i10;
        this.f54850d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ie)) {
            return false;
        }
        Ie ie2 = (Ie) obj;
        return this.f54847a == ie2.f54847a && kotlin.jvm.internal.m0.g(this.f54848b, ie2.f54848b) && this.f54849c == ie2.f54849c && kotlin.jvm.internal.m0.g(this.f54850d, ie2.f54850d);
    }

    public final int hashCode() {
        int iA = AbstractC3671fi.a(this.f54849c, (this.f54848b.hashCode() + (f0.p.a(this.f54847a) * 31)) * 31, 31);
        String str = this.f54850d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NetworkMetaData(timeTaken=" + this.f54847a + ", headers=" + this.f54848b + ", contentLength=" + this.f54849c + ", contentType=" + this.f54850d + gi.j.f86771d;
    }
}
