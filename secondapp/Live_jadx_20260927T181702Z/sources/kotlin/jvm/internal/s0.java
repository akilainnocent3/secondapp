package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class s0 extends d1<long[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final long[] f102786d;

    public s0(int i10) {
        super(i10);
        this.f102786d = new long[i10];
    }

    public final void h(long j10) {
        long[] jArr = this.f102786d;
        int iB = b();
        e(iB + 1);
        jArr[iB] = j10;
    }

    @Override // kotlin.jvm.internal.d1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@oy.l long[] jArr) {
        m0.p(jArr, "<this>");
        return jArr.length;
    }

    @oy.l
    public final long[] j() {
        return g(this.f102786d, new long[f()]);
    }
}
