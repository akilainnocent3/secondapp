package f6;

import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f83489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83492d;

    public h1(byte[] bArr) {
        this.f83489a = bArr;
        this.f83490b = bArr.length;
    }

    public final void a() {
        int i10;
        int i11 = this.f83491c;
        zi.l0.g0(i11 >= 0 && (i11 < (i10 = this.f83490b) || (i11 == i10 && this.f83492d == 0)));
    }

    public int b() {
        return ((this.f83490b - this.f83491c) * 8) - this.f83492d;
    }

    public int c() {
        return (this.f83491c * 8) + this.f83492d;
    }

    public boolean d() {
        boolean z10 = (((this.f83489a[this.f83491c] & 255) >> this.f83492d) & 1) == 1;
        h(1);
        return z10;
    }

    public int e(int i10) {
        int i11 = this.f83491c;
        int iMin = Math.min(i10, 8 - this.f83492d);
        int i12 = i11 + 1;
        int i13 = ((this.f83489a[i11] & 255) >> this.f83492d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f83489a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        h(i10);
        return i14;
    }

    public void f() {
        this.f83491c = 0;
        this.f83492d = 0;
    }

    public void g(int i10) {
        int i11 = i10 / 8;
        this.f83491c = i11;
        this.f83492d = i10 - (i11 * 8);
        a();
    }

    public void h(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f83491c + i11;
        this.f83491c = i12;
        int i13 = this.f83492d + (i10 - (i11 * 8));
        this.f83492d = i13;
        if (i13 > 7) {
            this.f83491c = i12 + 1;
            this.f83492d = i13 - 8;
        }
        a();
    }
}
