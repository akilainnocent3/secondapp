package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes8.dex */
public final class tal implements uw90 {
    public final x740 a;
    public final Deflater b;
    public final dkd c;
    public boolean d;
    public final CRC32 e;

    public tal(bc5 bc5Var) {
        bc5Var.getClass();
        x740 x740Var = new x740(bc5Var);
        this.a = x740Var;
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        this.c = new dkd(x740Var, deflater);
        this.e = new CRC32();
        lb5 lb5Var = x740Var.b;
        lb5Var.l0(8075);
        lb5Var.d0(8);
        lb5Var.d0(0);
        lb5Var.g0(0);
        lb5Var.d0(0);
        lb5Var.d0(0);
    }

    @Override // defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.b;
        x740 x740Var = this.a;
        lb5 lb5Var = x740Var.b;
        if (this.d) {
            return;
        }
        try {
            dkd dkdVar = this.c;
            dkdVar.b.finish();
            dkdVar.d(false);
            int value = (int) this.e.getValue();
            if (x740Var.c) {
                throw new IllegalStateException("closed");
            }
            lb5Var.g0(l.c(value));
            x740Var.d();
            int bytesRead = (int) deflater.getBytesRead();
            if (x740Var.c) {
                throw new IllegalStateException("closed");
            }
            lb5Var.g0(l.c(bytesRead));
            x740Var.d();
            th = null;
            try {
                deflater.end();
            } catch (Throwable th) {
                if (th == null) {
                    th = th;
                }
            }
            try {
                x740Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.d = true;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.uw90, java.io.Flushable
    public final void flush() throws IOException {
        this.c.flush();
    }

    @Override // defpackage.uw90
    public final sxf0 timeout() {
        return this.a.a.timeout();
    }

    @Override // defpackage.uw90
    public final void write(lb5 lb5Var, long j) throws IOException {
        lb5Var.getClass();
        if (j < 0) {
            kb5.a(avg.a(j, "byteCount < 0: "));
            return;
        }
        if (j == 0) {
            return;
        }
        e580 e580Var = lb5Var.a;
        e580Var.getClass();
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, e580Var.c - e580Var.b);
            this.e.update(e580Var.a, e580Var.b, iMin);
            j2 -= (long) iMin;
            e580Var = e580Var.f;
            e580Var.getClass();
        }
        this.c.write(lb5Var, j);
    }
}
