package io.appmetrica.analytics.reporterextension.internal;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ReporterExtensionClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f99017a = "reporter_extension";

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @l
    public String getIdentifier() {
        return this.f99017a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(@l ClientContext clientContext) {
        super.initClientSide(clientContext);
        if (clientContext.getProcessDetector().isMainProcess()) {
            clientContext.getClientActivator().activate(clientContext.getContext());
        }
    }
}
