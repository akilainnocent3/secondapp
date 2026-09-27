package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class dc {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicInteger f74684g = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f74685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f74686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f74687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f74688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f74689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f74690f;

    public dc(Looper looper) {
        this.f74685a = new Handler(looper, new bc(this));
        this.f74686b = new Handler(looper);
    }

    public final void a(Runnable runnable) {
        boolean z10;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                long j10 = -SystemClock.elapsedRealtime();
                synchronized (this) {
                    this.f74688d = false;
                    this.f74685a.sendEmptyMessage(0);
                    wait(2000L);
                    z10 = this.f74688d;
                }
                long jElapsedRealtime = j10 + SystemClock.elapsedRealtime();
                int i10 = this.f74690f;
                if (i10 < 8) {
                    this.f74690f = i10 + 1;
                    this.f74689e += jElapsedRealtime;
                } else {
                    long j11 = this.f74689e;
                    this.f74689e = (jElapsedRealtime - (j11 / ((long) i10))) + j11;
                }
                if (!z10) {
                    this.f74689e = 0L;
                    this.f74690f = 0;
                    synchronized (this) {
                        wait(5000L);
                    }
                } else {
                    if (this.f74689e < 160) {
                        this.f74686b.post(runnable);
                        this.f74689e = 0L;
                        this.f74690f = 0;
                        return;
                    }
                    synchronized (this) {
                        wait(200L);
                    }
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th2) {
                d9.a(th2);
                return;
            }
        }
    }
}
