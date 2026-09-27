package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends d1<float[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final float[] f102715d;

    public c0(int i10) {
        super(i10);
        this.f102715d = new float[i10];
    }

    public final void h(float f10) {
        float[] fArr = this.f102715d;
        int iB = b();
        e(iB + 1);
        fArr[iB] = f10;
    }

    @Override // kotlin.jvm.internal.d1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@oy.l float[] fArr) {
        m0.p(fArr, "<this>");
        return fArr.length;
    }

    @oy.l
    public final float[] j() {
        return g(this.f102715d, new float[f()]);
    }
}
