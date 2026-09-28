package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class pjt extends xv20<Long, long[], kjt> {
    public static final pjt c;

    static {
        qjt.a.getClass();
        c = new pjt(okt.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        kjt kjtVar = (kjt) obj;
        kjtVar.getClass();
        long jR = dmaVar.r(this.b, i);
        kjtVar.b(kjtVar.d() + 1);
        long[] jArr = kjtVar.a;
        int i2 = kjtVar.b;
        kjtVar.b = i2 + 1;
        jArr[i2] = jR;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        kjt kjtVar = new kjt();
        kjtVar.a = jArr;
        kjtVar.b = jArr.length;
        kjtVar.b(10);
        return kjtVar;
    }

    @Override // defpackage.xv20
    public final long[] j() {
        return new long[0];
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, long[] jArr, int i) {
        long[] jArr2 = jArr;
        fmaVar.getClass();
        jArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fmaVar.f(this.b, i2, jArr2[i2]);
        }
    }
}
