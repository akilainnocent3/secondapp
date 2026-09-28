package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bnc implements Closeable {
    public m730<Executor> a;
    public znn b;
    public m730 c;
    public ln70 d;
    public m730<String> e;
    public m730<fq60> f;
    public m730<dvg0> i;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f.get().close();
    }
}
