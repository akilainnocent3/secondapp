package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fd3 implements zw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f149063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f149064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f149065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f149066d;

    public fd3(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f149063a = jArr;
        this.f149064b = jArr2;
        this.f149065c = j10;
        this.f149066d = j11;
    }

    @Override // yads.zw2
    public final long a() {
        return this.f149066d;
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f149065c;
    }

    @Override // yads.zw2
    public final long a(long j10) {
        return this.f149063a[ib3.b(this.f149064b, j10, true)];
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        int iB = ib3.b(this.f149063a, j10, true);
        long[] jArr = this.f149063a;
        long j11 = jArr[iB];
        long[] jArr2 = this.f149064b;
        xw2 xw2Var = new xw2(j11, jArr2[iB]);
        if (j11 >= j10 || iB == jArr.length - 1) {
            return new tw2(xw2Var, xw2Var);
        }
        int i10 = iB + 1;
        return new tw2(xw2Var, new xw2(jArr[i10], jArr2[i10]));
    }
}
