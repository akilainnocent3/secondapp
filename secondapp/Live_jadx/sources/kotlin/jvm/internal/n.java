package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class n extends d1<boolean[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final boolean[] f102755d;

    public n(int i10) {
        super(i10);
        this.f102755d = new boolean[i10];
    }

    public final void h(boolean z10) {
        boolean[] zArr = this.f102755d;
        int iB = b();
        e(iB + 1);
        zArr[iB] = z10;
    }

    @Override // kotlin.jvm.internal.d1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@oy.l boolean[] zArr) {
        m0.p(zArr, "<this>");
        return zArr.length;
    }

    @oy.l
    public final boolean[] j() {
        return g(this.f102755d, new boolean[f()]);
    }
}
