package ij;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@r
@yi.d
public final class q extends FilterOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f94388b;

    public q(OutputStream out) {
        super((OutputStream) zi.l0.E(out));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    public long d() {
        return this.f94388b;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] b10, int off, int len) throws IOException {
        ((FilterOutputStream) this).out.write(b10, off, len);
        this.f94388b += (long) len;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int b10) throws IOException {
        ((FilterOutputStream) this).out.write(b10);
        this.f94388b++;
    }
}
