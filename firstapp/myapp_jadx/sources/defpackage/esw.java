package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class esw extends e4c {
    public final void f(yy80.a aVar, int i) {
        float[] fArr = this.a;
        int i2 = i + 1;
        long jA = aVar.a(fArr[i], fArr[i2]);
        fArr[i] = Float.intBitsToFloat((int) (jA >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & jA));
    }
}
