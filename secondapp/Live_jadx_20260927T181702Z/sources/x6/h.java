package x6;

import f6.v;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f144733d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f144734e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f144735f = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f144736a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f144737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144738c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f144735f[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f144735f;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f144738c;
    }

    public long d(v vVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f144737b == 0) {
            if (!vVar.readFully(this.f144736a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f144736a[0] & 255);
            this.f144738c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f144737b = 1;
        }
        int i11 = this.f144738c;
        if (i11 > i10) {
            this.f144737b = 0;
            return -2L;
        }
        if (i11 != 1) {
            vVar.readFully(this.f144736a, 1, i11 - 1);
        }
        this.f144737b = 0;
        return a(this.f144736a, this.f144738c, z11);
    }

    public void e() {
        this.f144737b = 0;
        this.f144738c = 0;
    }
}
