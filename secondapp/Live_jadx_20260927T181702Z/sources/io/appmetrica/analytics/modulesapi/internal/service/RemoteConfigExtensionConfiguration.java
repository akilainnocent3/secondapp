package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.List;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class RemoteConfigExtensionConfiguration<S> {
    @l
    public abstract Map<String, Integer> getBlocks();

    @l
    public abstract List<String> getFeatures();

    @l
    public abstract JsonParser<S> getJsonParser();

    @l
    public abstract Converter<S, byte[]> getProtobufConverter();

    @l
    public abstract RemoteConfigUpdateListener<S> getRemoteConfigUpdateListener();
}
