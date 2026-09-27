package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ov1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f153622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f153623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f153624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f153625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f153626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f153627g;

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    public final boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f153621a = i11;
        this.f153622b = pv1.f154148a[3 - i12];
        int i16 = pv1.f154149b[i14];
        this.f153624d = i16;
        if (i11 == 2) {
            this.f153624d = i16 / 2;
        } else if (i11 == 0) {
            this.f153624d = i16 / 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 != 1) {
            if (i12 == 2) {
                i15 = 1152;
            } else {
                if (i12 != 3) {
                    throw new IllegalArgumentException();
                }
                i15 = 384;
            }
        } else if (i11 == 3) {
            i15 = 1152;
        } else {
            i15 = 576;
        }
        this.f153627g = i15;
        if (i12 == 3) {
            int i18 = i11 == 3 ? pv1.f154150c[i13 - 1] : pv1.f154151d[i13 - 1];
            this.f153626f = i18;
            this.f153623c = (((i18 * 12) / this.f153624d) + i17) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? pv1.f154152e[i13 - 1] : pv1.f154153f[i13 - 1];
                this.f153626f = i19;
                this.f153623c = ((i19 * 144) / this.f153624d) + i17;
            } else {
                int i20 = pv1.f154154g[i13 - 1];
                this.f153626f = i20;
                this.f153623c = (((i12 == 1 ? 72 : 144) * i20) / this.f153624d) + i17;
            }
        }
        this.f153625e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
