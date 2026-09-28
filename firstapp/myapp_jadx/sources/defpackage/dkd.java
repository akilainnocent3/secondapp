package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes8.dex */
public final class dkd implements uw90 {
    public final x740 a;
    public final Deflater b;
    public boolean c;

    public dkd(x740 x740Var, Deflater deflater) {
        this.a = x740Var;
        this.b = deflater;
    }

    @Override // defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.b;
        if (this.c) {
            return;
        }
        deflater.finish();
        d(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    public final void d(boolean z) throws IOException {
        e580 e580VarB0;
        int iDeflate;
        x740 x740Var = this.a;
        lb5 lb5Var = x740Var.b;
        while (true) {
            e580VarB0 = lb5Var.b0(1);
            byte[] bArr = e580VarB0.a;
            int i = e580VarB0.c;
            Deflater deflater = this.b;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                e580VarB0.c += iDeflate;
                lb5Var.b += (long) iDeflate;
                x740Var.d();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (e580VarB0.b == e580VarB0.c) {
            lb5Var.a = e580VarB0.a();
            h580.a(e580VarB0);
        }
    }

    @Override // defpackage.uw90, java.io.Flushable
    public final void flush() throws IOException {
        d(true);
        this.a.flush();
    }

    @Override // defpackage.uw90
    public final sxf0 timeout() {
        return this.a.a.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.a + ')';
    }

    @Override // defpackage.uw90
    public final void write(lb5 lb5Var, long j) throws IOException {
        lb5Var.getClass();
        l.b(lb5Var.b, 0L, j);
        while (true) {
            Deflater deflater = this.b;
            if (j <= 0) {
                deflater.setInput(gdk0.a, 0, 0);
                return;
            }
            e580 e580Var = lb5Var.a;
            e580Var.getClass();
            int iMin = (int) Math.min(j, e580Var.c - e580Var.b);
            deflater.setInput(e580Var.a, e580Var.b, iMin);
            d(false);
            long j2 = iMin;
            lb5Var.b -= j2;
            int i = e580Var.b + iMin;
            e580Var.b = i;
            if (i == e580Var.c) {
                lb5Var.a = e580Var.a();
                h580.a(e580Var);
            }
            j -= j2;
        }
    }
}
