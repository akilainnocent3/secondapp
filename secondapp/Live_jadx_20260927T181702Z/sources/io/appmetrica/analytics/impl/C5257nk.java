package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5257nk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f97992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f97993b;

    public C5257nk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f97992a = systemTimeProvider;
        this.f97993b = systemTimeProvider.currentTimeMillis();
    }
}
