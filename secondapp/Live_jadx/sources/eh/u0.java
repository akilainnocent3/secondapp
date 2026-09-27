package eh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f81204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81207d;

    public u0(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.f81206c;
        a.i(i11 >= 0 && (i11 < (i10 = this.f81205b) || (i11 == i10 && this.f81207d == 0)));
    }

    public boolean b(int i10) {
        int i11 = this.f81206c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f81207d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f81205b) {
                break;
            }
            if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f81205b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean c() {
        int i10 = this.f81206c;
        int i11 = this.f81207d;
        int i12 = 0;
        while (this.f81206c < this.f81205b && !d()) {
            i12++;
        }
        boolean z10 = this.f81206c == this.f81205b;
        this.f81206c = i10;
        this.f81207d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public boolean d() {
        boolean z10 = (this.f81204a[this.f81206c] & (128 >> this.f81207d)) != 0;
        k();
        return z10;
    }

    public int e(int i10) {
        int i11;
        this.f81207d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f81207d;
            int i13 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f81207d = i14;
            byte[] bArr = this.f81204a;
            int i15 = this.f81206c;
            i12 |= (bArr[i15] & 255) << i14;
            if (!j(i15 + 1)) {
                i13 = 1;
            }
            this.f81206c = i15 + i13;
        }
        byte[] bArr2 = this.f81204a;
        int i16 = this.f81206c;
        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f81207d = 0;
            this.f81206c = i16 + (j(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public final int f() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    public int g() {
        int iF = f();
        return (iF % 2 == 0 ? -1 : 1) * ((iF + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i10, int i11) {
        this.f81204a = bArr;
        this.f81206c = i10;
        this.f81205b = i11;
        this.f81207d = 0;
        a();
    }

    public final boolean j(int i10) {
        if (2 > i10 || i10 >= this.f81205b) {
            return false;
        }
        byte[] bArr = this.f81204a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void k() {
        int i10 = this.f81207d + 1;
        this.f81207d = i10;
        if (i10 == 8) {
            this.f81207d = 0;
            int i11 = this.f81206c;
            this.f81206c = i11 + (j(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i10) {
        int i11 = this.f81206c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f81206c = i13;
        int i14 = this.f81207d + (i10 - (i12 * 8));
        this.f81207d = i14;
        if (i14 > 7) {
            this.f81206c = i13 + 1;
            this.f81207d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f81206c) {
                a();
                return;
            } else if (j(i11)) {
                this.f81206c++;
                i11 += 2;
            }
        }
    }
}
