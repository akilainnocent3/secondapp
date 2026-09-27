package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f151461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f151462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f151464d;

    public kb2(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11);
    }

    public final void a() {
        int i10 = this.f151463c;
        if (i10 >= 0) {
            int i11 = this.f151462b;
            if (i10 < i11) {
                return;
            }
            if (i10 == i11 && this.f151464d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        int i10 = this.f151463c;
        int i11 = this.f151464d;
        int i12 = 0;
        while (this.f151463c < this.f151462b && !c()) {
            i12++;
        }
        boolean z10 = this.f151463c == this.f151462b;
        this.f151463c = i10;
        this.f151464d = i11;
        return !z10 && a((i12 * 2) + 1);
    }

    public final boolean c() {
        boolean z10 = (this.f151461a[this.f151463c] & (128 >> this.f151464d)) != 0;
        f();
        return z10;
    }

    public final int d() {
        int i10 = 0;
        while (!c()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? b(i10) : 0);
    }

    public final int e() {
        int iD = d();
        return ((iD + 1) / 2) * (iD % 2 == 0 ? -1 : 1);
    }

    public final void f() {
        int i10 = this.f151464d + 1;
        this.f151464d = i10;
        if (i10 == 8) {
            this.f151464d = 0;
            int i11 = this.f151463c;
            this.f151463c = i11 + (c(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public final boolean a(int i10) {
        int i11 = this.f151463c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f151464d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            int i15 = i11 + 1;
            if (i15 > i13 || i13 >= this.f151462b) {
                break;
            }
            if (c(i15)) {
                i13++;
                i11 += 3;
            } else {
                i11 = i15;
            }
        }
        int i16 = this.f151462b;
        if (i13 >= i16) {
            return i13 == i16 && i14 == 0;
        }
        return true;
    }

    public final boolean c(int i10) {
        if (2 > i10 || i10 >= this.f151462b) {
            return false;
        }
        byte[] bArr = this.f151461a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public final void d(int i10) {
        int i11 = this.f151463c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f151463c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f151464d;
        this.f151464d = i14;
        if (i14 > 7) {
            this.f151463c = i13 + 1;
            this.f151464d = i14 - 8;
        }
        while (true) {
            int i15 = i11 + 1;
            if (i15 <= this.f151463c) {
                if (c(i15)) {
                    this.f151463c++;
                    i11 += 3;
                } else {
                    i11 = i15;
                }
            } else {
                a();
                return;
            }
        }
    }

    public final int b(int i10) {
        int i11;
        this.f151464d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f151464d;
            int i13 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f151464d = i14;
            byte[] bArr = this.f151461a;
            int i15 = this.f151463c;
            i12 |= (bArr[i15] & 255) << i14;
            if (!c(i15 + 1)) {
                i13 = 1;
            }
            this.f151463c = i15 + i13;
        }
        byte[] bArr2 = this.f151461a;
        int i16 = this.f151463c;
        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f151464d = 0;
            this.f151463c = i16 + (c(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        this.f151461a = bArr;
        this.f151463c = i10;
        this.f151462b = i11;
        this.f151464d = 0;
        a();
    }
}
