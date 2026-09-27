package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e73 f152914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f152916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f152917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f152918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f152919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f152920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f152921h;

    public n73(e73 e73Var, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        ni.a(iArr.length == jArr2.length);
        ni.a(jArr.length == jArr2.length);
        ni.a(iArr2.length == jArr2.length);
        this.f152914a = e73Var;
        this.f152916c = jArr;
        this.f152917d = iArr;
        this.f152918e = i10;
        this.f152919f = jArr2;
        this.f152920g = iArr2;
        this.f152921h = j10;
        this.f152915b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        for (int iA = ib3.a(this.f152919f, j10, true); iA < this.f152919f.length; iA++) {
            if ((this.f152920g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
