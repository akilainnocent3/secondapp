package gf;

import af.n;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86610d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f86611e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f86612f = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f86613a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86615c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f86612f[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f86612f;
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
        return this.f86615c;
    }

    public long d(n nVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f86614b == 0) {
            if (!nVar.readFully(this.f86613a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f86613a[0] & 255);
            this.f86615c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f86614b = 1;
        }
        int i11 = this.f86615c;
        if (i11 > i10) {
            this.f86614b = 0;
            return -2L;
        }
        if (i11 != 1) {
            nVar.readFully(this.f86613a, 1, i11 - 1);
        }
        this.f86614b = 0;
        return a(this.f86613a, this.f86615c, z11);
    }

    public void e() {
        this.f86614b = 0;
        this.f86615c = 0;
    }
}
