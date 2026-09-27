package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends d1<int[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final int[] f102741d;

    public l0(int i10) {
        super(i10);
        this.f102741d = new int[i10];
    }

    public final void h(int i10) {
        int[] iArr = this.f102741d;
        int iB = b();
        e(iB + 1);
        iArr[iB] = i10;
    }

    @Override // kotlin.jvm.internal.d1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@oy.l int[] iArr) {
        m0.p(iArr, "<this>");
        return iArr.length;
    }

    @oy.l
    public final int[] j() {
        return g(this.f102741d, new int[f()]);
    }
}
