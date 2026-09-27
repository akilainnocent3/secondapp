package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f47130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47132c;

    public n() {
    }

    public final int a() {
        byte[] bArr = this.f47130a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int b() {
        byte[] bArr = this.f47130a;
        int i10 = this.f47131b;
        int i11 = i10 + 1;
        this.f47131b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f47131b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f47131b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f47131b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public final void c(int i10) {
        this.f47130a = a() < i10 ? new byte[i10] : this.f47130a;
        this.f47132c = i10;
        this.f47131b = 0;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 > this.f47130a.length) {
            throw new IllegalArgumentException();
        }
        this.f47132c = i10;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 > this.f47132c) {
            throw new IllegalArgumentException();
        }
        this.f47131b = i10;
    }

    public final int f() {
        byte[] bArr = this.f47130a;
        int i10 = this.f47131b;
        int i11 = i10 + 1;
        this.f47131b = i11;
        int i12 = bArr[i10] & 255;
        this.f47131b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long g() {
        byte[] bArr = this.f47130a;
        int i10 = this.f47131b;
        int i11 = i10 + 1;
        this.f47131b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f47131b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f47131b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f47131b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f47131b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f47131b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f47131b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f47131b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public final void h() {
        int i10 = this.f47132c;
        int i11 = this.f47131b;
        if (i10 - i11 == 0) {
            return;
        }
        while (i11 < this.f47132c && this.f47130a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f47130a;
        int i12 = this.f47131b;
        new String(bArr, i12, i11 - i12);
        this.f47131b = i11;
        if (i11 < this.f47132c) {
            this.f47131b = i11 + 1;
        }
    }

    public final int i() {
        return (j() << 21) | (j() << 14) | (j() << 7) | j();
    }

    public final int j() {
        byte[] bArr = this.f47130a;
        int i10 = this.f47131b;
        this.f47131b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long k() {
        byte[] bArr = this.f47130a;
        int i10 = this.f47131b;
        int i11 = i10 + 1;
        this.f47131b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f47131b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f47131b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f47131b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public final int l() {
        byte[] bArr = this.f47130a;
        int i10 = this.f47131b;
        int i11 = i10 + 1;
        this.f47131b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f47131b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f47131b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public final int m() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Top bit not zero: ", iB));
    }

    public final long n() {
        long jG = g();
        if (jG >= 0) {
            return jG;
        }
        throw new IllegalStateException("Top bit not zero: " + jG);
    }

    public final int o() {
        byte[] bArr = this.f47130a;
        int i10 = this.f47131b;
        int i11 = i10 + 1;
        this.f47131b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f47131b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public n(int i10) {
        this.f47130a = new byte[i10];
        this.f47132c = i10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f47130a, this.f47131b, bArr, i10, i11);
        this.f47131b += i11;
    }

    public final String b(int i10) {
        String str = new String(this.f47130a, this.f47131b, i10, Charset.defaultCharset());
        this.f47131b += i10;
        return str;
    }

    public final String a(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f47131b;
        int i12 = (i11 + i10) - 1;
        String str = new String(this.f47130a, i11, (i12 >= this.f47132c || this.f47130a[i12] != 0) ? i10 : i10 - 1);
        this.f47131b += i10;
        return str;
    }

    public final int d() {
        byte[] bArr = this.f47130a;
        int i10 = this.f47131b;
        int i11 = i10 + 1;
        this.f47131b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f47131b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f47131b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f47131b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public final long e() {
        byte[] bArr = this.f47130a;
        int i10 = this.f47131b;
        int i11 = i10 + 1;
        this.f47131b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f47131b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f47131b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f47131b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public n(byte[] bArr) {
        this.f47130a = bArr;
        this.f47132c = bArr.length;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    public final String c() {
        int i10;
        int i11 = this.f47132c;
        int i12 = this.f47131b;
        if (i11 - i12 == 0) {
            return null;
        }
        while (i12 < this.f47132c) {
            byte b10 = this.f47130a[i12];
            int i13 = z.f47158a;
            if (b10 == 10 || b10 == 13) {
                break;
            }
            i12++;
        }
        int i14 = this.f47131b;
        if (i12 - i14 >= 3) {
            byte[] bArr = this.f47130a;
            if (bArr[i14] == -17 && bArr[i14 + 1] == -69 && bArr[i14 + 2] == -65) {
                this.f47131b = i14 + 3;
            }
        }
        byte[] bArr2 = this.f47130a;
        int i15 = this.f47131b;
        String str = new String(bArr2, i15, i12 - i15);
        this.f47131b = i12;
        int i16 = this.f47132c;
        if (i12 != i16) {
            byte[] bArr3 = this.f47130a;
            if (bArr3[i12] == 13) {
                int i17 = i12 + 1;
                this.f47131b = i17;
                if (i17 != i16) {
                    i10 = this.f47131b;
                    if (bArr3[i10] == 10) {
                        this.f47131b = i10 + 1;
                    }
                }
            } else {
                i10 = this.f47131b;
                if (bArr3[i10] == 10) {
                    this.f47131b = i10 + 1;
                }
            }
        }
        return str;
    }

    public n(int i10, byte[] bArr) {
        this.f47130a = bArr;
        this.f47132c = i10;
    }
}
