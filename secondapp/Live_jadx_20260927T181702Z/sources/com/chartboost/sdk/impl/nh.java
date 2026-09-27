package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class nh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40160c;

    public nh(long j10, long j11, long j12) {
        this.f40158a = j10;
        this.f40159b = j11;
        this.f40160c = j12;
    }

    public final long a() {
        return this.f40158a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh)) {
            return false;
        }
        nh nhVar = (nh) obj;
        return this.f40158a == nhVar.f40158a && this.f40159b == nhVar.f40159b && this.f40160c == nhVar.f40160c;
    }

    public int hashCode() {
        return (((f0.p.a(this.f40158a) * 31) + f0.p.a(this.f40159b)) * 31) + f0.p.a(this.f40160c);
    }

    public String toString() {
        return "TimeSourceBodyFields(currentTimeMillis=" + this.f40158a + ", nanoTime=" + this.f40159b + ", uptimeMillis=" + this.f40160c + gi.j.f86771d;
    }
}
