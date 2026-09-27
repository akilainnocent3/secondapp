package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5496xa implements HostRetryInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4918af f98578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ud f98579b;

    public C5496xa(@oy.l C4918af c4918af, @oy.l Ud ud2) {
        this.f98578a = c4918af;
        this.f98579b = ud2;
    }

    @oy.l
    public final Ud a() {
        return this.f98579b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f98578a.a(this.f98579b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f98578a.a(this.f98579b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j10) {
        this.f98578a.b(this.f98579b, j10).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i10) {
        this.f98578a.b(this.f98579b, i10).b();
    }
}
