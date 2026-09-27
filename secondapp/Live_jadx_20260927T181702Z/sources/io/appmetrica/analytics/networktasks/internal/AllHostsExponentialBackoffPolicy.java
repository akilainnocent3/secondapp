package io.appmetrica.analytics.networktasks.internal;

import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AllHostsExponentialBackoffPolicy implements ExponentialBackoffPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExponentialBackoffDataHolder f98905a;

    public AllHostsExponentialBackoffPolicy(@l ExponentialBackoffDataHolder exponentialBackoffDataHolder) {
        this.f98905a = exponentialBackoffDataHolder;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public boolean canBeExecuted(@m RetryPolicyConfig retryPolicyConfig) {
        return this.f98905a.wasLastAttemptLongAgoEnough(retryPolicyConfig);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onAllHostsAttemptsFinished(boolean z10) {
        if (z10) {
            this.f98905a.reset();
        } else {
            this.f98905a.updateLastAttemptInfo();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onHostAttemptFinished(boolean z10) {
    }
}
