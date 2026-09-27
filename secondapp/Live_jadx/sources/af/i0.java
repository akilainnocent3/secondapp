package af;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4944d;

    public i0(byte[] bArr) {
        this.f4941a = bArr;
        this.f4942b = bArr.length;
    }

    public final void a() {
        int i10;
        int i11 = this.f4943c;
        eh.a.i(i11 >= 0 && (i11 < (i10 = this.f4942b) || (i11 == i10 && this.f4944d == 0)));
    }

    public int b() {
        return ((this.f4942b - this.f4943c) * 8) - this.f4944d;
    }

    public int c() {
        return (this.f4943c * 8) + this.f4944d;
    }

    public boolean d() {
        boolean z10 = (((this.f4941a[this.f4943c] & 255) >> this.f4944d) & 1) == 1;
        h(1);
        return z10;
    }

    public int e(int i10) {
        int i11 = this.f4943c;
        int iMin = Math.min(i10, 8 - this.f4944d);
        int i12 = i11 + 1;
        int i13 = ((this.f4941a[i11] & 255) >> this.f4944d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f4941a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        h(i10);
        return i14;
    }

    public void f() {
        this.f4943c = 0;
        this.f4944d = 0;
    }

    public void g(int i10) {
        int i11 = i10 / 8;
        this.f4943c = i11;
        this.f4944d = i10 - (i11 * 8);
        a();
    }

    public void h(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f4943c + i11;
        this.f4943c = i12;
        int i13 = this.f4944d + (i10 - (i11 * 8));
        this.f4944d = i13;
        if (i13 > 7) {
            this.f4943c = i12 + 1;
            this.f4944d = i13 - 8;
        }
        a();
    }
}
