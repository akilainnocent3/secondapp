package com.fyber.inneractive.sdk.util;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUnit f47912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t1 f47914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u1 f47916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f47917f;

    public v1(TimeUnit timeUnit, long j10) {
        this.f47915d = false;
        this.f47917f = 0L;
        this.f47913b = j10;
        this.f47912a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }

    public final void a(long j10) {
        long jUptimeMillis = (SystemClock.uptimeMillis() - j10) + 50 + this.f47917f;
        this.f47917f = jUptimeMillis;
        if (this.f47916e != null && jUptimeMillis > this.f47912a.toMillis(this.f47913b)) {
            this.f47916e.a();
            return;
        }
        t1 t1Var = this.f47914c;
        if (t1Var == null || this.f47916e == null) {
            return;
        }
        t1Var.removeMessages(1932593528);
        this.f47914c.sendEmptyMessageDelayed(1932593528, 50L);
    }

    public v1(TimeUnit timeUnit, long j10, long j11) {
        this.f47915d = false;
        this.f47913b = j10;
        this.f47912a = timeUnit;
        this.f47917f = j11;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }
}
