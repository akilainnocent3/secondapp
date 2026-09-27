package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5287p0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f98090k = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f98092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IAppMetricaService f98094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f98095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f98096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G1 f98097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final H1 f98098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RunnableC5237n0 f98099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ServiceConnectionC5262o0 f98100j;

    public C5287p0(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, C4959c4.l().e(), new H1());
    }

    public final synchronized boolean a() {
        return this.f98094d != null;
    }

    public final void b() {
        synchronized (this.f98096f) {
            this.f98092b.remove(this.f98099i);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f98092b;
        synchronized (this.f98096f) {
            try {
                iCommonExecutor.remove(this.f98099i);
                if (!this.f98093c) {
                    iCommonExecutor.executeDelayed(this.f98099i, f98090k);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Long l10) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f98095e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l10.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (InterruptedException unused) {
        }
    }

    public C5287p0(Context context, ICommonExecutor iCommonExecutor, G1 g10, H1 h10) {
        this.f98094d = null;
        this.f98096f = new Object();
        this.f98099i = new RunnableC5237n0(this);
        this.f98100j = new ServiceConnectionC5262o0(this);
        this.f98091a = context.getApplicationContext();
        this.f98092b = iCommonExecutor;
        this.f98093c = false;
        this.f98097g = g10;
        this.f98098h = h10;
    }
}
