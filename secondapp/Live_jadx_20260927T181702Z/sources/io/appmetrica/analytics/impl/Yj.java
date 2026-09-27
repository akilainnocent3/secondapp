package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f96845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4918af f96846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeProvider f96847c;

    public static Yj c() {
        return Xj.f96757a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f96845a;
    }

    public final synchronized void b() {
        this.f96846b.d(false);
        this.f96846b.b();
    }

    public final synchronized long d() {
        return this.f96845a;
    }

    public final synchronized void e() {
        a(C5272oa.I.y(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f96846b.b(true);
    }

    public final synchronized void a(long j10, @Nullable Long l10) {
        try {
            this.f96845a = (j10 - this.f96847c.currentTimeMillis()) / 1000;
            boolean z10 = true;
            if (this.f96846b.b(true)) {
                if (l10 != null) {
                    long jAbs = Math.abs(j10 - this.f96847c.currentTimeMillis());
                    C4918af c4918af = this.f96846b;
                    if (jAbs <= TimeUnit.SECONDS.toMillis(l10.longValue())) {
                        z10 = false;
                    }
                    c4918af.d(z10);
                } else {
                    this.f96846b.d(false);
                }
            }
            this.f96846b.d(this.f96845a);
            this.f96846b.b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @k.h1
    public final void a(C4918af c4918af, TimeProvider timeProvider) {
        this.f96846b = c4918af;
        this.f96845a = c4918af.a(0);
        this.f96847c = timeProvider;
    }
}
