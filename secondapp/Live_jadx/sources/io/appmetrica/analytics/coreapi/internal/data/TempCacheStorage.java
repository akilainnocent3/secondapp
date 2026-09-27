package io.appmetrica.analytics.coreapi.internal.data;

import java.util.Collection;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface TempCacheStorage {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Entry {
        @l
        byte[] getData();

        long getId();

        @l
        String getScope();

        long getTimestamp();
    }

    @m
    Entry get(@l String str);

    @l
    Collection<Entry> get(@l String str, int i10);

    long put(@l String str, long j10, @l byte[] bArr);

    void remove(long j10);

    void removeOlderThan(@l String str, long j10);
}
