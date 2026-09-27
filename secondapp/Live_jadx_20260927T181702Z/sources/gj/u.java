package gj;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@k
@yi.a
public final class u extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f86939b;

    public u(q hashFunction, InputStream in2) {
        super((InputStream) zi.l0.E(in2));
        this.f86939b = (s) zi.l0.E(hashFunction.i());
    }

    public p d() {
        return this.f86939b.hash();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @qj.a
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f86939b.g((byte) i10);
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @qj.a
    public int read(byte[] bytes, int off, int len) throws IOException {
        int i10 = ((FilterInputStream) this).in.read(bytes, off, len);
        if (i10 != -1) {
            this.f86939b.k(bytes, off, i10);
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int readlimit) {
    }
}
