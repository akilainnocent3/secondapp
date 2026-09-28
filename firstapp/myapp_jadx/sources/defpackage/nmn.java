package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class nmn implements zpa0 {
    public final InputStream a;
    public final sxf0 b;

    public nmn(InputStream inputStream, sxf0 sxf0Var) {
        inputStream.getClass();
        sxf0Var.getClass();
        this.a = inputStream;
        this.b = sxf0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.zpa0
    public final long read(lb5 lb5Var, long j) throws IOException {
        lb5Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            kb5.a(avg.a(j, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.b.throwIfReached();
            e580 e580VarB0 = lb5Var.b0(1);
            int i = this.a.read(e580VarB0.a, e580VarB0.c, (int) Math.min(j, 8192 - e580VarB0.c));
            if (i != -1) {
                e580VarB0.c += i;
                long j2 = i;
                lb5Var.b += j2;
                return j2;
            }
            if (e580VarB0.b != e580VarB0.c) {
                return -1L;
            }
            lb5Var.a = e580VarB0.a();
            h580.a(e580VarB0);
            return -1L;
        } catch (AssertionError e) {
            if (cdk0.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.zpa0
    public final sxf0 timeout() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.a + ')';
    }
}
