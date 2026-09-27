package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cf f95686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeCrashClientModule f95687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I0 f95688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H0 f95689d;

    public Cd(Cf cf2) {
        this.f95686a = cf2;
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f95687b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f95688c = new I0();
    }
}
