package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5570k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f99093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f99094c;

    public C5570k(boolean z10, List list, long j10) {
        this.f99092a = z10;
        this.f99093b = list;
        this.f99094c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.m0.g(C5570k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C5570k c5570k = (C5570k) obj;
        return this.f99092a == c5570k.f99092a && kotlin.jvm.internal.m0.g(this.f99093b, c5570k.f99093b) && this.f99094c == c5570k.f99094c;
    }

    public final int hashCode() {
        return f0.p.a(this.f99094c) + ((this.f99093b.hashCode() + (g8.a.a(this.f99092a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f99092a + ", mediaStoreColumnNames=" + this.f99093b + ", detectWindowSeconds=" + this.f99094c + ')';
    }

    public C5570k(B b10) {
        this(b10.b(), b10.c(), b10.a());
    }
}
