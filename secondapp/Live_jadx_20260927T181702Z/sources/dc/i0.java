package dc;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class i0 extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile byte[] f78743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wb.b f78748g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f78749b = -4338378848813561757L;

        public a(String str) {
            super(str);
        }
    }

    public i0(@NonNull InputStream inputStream, @NonNull wb.b bVar) {
        this(inputStream, bVar, 65536);
    }

    public static IOException h() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f78746e;
        if (i10 != -1) {
            int i11 = this.f78747f - i10;
            int i12 = this.f78745d;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f78744c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f78748g.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f78743b = bArr2;
                    this.f78748g.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f78747f - this.f78746e;
                this.f78747f = i13;
                this.f78746e = 0;
                this.f78744c = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f78747f;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f78744c = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f78746e = -1;
            this.f78747f = 0;
            this.f78744c = i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f78743b == null || inputStream == null) {
            throw h();
        }
        return (this.f78744c - this.f78747f) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f78743b != null) {
            this.f78748g.put(this.f78743b);
            this.f78743b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void d() {
        this.f78745d = this.f78743b.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f78745d = Math.max(this.f78745d, i10);
        this.f78746e = this.f78747f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f78743b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw h();
        }
        if (this.f78747f >= this.f78744c && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f78743b && (bArr = this.f78743b) == null) {
            throw h();
        }
        int i10 = this.f78744c;
        int i11 = this.f78747f;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f78747f = i11 + 1;
        return bArr[i11] & 255;
    }

    public synchronized void release() {
        if (this.f78743b != null) {
            this.f78748g.put(this.f78743b);
            this.f78743b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f78743b == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f78746e;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f78747f + " markLimit: " + this.f78745d);
        }
        this.f78747f = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f78743b;
        if (bArr == null) {
            throw h();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw h();
        }
        int i10 = this.f78744c;
        int i11 = this.f78747f;
        if (i10 - i11 >= j10) {
            this.f78747f = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f78747f = i10;
        if (this.f78746e == -1 || j10 > this.f78745d) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f78746e = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f78744c;
        int i13 = this.f78747f;
        if (i12 - i13 >= j10 - j11) {
            this.f78747f = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f78747f = i12;
        return j12;
    }

    @h1
    public i0(@NonNull InputStream inputStream, @NonNull wb.b bVar, int i10) {
        super(inputStream);
        this.f78746e = -1;
        this.f78748g = bVar;
        this.f78743b = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f78743b;
        if (bArr2 == null) {
            throw h();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f78747f;
            int i15 = this.f78744c;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f78747f += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f78746e == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f78743b && (bArr2 = this.f78743b) == null) {
                        throw h();
                    }
                    int i17 = this.f78744c;
                    int i18 = this.f78747f;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f78747f += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw h();
        }
    }
}
