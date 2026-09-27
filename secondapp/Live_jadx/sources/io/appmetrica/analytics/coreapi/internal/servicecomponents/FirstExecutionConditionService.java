package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface FirstExecutionConditionService {
    @l
    FirstExecutionDelayedTask createDelayedTask(@l String str, @l ICommonExecutor iCommonExecutor, @l Runnable runnable);
}
