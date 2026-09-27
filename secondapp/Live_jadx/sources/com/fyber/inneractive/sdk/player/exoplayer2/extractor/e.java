package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45757l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f45762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45763r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45746a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f45747b = new int[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f45748c = new long[1000];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f45751f = new long[1000];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f45750e = new int[1000];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f45749d = new int[1000];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[][] f45752g = new byte[1000][];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] f45753h = new com.fyber.inneractive.sdk.player.exoplayer2.o[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f45758m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f45759n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45761p = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45760o = true;

    public final synchronized void a(long j10, int i10, long j11, int i11, byte[] bArr) {
        try {
            if (this.f45760o) {
                if ((i10 & 1) == 0) {
                    return;
                } else {
                    this.f45760o = false;
                }
            }
            if (this.f45761p) {
                throw new IllegalStateException();
            }
            b(j10);
            long[] jArr = this.f45751f;
            int i12 = this.f45757l;
            jArr[i12] = j10;
            long[] jArr2 = this.f45748c;
            jArr2[i12] = j11;
            this.f45749d[i12] = i11;
            this.f45750e[i12] = i10;
            this.f45752g[i12] = bArr;
            this.f45753h[i12] = this.f45762q;
            this.f45747b[i12] = this.f45763r;
            int i13 = this.f45754i + 1;
            this.f45754i = i13;
            int i14 = this.f45746a;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                int[] iArr = new int[i15];
                long[] jArr3 = new long[i15];
                long[] jArr4 = new long[i15];
                int[] iArr2 = new int[i15];
                int[] iArr3 = new int[i15];
                byte[][] bArr2 = new byte[i15][];
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i15];
                int i16 = this.f45756k;
                int i17 = i14 - i16;
                System.arraycopy(jArr2, i16, jArr3, 0, i17);
                System.arraycopy(this.f45751f, this.f45756k, jArr4, 0, i17);
                System.arraycopy(this.f45750e, this.f45756k, iArr2, 0, i17);
                System.arraycopy(this.f45749d, this.f45756k, iArr3, 0, i17);
                System.arraycopy(this.f45752g, this.f45756k, bArr2, 0, i17);
                System.arraycopy(this.f45753h, this.f45756k, oVarArr, 0, i17);
                System.arraycopy(this.f45747b, this.f45756k, iArr, 0, i17);
                int i18 = this.f45756k;
                System.arraycopy(this.f45748c, 0, jArr3, i17, i18);
                System.arraycopy(this.f45751f, 0, jArr4, i17, i18);
                System.arraycopy(this.f45750e, 0, iArr2, i17, i18);
                System.arraycopy(this.f45749d, 0, iArr3, i17, i18);
                System.arraycopy(this.f45752g, 0, bArr2, i17, i18);
                System.arraycopy(this.f45753h, 0, oVarArr, i17, i18);
                System.arraycopy(this.f45747b, 0, iArr, i17, i18);
                this.f45748c = jArr3;
                this.f45751f = jArr4;
                this.f45750e = iArr2;
                this.f45749d = iArr3;
                this.f45752g = bArr2;
                this.f45753h = oVarArr;
                this.f45747b = iArr;
                this.f45756k = 0;
                int i19 = this.f45746a;
                this.f45757l = i19;
                this.f45754i = i19;
                this.f45746a = i15;
            } else {
                int i20 = i12 + 1;
                this.f45757l = i20;
                if (i20 == i14) {
                    this.f45757l = 0;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(long j10) {
        this.f45759n = Math.max(this.f45759n, j10);
    }

    public final synchronized boolean a(long j10) {
        try {
            if (this.f45758m >= j10) {
                return false;
            }
            int i10 = this.f45754i;
            while (i10 > 0 && this.f45751f[((this.f45756k + i10) - 1) % this.f45746a] >= j10) {
                i10--;
            }
            int i11 = this.f45755j;
            int i12 = this.f45754i;
            int i13 = (i11 + i12) - (i10 + i11);
            if (i13 < 0 || i13 > i12) {
                throw new IllegalArgumentException();
            }
            if (i13 != 0) {
                int i14 = i12 - i13;
                this.f45754i = i14;
                int i15 = this.f45757l;
                int i16 = this.f45746a;
                this.f45757l = ((i15 + i16) - i13) % i16;
                this.f45759n = Long.MIN_VALUE;
                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                    int i18 = (this.f45756k + i17) % this.f45746a;
                    this.f45759n = Math.max(this.f45759n, this.f45751f[i18]);
                    if ((this.f45750e[i18] & 1) != 0) {
                        break;
                    }
                }
                long j11 = this.f45748c[this.f45757l];
            } else if (i11 != 0) {
                int i19 = this.f45757l;
                if (i19 == 0) {
                    i19 = this.f45746a;
                }
                int i20 = i19 - 1;
                long j12 = this.f45748c[i20];
                int i21 = this.f45749d[i20];
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
