package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f95332a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UtilityServiceConfiguration f95333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final UtilityServiceProvider f95334c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class FirstExecutionConditionChecker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f95335a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f95336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f95337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f95338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final FirstExecutionDelayChecker f95339e;
        public final String tag;

        public FirstExecutionConditionChecker(@Nullable UtilityServiceConfiguration utilityServiceConfiguration, @NonNull FirstExecutionDelayChecker firstExecutionDelayChecker, @NonNull String str) {
            this.f95339e = firstExecutionDelayChecker;
            this.f95337c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f95336b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f95338d = Long.MAX_VALUE;
            this.tag = str;
        }

        public final void a(long j10) {
            this.f95338d = TimeUnit.SECONDS.toMillis(j10);
        }

        public final boolean b() {
            if (this.f95335a) {
                return true;
            }
            return this.f95339e.delaySinceFirstStartupWasPassed(this.f95337c, this.f95336b, this.f95338d);
        }

        public final void a() {
            this.f95335a = true;
        }

        public final void a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f95337c = utilityServiceConfiguration.getInitialConfigTime();
            this.f95336b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j10, long j11, long j12) {
            return j11 - j10 >= j12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FirstExecutionConditionChecker f95340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f95341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ICommonExecutor f95342c;

        public /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i10) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean zB = this.f95340a.b();
            if (zB) {
                this.f95340a.a();
            }
            return zB;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j10) {
            this.f95340a.a(j10);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j10) {
            if (!this.f95340a.b()) {
                return false;
            }
            this.f95341b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j10), this.f95342c);
            this.f95340a.a();
            return true;
        }

        public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f95340a.a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f95341b = activationBarrierHelper;
            this.f95340a = firstExecutionConditionChecker;
            this.f95342c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(@NonNull UtilityServiceProvider utilityServiceProvider) {
        this.f95334c = utilityServiceProvider;
    }

    public final synchronized FirstExecutionHandler a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f95332a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    @NonNull
    public synchronized FirstExecutionDelayedTask createDelayedTask(@NonNull String str, @NonNull ICommonExecutor iCommonExecutor, @NonNull Runnable runnable) {
        return a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f95334c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f95333b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f95333b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f95332a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}
