package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class L implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f96082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f96083b;

    public L(N n10, Context context) {
        this.f96083b = n10;
        this.f96082a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f96083b.f96186a.a(this.f96082a);
    }
}
