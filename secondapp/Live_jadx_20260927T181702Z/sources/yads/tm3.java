package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f155964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f155967d;

    public tm3(byte[] bArr) {
        this.f155964a = bArr;
        this.f155965b = bArr.length;
    }

    public final boolean a() {
        boolean z10 = (((this.f155964a[this.f155966c] & 255) >> this.f155967d) & 1) == 1;
        b(1);
        return z10;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f155966c + i11;
        this.f155966c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f155967d;
        this.f155967d = i13;
        if (i13 > 7) {
            this.f155966c = i12 + 1;
            this.f155967d = i13 - 8;
        }
        int i14 = this.f155966c;
        if (i14 >= 0) {
            int i15 = this.f155965b;
            if (i14 < i15) {
                return;
            }
            if (i14 == i15 && this.f155967d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int a(int i10) {
        int i11 = this.f155966c;
        int iMin = Math.min(i10, 8 - this.f155967d);
        int i12 = i11 + 1;
        int i13 = ((this.f155964a[i11] & 255) >> this.f155967d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f155964a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }
}
