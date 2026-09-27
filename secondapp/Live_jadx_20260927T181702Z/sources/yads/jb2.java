package yads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f151001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f151002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151003c;

    public jb2() {
        this.f151001a = ib3.f150521f;
    }

    public final void a(int i10) {
        byte[] bArr = this.f151001a;
        if (i10 > bArr.length) {
            this.f151001a = Arrays.copyOf(bArr, i10);
        }
    }

    public final int b() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        int i11 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 8);
        this.f151002b = i10 + 4;
        return (bArr[i12] & 255) | i13;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    public final String c() {
        int i10;
        int i11 = this.f151003c;
        int i12 = this.f151002b;
        if (i11 - i12 == 0) {
            return null;
        }
        while (i12 < this.f151003c) {
            byte b10 = this.f151001a[i12];
            int i13 = ib3.f150516a;
            if (b10 == 10 || b10 == 13) {
                break;
            }
            i12++;
        }
        int i14 = this.f151002b;
        if (i12 - i14 >= 3) {
            byte[] bArr = this.f151001a;
            if (bArr[i14] == -17 && bArr[i14 + 1] == -69 && bArr[i14 + 2] == -65) {
                this.f151002b = i14 + 3;
            }
        }
        byte[] bArr2 = this.f151001a;
        int i15 = this.f151002b;
        String strA = ib3.a(bArr2, i15, i12 - i15);
        this.f151002b = i12;
        int i16 = this.f151003c;
        if (i12 != i16) {
            byte[] bArr3 = this.f151001a;
            if (bArr3[i12] == 13) {
                int i17 = i12 + 1;
                this.f151002b = i17;
                if (i17 != i16) {
                    i10 = this.f151002b;
                    if (bArr3[i10] == 10) {
                        this.f151002b = i10 + 1;
                    }
                }
            } else {
                i10 = this.f151002b;
                if (bArr3[i10] == 10) {
                    this.f151002b = i10 + 1;
                }
            }
        }
        return strA;
    }

    public final int d() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        int i11 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 16);
        this.f151002b = i10 + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public final long e() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        int i11 = i10 + 7;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        this.f151002b = i10 + 8;
        return ((((long) bArr[i11]) & 255) << 56) | j10;
    }

    public final short f() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f151002b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final long g() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        int i11 = i10 + 3;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16);
        this.f151002b = i10 + 4;
        return ((((long) bArr[i11]) & 255) << 24) | j10;
    }

    public final int h() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f151002b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long i() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        int i11 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        this.f151002b = i10 + 8;
        return (((long) bArr[i11]) & 255) | j10;
    }

    public final String j() {
        int i10 = this.f151003c;
        int i11 = this.f151002b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f151003c && this.f151001a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f151001a;
        int i12 = this.f151002b;
        String strA = ib3.a(bArr, i12, i11 - i12);
        this.f151002b = i11;
        if (i11 < this.f151003c) {
            this.f151002b = i11 + 1;
        }
        return strA;
    }

    public final short k() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f151002b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final int l() {
        return (m() << 21) | (m() << 14) | (m() << 7) | m();
    }

    public final int m() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        this.f151002b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long n() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        int i11 = i10 + 3;
        long j10 = ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i10 + 1]) & 255) << 16) | ((((long) bArr[i10 + 2]) & 255) << 8);
        this.f151002b = i10 + 4;
        return (((long) bArr[i11]) & 255) | j10;
    }

    public final int o() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
        this.f151002b = i10 + 3;
        return (bArr[i11] & 255) | i12;
    }

    public final int p() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(mg2.a("Top bit not zero: ", iB));
    }

    public final long q() {
        long jI = i();
        if (jI >= 0) {
            return jI;
        }
        throw new IllegalStateException("Top bit not zero: " + jI);
    }

    public final int r() {
        byte[] bArr = this.f151001a;
        int i10 = this.f151002b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f151002b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long s() {
        int i10;
        int i11;
        long j10 = this.f151001a[this.f151002b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f151001a[this.f151002b + i10];
            if ((b10 & l3.a.f103436o7) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f151002b += i11;
        return j10;
    }

    public final String b(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f151002b;
        int i12 = (i11 + i10) - 1;
        String strA = ib3.a(this.f151001a, i11, (i12 >= this.f151003c || this.f151001a[i12] != 0) ? i10 : i10 - 1);
        this.f151002b += i10;
        return strA;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 > this.f151001a.length) {
            throw new IllegalArgumentException();
        }
        this.f151003c = i10;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 > this.f151003c) {
            throw new IllegalArgumentException();
        }
        this.f151002b = i10;
    }

    public jb2(int i10) {
        this.f151001a = new byte[i10];
        this.f151003c = i10;
    }

    public final byte[] a() {
        return this.f151001a;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f151001a, this.f151002b, bArr, i10, i11);
        this.f151002b += i11;
    }

    public jb2(int i10, byte[] bArr) {
        this.f151001a = bArr;
        this.f151003c = i10;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        this.f151001a = bArr;
        this.f151003c = length;
        this.f151002b = 0;
    }

    public jb2(byte[] bArr) {
        this.f151001a = bArr;
        this.f151003c = bArr.length;
    }

    public final String a(int i10, Charset charset) {
        String str = new String(this.f151001a, this.f151002b, i10, charset);
        this.f151002b += i10;
        return str;
    }

    public final void c(int i10) {
        byte[] bArr = this.f151001a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        this.f151001a = bArr;
        this.f151003c = i10;
        this.f151002b = 0;
    }
}
