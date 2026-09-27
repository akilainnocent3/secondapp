package com.yandex.div.core;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface Disposable extends AutoCloseable, Closeable {

    @oy.l
    public static final Companion Companion = Companion.$$INSTANCE;

    @oy.l
    @cs.g
    public static final Disposable NULL = new Disposable() { // from class: com.yandex.div.core.a
        @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
        public final void close() {
            b.a();
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    void close();
}
