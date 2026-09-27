package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class r1 extends d1<short[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final short[] f102774d;

    public r1(int i10) {
        super(i10);
        this.f102774d = new short[i10];
    }

    public final void h(short s10) {
        short[] sArr = this.f102774d;
        int iB = b();
        e(iB + 1);
        sArr[iB] = s10;
    }

    @Override // kotlin.jvm.internal.d1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@oy.l short[] sArr) {
        m0.p(sArr, "<this>");
        return sArr.length;
    }

    @oy.l
    public final short[] j() {
        return g(this.f102774d, new short[f()]);
    }
}
