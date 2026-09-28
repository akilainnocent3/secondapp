package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class uwh extends xv20<Float, float[], pwh> {
    public static final uwh c;

    static {
        vwh.a.getClass();
        c = new uwh(hxh.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        pwh pwhVar = (pwh) obj;
        pwhVar.getClass();
        float fG = dmaVar.g(this.b, i);
        pwhVar.b(pwhVar.d() + 1);
        float[] fArr = pwhVar.a;
        int i2 = pwhVar.b;
        pwhVar.b = i2 + 1;
        fArr[i2] = fG;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        pwh pwhVar = new pwh();
        pwhVar.a = fArr;
        pwhVar.b = fArr.length;
        pwhVar.b(10);
        return pwhVar;
    }

    @Override // defpackage.xv20
    public final float[] j() {
        return new float[0];
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, float[] fArr, int i) {
        float[] fArr2 = fArr;
        fmaVar.getClass();
        fArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fmaVar.l(this.b, i2, fArr2[i2]);
        }
    }
}
