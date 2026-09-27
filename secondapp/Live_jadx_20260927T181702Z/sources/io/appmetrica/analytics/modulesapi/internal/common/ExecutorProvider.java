package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.Executor;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface ExecutorProvider {
    @l
    IHandlerExecutor getDefaultExecutor();

    @l
    InterruptionSafeThread getInterruptionThread(@l String str, @l String str2, @l Runnable runnable);

    @l
    IHandlerExecutor getModuleExecutor();

    @l
    Executor getReportRunnableExecutor();

    @l
    IHandlerExecutor getSupportIOExecutor();

    @l
    Executor getUiExecutor();
}
