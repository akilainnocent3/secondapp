package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Zc implements JsonParser, Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f96873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f96874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f96875c;

    public Zc(@oy.l RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f96873a = remoteConfigExtensionConfiguration;
        this.f96874b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f96875c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    @oy.l
    public final byte[] a(@oy.l Object obj) {
        return (byte[]) this.f96875c.fromModel(obj);
    }

    @oy.m
    public final Object b(@oy.l JSONObject jSONObject) {
        return this.f96874b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f96875c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f96874b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f96874b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f96875c.toModel((byte[]) obj);
    }

    @oy.l
    public final Object a(@oy.l JSONObject jSONObject) {
        return this.f96874b.parse(jSONObject);
    }

    @oy.l
    public final Object a(@oy.l byte[] bArr) {
        return this.f96875c.toModel(bArr);
    }

    @oy.l
    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f96873a;
    }
}
