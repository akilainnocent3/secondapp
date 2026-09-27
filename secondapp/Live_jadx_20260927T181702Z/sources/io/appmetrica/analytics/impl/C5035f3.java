package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5035f3 implements CacheControlHttpsConnectionPerformer.Client {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkClientWithCacheControl f97317a;

    public C5035f3(@oy.l NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f97317a = networkClientWithCacheControl;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    @oy.m
    public final String getOldETag() {
        return this.f97317a.getETag();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onError() {
        this.f97317a.onError();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onNotModified() {
        this.f97317a.onNotModified();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onResponse(@oy.l String str, @oy.l byte[] bArr) {
        this.f97317a.onResponse(str, bArr);
    }
}
