package com.mbridge.msdk.config.component.load.downloader.core;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface p<T> {
    p<T> a(com.mbridge.msdk.config.component.load.downloader.c cVar);

    p<T> a(com.mbridge.msdk.config.component.load.downloader.h hVar);

    d<T> build();

    p<T> withHttpRetryCounter(int i10);

    p<T> withTimeout(long j10);
}
