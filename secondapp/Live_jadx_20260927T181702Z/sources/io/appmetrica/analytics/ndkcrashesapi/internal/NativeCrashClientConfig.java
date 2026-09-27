package io.appmetrica.analytics.ndkcrashesapi.internal;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class NativeCrashClientConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f98861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f98862b;

    public NativeCrashClientConfig(@l String str, @l String str2) {
        this.f98861a = str;
        this.f98862b = str2;
    }

    @l
    public final String getNativeCrashFolder() {
        return this.f98861a;
    }

    @l
    public final String getNativeCrashMetadata() {
        return this.f98862b;
    }
}
