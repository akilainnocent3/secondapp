package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class t extends d1<char[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final char[] f102787d;

    public t(int i10) {
        super(i10);
        this.f102787d = new char[i10];
    }

    public final void h(char c10) {
        char[] cArr = this.f102787d;
        int iB = b();
        e(iB + 1);
        cArr[iB] = c10;
    }

    @Override // kotlin.jvm.internal.d1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@oy.l char[] cArr) {
        m0.p(cArr, "<this>");
        return cArr.length;
    }

    @oy.l
    public final char[] j() {
        return g(this.f102787d, new char[f()]);
    }
}
