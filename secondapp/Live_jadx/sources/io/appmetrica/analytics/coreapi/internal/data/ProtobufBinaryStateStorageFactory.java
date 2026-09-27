package io.appmetrica.analytics.coreapi.internal.data;

import android.content.Context;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface ProtobufBinaryStateStorageFactory<T> {
    @l
    ProtobufStateStorage<T> create(@l Context context);

    @l
    ProtobufStateStorage<T> createForMigration(@l Context context);
}
