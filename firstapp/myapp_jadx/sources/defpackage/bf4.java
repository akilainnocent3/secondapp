package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes8.dex */
public final class bf4 implements uw90 {
    @Override // defpackage.uw90
    public final sxf0 timeout() {
        return sxf0.NONE;
    }

    @Override // defpackage.uw90
    public final void write(lb5 lb5Var, long j) throws EOFException {
        lb5Var.getClass();
        lb5Var.skip(j);
    }

    @Override // defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.uw90, java.io.Flushable
    public final void flush() {
    }
}
