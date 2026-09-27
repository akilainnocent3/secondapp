package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Bl implements L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95632a;

    public Bl(@oy.l Context context) {
        this.f95632a = context;
    }

    @oy.l
    public final Context b() {
        return this.f95632a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    @oy.m
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.L2, io.appmetrica.analytics.impl.InterfaceC5209lm
    public final void a(@oy.l C5080gm c5080gm) {
    }
}
