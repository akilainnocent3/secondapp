package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class M implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f96124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hi f96125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f96126c;

    public M(N n10, Context context, Hi hi2) {
        this.f96126c = n10;
        this.f96124a = context;
        this.f96125b = hi2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f96126c.f96186a.a(this.f96124a, this.f96125b);
    }
}
