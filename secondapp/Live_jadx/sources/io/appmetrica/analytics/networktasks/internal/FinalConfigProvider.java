package io.appmetrica.analytics.networktasks.internal;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class FinalConfigProvider<T> implements ConfigProvider<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f98922a;

    public FinalConfigProvider(@l T t10) {
        this.f98922a = t10;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    @l
    public T getConfig() {
        return (T) this.f98922a;
    }
}
