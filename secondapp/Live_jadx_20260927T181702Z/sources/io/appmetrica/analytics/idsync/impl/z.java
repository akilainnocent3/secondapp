package io.appmetrica.analytics.idsync.impl;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95518c;

    public z(String str, long j10, int i10) {
        this.f95516a = str;
        this.f95517b = j10;
        this.f95518c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return m0.g(this.f95516a, zVar.f95516a) && this.f95517b == zVar.f95517b && this.f95518c == zVar.f95518c;
    }

    public final int hashCode() {
        return v.a(this.f95518c) + ((f0.p.a(this.f95517b) + (this.f95516a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.f95516a + ", lastAttempt=" + this.f95517b + ", lastAttemptResult=" + u.b(this.f95518c) + ')';
    }
}
