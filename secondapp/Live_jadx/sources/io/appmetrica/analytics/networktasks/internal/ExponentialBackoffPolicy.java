package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface ExponentialBackoffPolicy {
    boolean canBeExecuted(@Nullable RetryPolicyConfig retryPolicyConfig);

    void onAllHostsAttemptsFinished(boolean z10);

    void onHostAttemptFinished(boolean z10);
}
