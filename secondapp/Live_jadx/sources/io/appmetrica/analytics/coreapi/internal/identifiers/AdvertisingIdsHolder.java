package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;
import fw.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class AdvertisingIdsHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f95230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f95231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f95232c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    @NonNull
    public AdTrackingInfoResult getGoogle() {
        return this.f95230a;
    }

    @NonNull
    public AdTrackingInfoResult getHuawei() {
        return this.f95231b;
    }

    @NonNull
    public AdTrackingInfoResult getYandex() {
        return this.f95232c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f95230a + ", mHuawei=" + this.f95231b + ", yandex=" + this.f95232c + b.f85383j;
    }

    public AdvertisingIdsHolder(@NonNull AdTrackingInfoResult adTrackingInfoResult, @NonNull AdTrackingInfoResult adTrackingInfoResult2, @NonNull AdTrackingInfoResult adTrackingInfoResult3) {
        this.f95230a = adTrackingInfoResult;
        this.f95231b = adTrackingInfoResult2;
        this.f95232c = adTrackingInfoResult3;
    }
}
