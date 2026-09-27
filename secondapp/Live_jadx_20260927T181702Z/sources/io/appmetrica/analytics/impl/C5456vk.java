package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5456vk implements ModuleRemoteConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f98489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f98490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f98491c;

    public C5456vk(@oy.l SdkIdentifiers sdkIdentifiers, @oy.l RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f98489a = sdkIdentifiers;
        this.f98490b = remoteConfigMetaInfo;
        this.f98491c = obj;
    }

    @oy.l
    public final C5456vk a(@oy.l SdkIdentifiers sdkIdentifiers, @oy.l RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C5456vk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    @oy.l
    public final RemoteConfigMetaInfo b() {
        return this.f98490b;
    }

    public final Object c() {
        return this.f98491c;
    }

    public final boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5456vk)) {
            return false;
        }
        C5456vk c5456vk = (C5456vk) obj;
        return kotlin.jvm.internal.m0.g(this.f98489a, c5456vk.f98489a) && kotlin.jvm.internal.m0.g(this.f98490b, c5456vk.f98490b) && kotlin.jvm.internal.m0.g(this.f98491c, c5456vk.f98491c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f98491c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @oy.l
    public final SdkIdentifiers getIdentifiers() {
        return this.f98489a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @oy.l
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f98490b;
    }

    public final int hashCode() {
        int iHashCode = (this.f98490b.hashCode() + (this.f98489a.hashCode() * 31)) * 31;
        Object obj = this.f98491c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @oy.l
    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f98489a + ", remoteConfigMetaInfo=" + this.f98490b + ", featuresConfig=" + this.f98491c + ')';
    }

    @oy.l
    public final SdkIdentifiers a() {
        return this.f98489a;
    }

    public static C5456vk a(C5456vk c5456vk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            sdkIdentifiers = c5456vk.f98489a;
        }
        if ((i10 & 2) != 0) {
            remoteConfigMetaInfo = c5456vk.f98490b;
        }
        if ((i10 & 4) != 0) {
            obj = c5456vk.f98491c;
        }
        c5456vk.getClass();
        return new C5456vk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
