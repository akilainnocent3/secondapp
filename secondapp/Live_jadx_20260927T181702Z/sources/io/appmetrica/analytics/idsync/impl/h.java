package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f95467a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f95469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f95470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile IdSyncConfig f95471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f95472f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95468b = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f95473g = new f(this);

    public h(ServiceContext serviceContext) {
        this.f95467a = serviceContext;
        this.f95469c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f95470d = new p(serviceContext, new B(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")));
    }

    public static boolean a(IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        return idSyncConfig.getEnabled() && !idSyncConfig.getRequests().isEmpty();
    }

    public final synchronized void b(IdSyncConfig idSyncConfig) {
        try {
            if (!m0.g(this.f95471e, idSyncConfig)) {
                this.f95471e = idSyncConfig;
                if (a(idSyncConfig) && !this.f95472f) {
                    this.f95467a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f95469c, new g(this));
                    this.f95472f = true;
                } else if (!a(idSyncConfig) && this.f95472f) {
                    this.f95472f = false;
                    IHandlerExecutor iHandlerExecutor = this.f95469c;
                    f fVar = this.f95473g;
                    if (fVar == null) {
                        m0.S("syncRunnable");
                        fVar = null;
                    }
                    iHandlerExecutor.remove(fVar);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
