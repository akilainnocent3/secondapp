package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class fr5 implements xpc {
    public final br5 a;
    public final long b;
    public gqc c;
    public long d;
    public File e;
    public OutputStream f;
    public long g;
    public long h;
    public lo50 i;

    public static final class a extends br5.a {
    }

    public fr5(br5 br5Var) {
        br5Var.getClass();
        this.a = br5Var;
        this.b = 5242880L;
    }

    @Override // defpackage.xpc
    public final void a(gqc gqcVar) throws a {
        int i = gqcVar.i;
        gqcVar.h.getClass();
        if (gqcVar.g == -1 && (i & 2) == 2) {
            this.c = null;
            return;
        }
        this.c = gqcVar;
        this.d = (i & 4) == 4 ? this.b : Long.MAX_VALUE;
        this.h = 0L;
        try {
            c(gqcVar);
        } catch (IOException e) {
            throw new a(e);
        }
    }

    public final void b() {
        OutputStream outputStream = this.f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            jrh0.g(this.f);
            this.f = null;
            File file = this.e;
            this.e = null;
            this.a.f(file, this.g);
        } catch (Throwable th) {
            jrh0.g(this.f);
            this.f = null;
            File file2 = this.e;
            this.e = null;
            file2.delete();
            throw th;
        }
    }

    public final void c(gqc gqcVar) {
        long j = gqcVar.g;
        long jMin = j != -1 ? Math.min(j - this.h, this.d) : -1L;
        String str = gqcVar.h;
        String str2 = jrh0.a;
        this.e = this.a.k(gqcVar.f + this.h, str, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        lo50 lo50Var = this.i;
        if (lo50Var == null) {
            this.i = new lo50(fileOutputStream, 20480);
        } else {
            lo50Var.d(fileOutputStream);
        }
        this.f = this.i;
        this.g = 0L;
    }

    @Override // defpackage.xpc
    public final void close() throws a {
        if (this.c == null) {
            return;
        }
        try {
            b();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // defpackage.xpc
    public final void write(byte[] bArr, int i, int i2) throws a {
        gqc gqcVar = this.c;
        if (gqcVar == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.g == this.d) {
                    b();
                    c(gqcVar);
                }
                int iMin = (int) Math.min(i2 - i3, this.d - this.g);
                OutputStream outputStream = this.f;
                String str = jrh0.a;
                outputStream.write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.g += j;
                this.h += j;
            } catch (IOException e) {
                throw new a(e);
            }
        }
    }
}
