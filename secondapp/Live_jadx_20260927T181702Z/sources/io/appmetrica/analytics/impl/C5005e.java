package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5005e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f97223g = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f97224h = "WatchDog-" + Ad.f95550a.incrementAndGet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f97225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f97226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f97227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4980d f97228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f97229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f97230f;

    public C5005e(Eb eb2) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f97225a = copyOnWriteArrayList;
        this.f97226b = new AtomicInteger();
        this.f97227c = new Handler(Looper.getMainLooper());
        this.f97229e = new AtomicBoolean();
        this.f97230f = new Runnable() { // from class: io.appmetrica.analytics.impl.fq
            @Override // java.lang.Runnable
            public final void run() {
                this.f97393b.a();
            }
        };
        copyOnWriteArrayList.add(eb2);
    }

    public final /* synthetic */ void a() {
        this.f97229e.set(true);
    }

    public final synchronized void b() {
        C4980d c4980d = this.f97228d;
        if (c4980d != null) {
            c4980d.f97150a.set(false);
            this.f97228d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i10) {
        AtomicInteger atomicInteger = this.f97226b;
        int i11 = 5;
        if (i10 >= 5) {
            i11 = i10;
        }
        atomicInteger.set(i11);
        if (this.f97228d == null) {
            C4980d c4980d = new C4980d(this);
            this.f97228d = c4980d;
            try {
                c4980d.setName(f97224h);
            } catch (SecurityException unused) {
            }
            this.f97228d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i10));
        }
    }
}
