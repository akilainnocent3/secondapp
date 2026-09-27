package pb;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte f120649g = 13;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte f120650h = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f120651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Charset f120652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f120653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f120654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f120655f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, c.this.f120652c.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f120651b) {
            try {
                if (this.f120653d != null) {
                    this.f120653d = null;
                    this.f120651b.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() throws IOException {
        InputStream inputStream = this.f120651b;
        byte[] bArr = this.f120653d;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f120654e = 0;
        this.f120655f = i10;
    }

    public boolean h() {
        return this.f120655f == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String k() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f120651b) {
            try {
                if (this.f120653d == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f120654e >= this.f120655f) {
                    d();
                }
                for (int i12 = this.f120654e; i12 != this.f120655f; i12++) {
                    byte[] bArr2 = this.f120653d;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f120654e;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] != 13) {
                                i11 = i12;
                            }
                        } else {
                            i11 = i12;
                        }
                        String str = new String(bArr2, i13, i11 - i13, this.f120652c.name());
                        this.f120654e = i12 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f120655f - this.f120654e) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f120653d;
                    int i14 = this.f120654e;
                    aVar.write(bArr3, i14, this.f120655f - i14);
                    this.f120655f = -1;
                    d();
                    i10 = this.f120654e;
                    while (i10 != this.f120655f) {
                        bArr = this.f120653d;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f120654e;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f120654e = i10 + 1;
                return aVar.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(d.f120657a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f120651b = inputStream;
        this.f120652c = charset;
        this.f120653d = new byte[i10];
    }
}
