package y4;

import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f146147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f146149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f146150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f146151e;

    public l(byte[] bArr, int i10, int i11) {
        j(bArr, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.f146150d;
        l0.g0(i11 >= 0 && (i11 < (i10 = this.f146148b) || (i11 == i10 && this.f146151e == 0)));
    }

    public void b() {
        int i10 = this.f146151e;
        if (i10 > 0) {
            m(8 - i10);
        }
    }

    public boolean c(int i10) {
        int i11 = this.f146150d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f146151e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 > this.f146148b) {
                break;
            }
            if (k(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f146148b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean d() {
        int i10 = this.f146150d;
        int i11 = this.f146151e;
        int i12 = 0;
        while (this.f146150d < this.f146148b && !e()) {
            i12++;
        }
        boolean z10 = this.f146150d == this.f146148b;
        this.f146150d = i10;
        this.f146151e = i11;
        return !z10 && c((i12 * 2) + 1);
    }

    public boolean e() {
        boolean z10 = (this.f146147a[this.f146150d] & (128 >> this.f146151e)) != 0;
        l();
        return z10;
    }

    public int f(int i10) {
        int i11;
        this.f146151e += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f146151e;
            int i13 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f146151e = i14;
            byte[] bArr = this.f146147a;
            int i15 = this.f146150d;
            i12 |= (bArr[i15] & 255) << i14;
            if (!k(i15 + 1)) {
                i13 = 1;
            }
            this.f146150d = i15 + i13;
        }
        byte[] bArr2 = this.f146147a;
        int i16 = this.f146150d;
        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f146151e = 0;
            this.f146150d = i16 + (k(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public final int g() {
        int i10 = 0;
        while (!e()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? f(i10) : 0);
    }

    public int h() {
        int iG = g();
        return (iG % 2 == 0 ? -1 : 1) * ((iG + 1) / 2);
    }

    public int i() {
        return g();
    }

    public void j(byte[] bArr, int i10, int i11) {
        this.f146147a = bArr;
        this.f146149c = i10;
        this.f146150d = i10;
        this.f146148b = i11;
        this.f146151e = 0;
        a();
    }

    public final boolean k(int i10) {
        int i11 = i10 - 2;
        if (this.f146149c > i11 || i10 >= this.f146148b) {
            return false;
        }
        byte[] bArr = this.f146147a;
        return bArr[i10] == 3 && bArr[i11] == 0 && bArr[i10 - 1] == 0;
    }

    public void l() {
        int i10 = this.f146151e + 1;
        this.f146151e = i10;
        if (i10 == 8) {
            this.f146151e = 0;
            int i11 = this.f146150d;
            this.f146150d = i11 + (k(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void m(int i10) {
        int i11 = this.f146150d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f146150d = i13;
        int i14 = this.f146151e + (i10 - (i12 * 8));
        this.f146151e = i14;
        if (i14 > 7) {
            this.f146150d = i13 + 1;
            this.f146151e = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f146150d) {
                a();
                return;
            } else if (k(i11)) {
                this.f146150d++;
                i11 += 2;
            }
        }
    }
}
