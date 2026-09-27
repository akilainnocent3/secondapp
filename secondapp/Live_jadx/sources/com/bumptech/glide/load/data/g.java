package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f31436d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f31437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f31438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f31439g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f31440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31441c;

    static {
        byte[] bArr = {-1, l3.a.C7, 0, 28, 69, rg.a.f127263w, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, zi.c.f161643u, 0, 2, 0, 0, 0, 1, 0};
        f31437e = bArr;
        int length = bArr.length;
        f31438f = length;
        f31439g = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f31440b = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10;
        int i11;
        int i12 = this.f31441c;
        if (i12 < 2 || i12 > (i11 = f31439g)) {
            i10 = super.read();
        } else {
            i10 = i12 == i11 ? this.f31440b : f31437e[i12 - 2] & 255;
        }
        if (i10 != -1) {
            this.f31441c++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f31441c = (int) (((long) this.f31441c) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f31441c;
        int i14 = f31439g;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f31440b;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f31437e, this.f31441c - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f31441c += i12;
        }
        return i12;
    }
}
