package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5036f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f97318a;

    public C5036f4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f97318a.elapsedRealtime();
    }

    public C5036f4(SystemTimeProvider systemTimeProvider) {
        this.f97318a = systemTimeProvider;
    }
}
