package com.inmobi.media;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f54643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f54644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f54645c;

    public Fi(Yj telemetryConfigMetaData, double d10, List samplingEvents) {
        kotlin.jvm.internal.m0.p(telemetryConfigMetaData, "telemetryConfigMetaData");
        kotlin.jvm.internal.m0.p(samplingEvents, "samplingEvents");
        this.f54643a = telemetryConfigMetaData;
        this.f54644b = d10;
        this.f54645c = samplingEvents;
        kotlin.jvm.internal.m0.o(Fi.class.getSimpleName(), "getSimpleName(...)");
    }

    public final boolean a(String eventType, Map keyValueMap) {
        kotlin.jvm.internal.m0.p(keyValueMap, "keyValueMap");
        kotlin.jvm.internal.m0.p(eventType, "eventType");
        Yj yj2 = this.f54643a;
        if (yj2.f55845e && !yj2.f55846f.contains(eventType)) {
            return false;
        }
        if (keyValueMap.isEmpty() || !kotlin.jvm.internal.m0.g(eventType, "AssetDownloaded") || !keyValueMap.containsKey("assetType")) {
            return true;
        }
        if (kotlin.jvm.internal.m0.g("image", keyValueMap.get("assetType")) && !this.f54643a.f55842b) {
            Wj wj2 = Wj.f55736a;
            return false;
        }
        if (kotlin.jvm.internal.m0.g("gif", keyValueMap.get("assetType")) && !this.f54643a.f55843c) {
            Wj wj3 = Wj.f55736a;
            return false;
        }
        if (!kotlin.jvm.internal.m0.g("video", keyValueMap.get("assetType")) || this.f54643a.f55844d) {
            return true;
        }
        Wj wj4 = Wj.f55736a;
        return false;
    }

    public final int a(String eventType) {
        kotlin.jvm.internal.m0.p(eventType, "eventType");
        if (!this.f54645c.contains(eventType)) {
            return 1;
        }
        if (this.f54644b < this.f54643a.f55847g) {
            Wj wj2 = Wj.f55736a;
            return 2;
        }
        Wj wj3 = Wj.f55736a;
        return 0;
    }
}
