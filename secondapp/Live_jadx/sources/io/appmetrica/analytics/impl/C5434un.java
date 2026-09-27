package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.un, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5434un implements TempCacheStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TempCacheStorage f98423a;

    public C5434un(@oy.l Context context, @oy.l Tm tm2, @oy.l TempCacheStorage tempCacheStorage) {
        this.f98423a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @oy.m
    public final TempCacheStorage.Entry get(@oy.l String str) {
        return this.f98423a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(@oy.l String str, long j10, @oy.l byte[] bArr) {
        return this.f98423a.put(str, j10, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j10) {
        this.f98423a.remove(j10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(@oy.l String str, long j10) {
        this.f98423a.removeOlderThan(str, j10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @oy.l
    public final Collection<TempCacheStorage.Entry> get(@oy.l String str, int i10) {
        return this.f98423a.get(str, i10);
    }
}
