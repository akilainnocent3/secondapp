package com.applovin.shadow.okio;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface Source extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(@oy.l Buffer buffer, long j10) throws IOException;

    @oy.l
    Timeout timeout();
}
