package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f95350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f95351b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class ActivationBarrierHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f95352a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f95353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f95354c;

        public ActivationBarrierHelper(@NonNull Runnable runnable, @NonNull WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f95353b = new a(this, runnable);
            this.f95354c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j10, @NonNull ICommonExecutor iCommonExecutor) {
            if (this.f95352a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f95354c.subscribe(j10, iCommonExecutor, this.f95353b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f95350a = this.f95351b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j10, @NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j10 - (this.f95351b.currentTimeMillis() - this.f95350a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f95351b = systemTimeProvider;
    }
}
