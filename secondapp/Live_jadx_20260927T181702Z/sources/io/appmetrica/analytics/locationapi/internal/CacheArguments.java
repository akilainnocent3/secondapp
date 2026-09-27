package io.appmetrica.analytics.locationapi.internal;

import f0.p;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class CacheArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f98804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f98805b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(CacheArguments.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
        }
        CacheArguments cacheArguments = (CacheArguments) obj;
        return this.f98804a == cacheArguments.f98804a && this.f98805b == cacheArguments.f98805b;
    }

    public final long getOutdatedTimeInterval() {
        return this.f98805b;
    }

    public final long getRefreshPeriod() {
        return this.f98804a;
    }

    public int hashCode() {
        return p.a(this.f98805b) + (p.a(this.f98804a) * 31);
    }

    @l
    public String toString() {
        return "CacheArguments(refreshPeriod=" + this.f98804a + ", outdatedTimeInterval=" + this.f98805b + ')';
    }

    public CacheArguments(long j10, long j11) {
        this.f98804a = j10;
        this.f98805b = j11;
    }

    public /* synthetic */ CacheArguments(long j10, long j11, int i10, x xVar) {
        this((i10 & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j10, (i10 & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j11);
    }
}
