package io.appmetrica.analytics.modulesapi.internal.service;

import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.File;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface ServiceStorageProvider {
    @l
    <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(@l String str, @l ProtobufStateSerializer<P> protobufStateSerializer, @l ProtobufConverter<T, P> protobufConverter);

    @m
    File getAppDataStorage();

    @m
    File getAppFileStorage();

    @l
    SQLiteOpenHelper getDbStorage();

    @m
    File getSdkDataStorage();

    @l
    TempCacheStorage getTempCacheStorage();

    @l
    ModulePreferences legacyModulePreferences();

    @l
    ModulePreferences modulePreferences(@l String str);
}
