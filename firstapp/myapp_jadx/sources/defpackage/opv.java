package defpackage;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public interface opv extends vr, y8d, Closeable {
    void c1();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().d(10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.y8d
    default x8d n() {
        return x8d.a;
    }

    rm8 shutdown();
}
