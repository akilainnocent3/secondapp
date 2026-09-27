package ij;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@r
@yi.d
public final class p extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f94386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f94387c;

    public p(InputStream in2) {
        super((InputStream) zi.l0.E(in2));
        this.f94387c = -1L;
    }

    public long d() {
        return this.f94386b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int readlimit) {
        ((FilterInputStream) this).in.mark(readlimit);
        this.f94387c = this.f94386b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f94386b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f94387c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f94386b = this.f94387c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long n10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(n10);
        this.f94386b += jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] b10, int off, int len) throws IOException {
        int i10 = ((FilterInputStream) this).in.read(b10, off, len);
        if (i10 != -1) {
            this.f94386b += (long) i10;
        }
        return i10;
    }
}
