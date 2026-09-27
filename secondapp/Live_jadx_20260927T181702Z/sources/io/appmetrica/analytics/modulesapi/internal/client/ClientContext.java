package io.appmetrica.analytics.modulesapi.internal.client;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface ClientContext {
    @l
    ActivityLifecycleRegistry getActivityLifecycleRegistry();

    @l
    ModuleClientActivator getClientActivator();

    @l
    ModuleClientExecutorProvider getClientExecutorProvider();

    @l
    ClientStorageProvider getClientStorageProvider();

    @l
    Context getContext();

    @l
    InternalClientModuleFacade getInternalClientModuleFacade();

    @l
    ModuleAdRevenueContext getModuleAdRevenueContext();

    @l
    ProcessDetector getProcessDetector();
}
