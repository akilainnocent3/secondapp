package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5330qi implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSendingRestrictionController f98202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98203b = "data restriction based";

    public C5330qi(@oy.l DataSendingRestrictionController dataSendingRestrictionController) {
        this.f98202a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        return !this.f98202a.isRestrictedForSdk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @oy.l
    public final String description() {
        return this.f98203b;
    }
}
