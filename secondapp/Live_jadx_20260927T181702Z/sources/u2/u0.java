package u2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final FileOutputStream f137885b;

    public u0(@oy.l FileOutputStream fileOutputStream) {
        kotlin.jvm.internal.m0.p(fileOutputStream, "fileOutputStream");
        this.f137885b = fileOutputStream;
    }

    @oy.l
    public final FileOutputStream d() {
        return this.f137885b;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f137885b.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f137885b.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(@oy.l byte[] b10) throws IOException {
        kotlin.jvm.internal.m0.p(b10, "b");
        this.f137885b.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(@oy.l byte[] bytes, int i10, int i11) throws IOException {
        kotlin.jvm.internal.m0.p(bytes, "bytes");
        this.f137885b.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
