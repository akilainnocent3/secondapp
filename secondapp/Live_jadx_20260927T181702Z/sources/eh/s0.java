package eh;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f81187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81190d;

    public s0() {
        this.f81187a = o1.f81147f;
    }

    public final void a() {
        int i10;
        int i11 = this.f81188b;
        a.i(i11 >= 0 && (i11 < (i10 = this.f81190d) || (i11 == i10 && this.f81189c == 0)));
    }

    public int b() {
        return ((this.f81190d - this.f81188b) * 8) - this.f81189c;
    }

    public void c() {
        if (this.f81189c == 0) {
            return;
        }
        this.f81189c = 0;
        this.f81188b++;
        a();
    }

    public int d() {
        a.i(this.f81189c == 0);
        return this.f81188b;
    }

    public int e() {
        return (this.f81188b * 8) + this.f81189c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int iMin = Math.min(8 - this.f81189c, i11);
        int i12 = this.f81189c;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.f81187a;
        int i14 = this.f81188b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - iMin;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f81187a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f81187a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        s(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f81187a[this.f81188b] & (128 >> this.f81189c)) != 0;
        r();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f81189c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f81189c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f81189c = i13;
            byte[] bArr = this.f81187a;
            int i14 = this.f81188b;
            this.f81188b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f81187a;
        int i15 = this.f81188b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f81189c = 0;
            this.f81188b = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f81187a;
            int i13 = this.f81188b;
            int i14 = i13 + 1;
            this.f81188b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f81189c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i16));
        bArr[i12] = b12;
        int i17 = this.f81189c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f81187a;
            int i18 = this.f81188b;
            this.f81188b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f81189c = i17 - 8;
        }
        int i19 = this.f81189c + i16;
        this.f81189c = i19;
        byte[] bArr4 = this.f81187a;
        int i20 = this.f81188b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f81189c = 0;
            this.f81188b = i20 + 1;
        }
        a();
    }

    public long j(int i10) {
        return i10 <= 32 ? o1.Y1(h(i10)) : o1.X1(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        a.i(this.f81189c == 0);
        System.arraycopy(this.f81187a, this.f81188b, bArr, i10, i11);
        this.f81188b += i11;
        a();
    }

    public String l(int i10) {
        return m(i10, zi.f.f161720c);
    }

    public String m(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void n(t0 t0Var) {
        p(t0Var.e(), t0Var.g());
        q(t0Var.f() * 8);
    }

    public void o(byte[] bArr) {
        p(bArr, bArr.length);
    }

    public void p(byte[] bArr, int i10) {
        this.f81187a = bArr;
        this.f81188b = 0;
        this.f81189c = 0;
        this.f81190d = i10;
    }

    public void q(int i10) {
        int i11 = i10 / 8;
        this.f81188b = i11;
        this.f81189c = i10 - (i11 * 8);
        a();
    }

    public void r() {
        int i10 = this.f81189c + 1;
        this.f81189c = i10;
        if (i10 == 8) {
            this.f81189c = 0;
            this.f81188b++;
        }
        a();
    }

    public void s(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f81188b + i11;
        this.f81188b = i12;
        int i13 = this.f81189c + (i10 - (i11 * 8));
        this.f81189c = i13;
        if (i13 > 7) {
            this.f81188b = i12 + 1;
            this.f81189c = i13 - 8;
        }
        a();
    }

    public void t(int i10) {
        a.i(this.f81189c == 0);
        this.f81188b += i10;
        a();
    }

    public s0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public s0(byte[] bArr, int i10) {
        this.f81187a = bArr;
        this.f81190d = i10;
    }
}
