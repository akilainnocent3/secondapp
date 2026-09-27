package yads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fk extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f149140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f149141b = false;

    public fk(File file) {
        this.f149140a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f149141b) {
            return;
        }
        this.f149141b = true;
        this.f149140a.flush();
        try {
            this.f149140a.getFD().sync();
        } catch (IOException e10) {
            ih1.d("AtomicFile", ih1.a("Failed to sync file descriptor:", e10));
        }
        this.f149140a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f149140a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f149140a.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f149140a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f149140a.write(bArr, i10, i11);
    }
}
