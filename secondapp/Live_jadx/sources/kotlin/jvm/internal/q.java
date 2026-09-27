package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class q extends d1<byte[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final byte[] f102762d;

    public q(int i10) {
        super(i10);
        this.f102762d = new byte[i10];
    }

    public final void h(byte b10) {
        byte[] bArr = this.f102762d;
        int iB = b();
        e(iB + 1);
        bArr[iB] = b10;
    }

    @Override // kotlin.jvm.internal.d1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@oy.l byte[] bArr) {
        m0.p(bArr, "<this>");
        return bArr.length;
    }

    @oy.l
    public final byte[] j() {
        return g(this.f102762d, new byte[f()]);
    }
}
