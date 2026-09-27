package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5010e4 implements ClientStorageProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5457vl f97241a;

    public C5010e4(@oy.l InterfaceC5457vl interfaceC5457vl) {
        this.f97241a = interfaceC5457vl;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    @oy.l
    public final ModulePreferences modulePreferences(@oy.l String str) {
        return new Yc(str, this.f97241a);
    }
}
