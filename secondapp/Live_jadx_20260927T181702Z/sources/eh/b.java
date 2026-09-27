package eh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f80904c = "AtomicFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f80905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f80906b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FileOutputStream f80907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f80908c = false;

        public a(File file) throws FileNotFoundException {
            this.f80907b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f80908c) {
                return;
            }
            this.f80908c = true;
            flush();
            try {
                this.f80907b.getFD().sync();
            } catch (IOException e10) {
                h0.o("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f80907b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f80907b.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f80907b.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f80907b.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f80907b.write(bArr, i10, i11);
        }
    }

    public b(File file) {
        this.f80905a = file;
        this.f80906b = new File(file.getPath() + ".bak");
    }

    public void a() {
        this.f80905a.delete();
        this.f80906b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f80906b.delete();
    }

    public boolean c() {
        return this.f80905a.exists() || this.f80906b.exists();
    }

    public InputStream d() throws FileNotFoundException {
        e();
        return new FileInputStream(this.f80905a);
    }

    public final void e() {
        if (this.f80906b.exists()) {
            this.f80905a.delete();
            this.f80906b.renameTo(this.f80905a);
        }
    }

    public OutputStream f() throws IOException {
        if (this.f80905a.exists()) {
            if (this.f80906b.exists()) {
                this.f80905a.delete();
            } else if (!this.f80905a.renameTo(this.f80906b)) {
                h0.n("AtomicFile", "Couldn't rename file " + this.f80905a + " to backup file " + this.f80906b);
            }
        }
        try {
            return new a(this.f80905a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f80905a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f80905a, e10);
            }
            try {
                return new a(this.f80905a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f80905a, e11);
            }
        }
    }
}
