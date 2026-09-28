package defpackage;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public interface tft extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().d(10L, TimeUnit.SECONDS);
    }

    default rm8 j() {
        return rm8.e;
    }

    void s1(m0b m0bVar, p340 p340Var);

    default rm8 shutdown() {
        return j();
    }
}
