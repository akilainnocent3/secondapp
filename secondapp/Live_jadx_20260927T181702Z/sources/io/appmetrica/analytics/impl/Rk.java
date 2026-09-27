package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo f96420a;

    public Rk(yo yoVar) {
        this.f96420a = yoVar;
    }

    public final long a() {
        long jOptLong;
        yo yoVar = this.f96420a;
        synchronized (yoVar) {
            jOptLong = yoVar.f98688a.a().optLong("session_id", -1L);
        }
        long j10 = jOptLong >= 10000000000L ? 1 + jOptLong : 10000000000L;
        this.f96420a.b(j10);
        return j10;
    }
}
