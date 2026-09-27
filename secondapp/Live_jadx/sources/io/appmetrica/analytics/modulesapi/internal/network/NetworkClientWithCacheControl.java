package io.appmetrica.analytics.modulesapi.internal.network;

import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface NetworkClientWithCacheControl {
    @m
    String getETag();

    void onError();

    void onNotModified();

    void onResponse(@l String str, @l byte[] bArr);
}
