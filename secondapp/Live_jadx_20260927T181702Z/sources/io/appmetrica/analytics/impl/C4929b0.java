package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4929b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5536z0 f96984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xk f96985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3 f96986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f96987d = TimeUnit.SECONDS.toMillis(10);

    public C4929b0(C5536z0 c5536z0, Xk xk2, S3 s10) {
        this.f96984a = c5536z0;
        this.f96985b = xk2;
        this.f96986c = s10;
    }

    public final synchronized void a(final Context context, final AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f96984a.getClass();
        if (C5536z0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.f96985b.a();
        this.f96984a.getClass();
        C5511y0 c5511y0A = C5511y0.a(context);
        c5511y0A.f98637d.a(null, c5511y0A);
        IHandlerExecutor iHandlerExecutorA = this.f96986c.a();
        ((A9) iHandlerExecutorA).f95546b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.aq
            @Override // java.lang.Runnable
            public final void run() {
                C4929b0.a(this.f96979b, context, appMetricaLibraryAdapterConfig);
            }
        });
        this.f96984a.getClass();
        C5536z0.b();
    }

    public static final void a(C4929b0 c4929b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c4929b0.f96984a.getClass();
        C5511y0 c5511y0A = C5511y0.a(context);
        c5511y0A.f().a(appMetricaLibraryAdapterConfig);
        C4959c4.l().f97038c.a().execute(new RunnableC5487x1(c5511y0A.f98634a));
    }
}
