package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class f extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f95465a;

    public f(h hVar) {
        this.f95465a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.f95465a.f95472f && (idSyncConfig = this.f95465a.f95471e) != null) {
            this.f95465a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.f95465a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.f95470d.a((RequestConfig) it.next());
                }
                h hVar2 = this.f95465a;
                IHandlerExecutor iHandlerExecutor = hVar2.f95469c;
                f fVar = hVar2.f95473g;
                if (fVar == null) {
                    m0.S("syncRunnable");
                    fVar = null;
                }
                iHandlerExecutor.executeDelayed(fVar, this.f95465a.f95468b);
            }
        }
    }
}
