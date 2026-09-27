package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nMetadataReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataReader.kt\ncom/unity3d/ads/core/configuration/MetadataReader\n*L\n1#1,24:1\n8#1,6:25\n*S KotlinDebug\n*F\n+ 1 MetadataReader.kt\ncom/unity3d/ads/core/configuration/MetadataReader\n*L\n17#1:25,6\n*E\n"})
public abstract class MetadataReader<T> {

    @l
    private final JsonStorage jsonStorage;

    @l
    private final String key;

    public MetadataReader(@l JsonStorage jsonStorage, @l String key) {
        m0.p(jsonStorage, "jsonStorage");
        m0.p(key, "key");
        this.jsonStorage = jsonStorage;
        this.key = key;
    }

    public static /* synthetic */ Object read$default(MetadataReader metadataReader, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        Object obj3 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj3 == null) {
            return obj;
        }
        m0.y(3, "T");
        return obj3;
    }

    public static /* synthetic */ Object readAndDelete$default(MetadataReader metadataReader, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAndDelete");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        Object obj3 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj3 != null) {
            m0.o(obj3, "get(key)");
            m0.y(3, "T");
            obj = obj3;
        }
        Object obj4 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj4 != null) {
            m0.o(obj4, "get(key)");
            metadataReader.getJsonStorage().delete(metadataReader.getKey());
        }
        return obj;
    }

    @l
    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    @l
    public final String getKey() {
        return this.key;
    }

    public final /* synthetic */ <T> T read(T t10) {
        T t11 = (T) getJsonStorage().get(getKey());
        if (t11 == null) {
            return t10;
        }
        m0.y(3, "T");
        return t11;
    }

    public final /* synthetic */ <T> T readAndDelete(T t10) {
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            m0.o(obj, "get(key)");
            m0.y(3, "T");
            t10 = (T) obj;
        }
        Object obj2 = getJsonStorage().get(getKey());
        if (obj2 != null) {
            m0.o(obj2, "get(key)");
            getJsonStorage().delete(getKey());
        }
        return t10;
    }
}
