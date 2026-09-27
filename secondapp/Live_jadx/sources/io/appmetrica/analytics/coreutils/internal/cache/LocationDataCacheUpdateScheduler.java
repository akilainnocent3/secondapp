package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f95312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f95313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f95314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f95315d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f95316e = new b(this);

    public LocationDataCacheUpdateScheduler(@NonNull ICommonExecutor iCommonExecutor, @NonNull ILastKnownUpdater iLastKnownUpdater, @NonNull UpdateConditionsChecker updateConditionsChecker, @NonNull String str) {
        this.f95312a = iCommonExecutor;
        this.f95313b = iLastKnownUpdater;
        this.f95314c = updateConditionsChecker;
        String.format("[LocationDataCacheUpdateScheduler-%s]", str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f95312a.remove(this.f95315d);
        this.f95312a.executeDelayed(this.f95315d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f95312a.execute(this.f95316e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f95312a.remove(this.f95315d);
        this.f95312a.remove(this.f95316e);
    }
}
