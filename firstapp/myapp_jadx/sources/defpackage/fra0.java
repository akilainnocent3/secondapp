package defpackage;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public interface fra0 extends Closeable {
    boolean B1();

    boolean C();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().d(10L, TimeUnit.SECONDS);
    }

    default rm8 j() {
        return rm8.e;
    }

    void r0(at70 at70Var);

    void r1(m0b m0bVar, at70 at70Var);

    default rm8 shutdown() {
        return j();
    }
}
