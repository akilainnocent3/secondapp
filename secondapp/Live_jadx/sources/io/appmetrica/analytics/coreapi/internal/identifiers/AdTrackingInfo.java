package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class AdTrackingInfo {

    @Nullable
    public final String advId;

    @Nullable
    public final Boolean limitedAdTracking;

    @NonNull
    public final Provider provider;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Provider {
        GOOGLE,
        HMS,
        YANDEX
    }

    public AdTrackingInfo(@NonNull Provider provider, @Nullable String str, @Nullable Boolean bool) {
        this.provider = provider;
        this.advId = str;
        this.limitedAdTracking = bool;
    }

    public String toString() {
        return "AdTrackingInfo{provider=" + this.provider + ", advId='" + this.advId + "', limitedAdTracking=" + this.limitedAdTracking + b.f85383j;
    }
}
