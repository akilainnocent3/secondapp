package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes8.dex */
public final class lgn implements zpa0 {
    public final y740 a;
    public final Inflater b;
    public int c;
    public boolean d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lgn(zpa0 zpa0Var, Inflater inflater) {
        this(new y740(zpa0Var), inflater);
        zpa0Var.getClass();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    public final long d(lb5 lb5Var, long j) throws IOException {
        Inflater inflater = this.b;
        lb5Var.getClass();
        if (j < 0) {
            kb5.a(avg.a(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.d) {
            ib5.a("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                e580 e580VarB0 = lb5Var.b0(1);
                int iMin = (int) Math.min(j, 8192 - e580VarB0.c);
                boolean zNeedsInput = inflater.needsInput();
                y740 y740Var = this.a;
                if (zNeedsInput && !y740Var.N0()) {
                    e580 e580Var = y740Var.b.a;
                    e580Var.getClass();
                    int i = e580Var.c;
                    int i2 = e580Var.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(e580Var.a, i2, i3);
                }
                int iInflate = inflater.inflate(e580VarB0.a, e580VarB0.c, iMin);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.c -= remaining;
                    y740Var.skip(remaining);
                }
                if (iInflate > 0) {
                    e580VarB0.c += iInflate;
                    long j2 = iInflate;
                    lb5Var.b += j2;
                    return j2;
                }
                if (e580VarB0.b == e580VarB0.c) {
                    lb5Var.a = e580VarB0.a();
                    h580.a(e580VarB0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // defpackage.zpa0
    public final long read(lb5 lb5Var, long j) throws IOException {
        lb5Var.getClass();
        do {
            long jD = d(lb5Var, j);
            if (jD > 0) {
                return jD;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.N0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.zpa0
    public final sxf0 timeout() {
        return this.a.a.timeout();
    }

    public lgn(y740 y740Var, Inflater inflater) {
        this.a = y740Var;
        this.b = inflater;
    }
}
