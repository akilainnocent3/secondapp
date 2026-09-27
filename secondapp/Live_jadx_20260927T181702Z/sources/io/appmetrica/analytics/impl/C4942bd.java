package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4942bd implements ModuleServiceLifecycleController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K1 f97017a;

    public C4942bd(@oy.l K1 k10) {
        this.f97017a = k10;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(@oy.l final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f97017a.b(new J1() { // from class: io.appmetrica.analytics.impl.bq
            @Override // io.appmetrica.analytics.impl.J1
            public final void a(Intent intent) {
                C4942bd.a(moduleServiceLifecycleObserver, intent);
            }
        });
        this.f97017a.a(new J1() { // from class: io.appmetrica.analytics.impl.cq
            @Override // io.appmetrica.analytics.impl.J1
            public final void a(Intent intent) {
                C4942bd.b(moduleServiceLifecycleObserver, intent);
            }
        });
    }
}
