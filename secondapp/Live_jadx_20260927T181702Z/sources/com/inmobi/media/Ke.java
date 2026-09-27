package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ke extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3923pk f54999b;

    public Ke(String url, C3923pk c3923pk) {
        kotlin.jvm.internal.m0.p(url, "url");
        this.f54998a = url;
        this.f54999b = c3923pk;
    }

    @Override // com.inmobi.media.Me
    public final Map a() {
        return null;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return null;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f54998a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ke)) {
            return false;
        }
        Ke ke2 = (Ke) obj;
        return kotlin.jvm.internal.m0.g(this.f54998a, ke2.f54998a) && kotlin.jvm.internal.m0.g(null, null) && kotlin.jvm.internal.m0.g(this.f54999b, ke2.f54999b) && kotlin.jvm.internal.m0.g(null, null);
    }

    public final int hashCode() {
        return g8.a.a(true) + ((this.f54999b.hashCode() + (this.f54998a.hashCode() * 961)) * 961);
    }

    public final String toString() {
        return "HeadRequest(url=" + this.f54998a + ", headers=" + ((Object) null) + ", timeouts=" + this.f54999b + ", retryPolicy=" + ((Object) null) + ", followRedirects=true" + gi.j.f86771d;
    }
}
