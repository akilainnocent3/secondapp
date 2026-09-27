package pc;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f120690c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f120691d = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f120692b;

    public k(@NonNull InputStream inputStream) {
        super(inputStream);
        this.f120692b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i10 = this.f120692b;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public final long h(long j10) {
        int i10 = this.f120692b;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    public final void i(long j10) {
        int i10 = this.f120692b;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f120692b = (int) (((long) i10) - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f120692b = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (h(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        i(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f120692b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jH = h(j10);
        if (jH == -1) {
            return 0L;
        }
        long jSkip = super.skip(jH);
        i(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int iH = (int) h(i11);
        if (iH == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iH);
        i(i12);
        return i12;
    }
}
