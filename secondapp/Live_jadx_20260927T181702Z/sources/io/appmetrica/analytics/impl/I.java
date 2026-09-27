package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class I implements Savable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f95923a;

    public I(J j10) {
        this.f95923a = j10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean getValue() {
        return Boolean.valueOf(this.f95923a.f95958a.a(false));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public final void a(boolean z10) {
        this.f95923a.f95958a.e(z10);
    }
}
