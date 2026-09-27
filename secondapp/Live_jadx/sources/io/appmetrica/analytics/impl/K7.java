package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class K7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f96047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96049c;

    public K7(String str, HashMap map, String str2) {
        this.f96048b = str;
        this.f96047a = map;
        this.f96049c = str2;
    }

    public final String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f96047a + ", mDeeplink='" + this.f96048b + "', mUnparsedReferrer='" + this.f96049c + "'}";
    }
}
