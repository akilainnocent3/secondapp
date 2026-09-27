package gj;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@k
@yi.a
public final class v extends FilterOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f86940b;

    public v(q hashFunction, OutputStream out) {
        super((OutputStream) zi.l0.E(out));
        this.f86940b = (s) zi.l0.E(hashFunction.i());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    public p d() {
        return this.f86940b.hash();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int b10) throws IOException {
        this.f86940b.g((byte) b10);
        ((FilterOutputStream) this).out.write(b10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bytes, int off, int len) throws IOException {
        this.f86940b.k(bytes, off, len);
        ((FilterOutputStream) this).out.write(bytes, off, len);
    }
}
