package defpackage;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class cso extends OutputStream {
    public final OutputStream a;
    public final Timer b;
    public final dox c;
    public long d = -1;

    public cso(OutputStream outputStream, dox doxVar, Timer timer) {
        this.a = outputStream;
        this.c = doxVar;
        this.b = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.d;
        dox doxVar = this.c;
        if (j != -1) {
            doxVar.i(j);
        }
        Timer timer = this.b;
        doxVar.d.t(timer.a());
        try {
            this.a.close();
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.a.flush();
        } catch (IOException e) {
            Timer timer = this.b;
            dox doxVar = this.c;
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        dox doxVar = this.c;
        try {
            this.a.write(i);
            long j = this.d + 1;
            this.d = j;
            doxVar.i(j);
        } catch (IOException e) {
            mqh.a(this.b, doxVar, doxVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        dox doxVar = this.c;
        try {
            this.a.write(bArr);
            long length = this.d + ((long) bArr.length);
            this.d = length;
            doxVar.i(length);
        } catch (IOException e) {
            mqh.a(this.b, doxVar, doxVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        dox doxVar = this.c;
        try {
            this.a.write(bArr, i, i2);
            long j = this.d + ((long) i2);
            this.d = j;
            doxVar.i(j);
        } catch (IOException e) {
            mqh.a(this.b, doxVar, doxVar);
            throw e;
        }
    }
}
