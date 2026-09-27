package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Lg implements RemoteConfigMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f96110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96111b;

    public Lg(long j10, long j11) {
        this.f96110a = j10;
        this.f96111b = j11;
    }

    @oy.l
    public final Lg a(long j10, long j11) {
        return new Lg(j10, j11);
    }

    public final long b() {
        return this.f96111b;
    }

    public final boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lg)) {
            return false;
        }
        Lg lg2 = (Lg) obj;
        return this.f96110a == lg2.f96110a && this.f96111b == lg2.f96111b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f96110a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f96111b;
    }

    public final int hashCode() {
        return f0.p.a(this.f96111b) + (f0.p.a(this.f96110a) * 31);
    }

    @oy.l
    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f96110a + ", lastUpdateTime=" + this.f96111b + ')';
    }

    public final long a() {
        return this.f96110a;
    }

    public static Lg a(Lg lg2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = lg2.f96110a;
        }
        if ((i10 & 2) != 0) {
            j11 = lg2.f96111b;
        }
        lg2.getClass();
        return new Lg(j10, j11);
    }
}
