package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sd0 {
    public final float a;
    public final float b;

    public sd0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float a(e4c e4cVar) {
        e4cVar.getClass();
        float fA = e4cVar.a();
        float f = this.a;
        float fB = e4cVar.b();
        float f2 = this.b;
        float fA2 = csh0.a(fA - f, fB - f2);
        float[] fArr = e4cVar.a;
        float fA3 = fA2 - csh0.a(fArr[0] - f, fArr[1] - f2);
        float f3 = csh0.c;
        float fD = csh0.d(fA3, f3);
        if (fD > f3 - 1.0E-4f) {
            return 0.0f;
        }
        return fD;
    }
}
