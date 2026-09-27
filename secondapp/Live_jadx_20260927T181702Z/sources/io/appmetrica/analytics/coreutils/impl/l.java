package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class l extends o0 implements ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UtilityServiceProvider f95303a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.f95303a = utilityServiceProvider;
    }

    @Override // ds.a
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.f95303a);
    }
}
