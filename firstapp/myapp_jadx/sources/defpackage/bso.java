package defpackage;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class bso extends InputStream {
    public final InputStream a;
    public final dox b;
    public final Timer c;
    public long e;
    public long d = -1;
    public long f = -1;

    public bso(InputStream inputStream, dox doxVar, Timer timer) {
        this.c = timer;
        this.a = inputStream;
        this.b = doxVar;
        this.e = doxVar.d.i();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.a.available();
        } catch (IOException e) {
            Timer timer = this.c;
            dox doxVar = this.b;
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        dox doxVar = this.b;
        Timer timer = this.c;
        long jA = timer.a();
        if (this.f == -1) {
            this.f = jA;
        }
        try {
            this.a.close();
            long j = this.d;
            if (j != -1) {
                doxVar.n(j);
            }
            long j2 = this.e;
            if (j2 != -1) {
                doxVar.d.v(j2);
            }
            doxVar.p(this.f);
            doxVar.e();
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public final void d(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            this.d = j;
        } else {
            this.d = j2 + j;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Timer timer = this.c;
        dox doxVar = this.b;
        try {
            int i = this.a.read();
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i != -1 || this.f != -1) {
                d(1L);
                doxVar.n(this.d);
                return i;
            }
            this.f = jA;
            doxVar.p(jA);
            doxVar.e();
            return i;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.a.reset();
        } catch (IOException e) {
            Timer timer = this.c;
            dox doxVar = this.b;
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Timer timer = this.c;
        dox doxVar = this.b;
        try {
            long jSkip = this.a.skip(j);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (jSkip == 0 && j != 0 && this.f == -1) {
                this.f = jA;
                doxVar.p(jA);
                return jSkip;
            }
            d(jSkip);
            doxVar.n(this.d);
            return jSkip;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Timer timer = this.c;
        dox doxVar = this.b;
        try {
            int i3 = this.a.read(bArr, i, i2);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i3 == -1 && this.f == -1) {
                this.f = jA;
                doxVar.p(jA);
                doxVar.e();
                return i3;
            }
            d(i3);
            doxVar.n(this.d);
            return i3;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        Timer timer = this.c;
        dox doxVar = this.b;
        try {
            int i = this.a.read(bArr);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i == -1 && this.f == -1) {
                this.f = jA;
                doxVar.p(jA);
                doxVar.e();
                return i;
            }
            d(i);
            doxVar.n(this.d);
            return i;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }
}
