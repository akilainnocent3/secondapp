package io.appmetrica.analytics.locationapi.internal;

import f0.p;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class LocationFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f98806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f98807b;

    public LocationFilter() {
        this(0L, 0.0f, 3, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(LocationFilter.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
        }
        LocationFilter locationFilter = (LocationFilter) obj;
        return this.f98806a == locationFilter.f98806a && this.f98807b == locationFilter.f98807b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f98807b;
    }

    public final long getUpdateTimeInterval() {
        return this.f98806a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f98807b) + (p.a(this.f98806a) * 31);
    }

    @l
    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f98806a + ", updateDistanceInterval=" + this.f98807b + ')';
    }

    public LocationFilter(long j10, float f10) {
        this.f98806a = j10;
        this.f98807b = f10;
    }

    public /* synthetic */ LocationFilter(long j10, float f10, int i10, x xVar) {
        this((i10 & 1) != 0 ? 5000L : j10, (i10 & 2) != 0 ? 10.0f : f10);
    }
}
