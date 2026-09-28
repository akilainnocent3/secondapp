package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class waz implements uw90 {
    public final OutputStream a;
    public final sxf0 b;

    public waz(OutputStream outputStream, sxf0 sxf0Var) {
        outputStream.getClass();
        this.a = outputStream;
        this.b = sxf0Var;
    }

    @Override // defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.uw90, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.uw90
    public final sxf0 timeout() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + this.a + ')';
    }

    @Override // defpackage.uw90
    public final void write(lb5 lb5Var, long j) throws IOException {
        lb5Var.getClass();
        l.b(lb5Var.b, 0L, j);
        while (j > 0) {
            this.b.throwIfReached();
            e580 e580Var = lb5Var.a;
            e580Var.getClass();
            int iMin = (int) Math.min(j, e580Var.c - e580Var.b);
            this.a.write(e580Var.a, e580Var.b, iMin);
            int i = e580Var.b + iMin;
            e580Var.b = i;
            long j2 = iMin;
            j -= j2;
            lb5Var.b -= j2;
            if (i == e580Var.c) {
                lb5Var.a = e580Var.a();
                h580.a(e580Var);
            }
        }
    }
}
