package x4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f144157c = "AtomicFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f144158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f144159b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FileOutputStream f144160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f144161c = false;

        public a(File file) throws FileNotFoundException {
            this.f144160b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f144161c) {
                return;
            }
            this.f144161c = true;
            flush();
            try {
                this.f144160b.getFD().sync();
            } catch (IOException e10) {
                d0.o("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f144160b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f144160b.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f144160b.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f144160b.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f144160b.write(bArr, i10, i11);
        }
    }

    public b(File file) {
        this.f144158a = file;
        this.f144159b = new File(file.getPath() + ".bak");
    }

    public void a() {
        this.f144158a.delete();
        this.f144159b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f144159b.delete();
    }

    public boolean c() {
        return this.f144158a.exists() || this.f144159b.exists();
    }

    public InputStream d() throws FileNotFoundException {
        e();
        return new FileInputStream(this.f144158a);
    }

    public final void e() {
        if (this.f144159b.exists()) {
            this.f144158a.delete();
            this.f144159b.renameTo(this.f144158a);
        }
    }

    public OutputStream f() throws IOException {
        if (this.f144158a.exists()) {
            if (this.f144159b.exists()) {
                this.f144158a.delete();
            } else if (!this.f144158a.renameTo(this.f144159b)) {
                d0.n("AtomicFile", "Couldn't rename file " + this.f144158a + " to backup file " + this.f144159b);
            }
        }
        try {
            return new a(this.f144158a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f144158a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f144158a, e10);
            }
            try {
                return new a(this.f144158a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f144158a, e11);
            }
        }
    }
}
