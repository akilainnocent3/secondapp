package io.appmetrica.analytics.modulesapi.internal.service;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface ServiceContext {
    @l
    ActivationBarrier getActivationBarrier();

    @l
    ActiveNetworkTypeProvider getActiveNetworkTypeProvider();

    @l
    ApplicationStateProvider getApplicationStateProvider();

    @l
    ChargeTypeProvider getChargeTypeProvider();

    @l
    Context getContext();

    @l
    CryptoProvider getCryptoProvider();

    @l
    DataSendingRestrictionController getDataSendingRestrictionController();

    @l
    ExecutorProvider getExecutorProvider();

    @l
    FirstExecutionConditionService getFirstExecutionConditionService();

    @l
    LocationServiceApi getLocationServiceApi();

    @l
    ModuleServiceLifecycleController getModuleServiceLifecycleController();

    @l
    ServiceNetworkContext getNetworkContext();

    @l
    PermissionExtractor getPermissionExtractor();

    @l
    PlatformIdentifiers getPlatformIdentifiers();

    @l
    SdkEnvironmentProvider getSdkEnvironmentProvider();

    @l
    ModuleSelfReporter getSelfReporter();

    @l
    ServiceModuleReporterComponentLifecycle getServiceModuleReporterComponentLifecycle();

    @l
    ServiceStorageProvider getServiceStorageProvider();

    @l
    ServiceWakeLock getServiceWakeLock();
}
