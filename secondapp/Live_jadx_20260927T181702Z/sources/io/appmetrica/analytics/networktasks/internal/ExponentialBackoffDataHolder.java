package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class ExponentialBackoffDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f98916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeProvider f98917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f98918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f98919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f98920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f98921f;

    public ExponentialBackoffDataHolder(@NonNull HostRetryInfoProvider hostRetryInfoProvider, @NonNull String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f98920e = 1;
        this.f98919d = 0L;
        this.f98918c.saveNextSendAttemptNumber(1);
        this.f98918c.saveLastAttemptTimeSeconds(this.f98919d);
    }

    public void updateLastAttemptInfo() {
        long jCurrentTimeSeconds = this.f98917b.currentTimeSeconds();
        this.f98919d = jCurrentTimeSeconds;
        this.f98920e++;
        this.f98918c.saveLastAttemptTimeSeconds(jCurrentTimeSeconds);
        this.f98918c.saveNextSendAttemptNumber(this.f98920e);
    }

    public boolean wasLastAttemptLongAgoEnough(@Nullable RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j10 = this.f98919d;
            if (j10 != 0) {
                TimePassedChecker timePassedChecker = this.f98916a;
                int i10 = ((1 << (this.f98920e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i11 = retryPolicyConfig.maxIntervalSeconds;
                if (i10 > i11) {
                    i10 = i11;
                }
                return timePassedChecker.didTimePassSeconds(j10, i10, this.f98921f);
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f98918c = hostRetryInfoProvider;
        this.f98917b = systemTimeProvider;
        this.f98916a = timePassedChecker;
        this.f98919d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f98920e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f98921f = String.format("[ExponentialBackoffDataHolder-%s]", str);
    }
}
