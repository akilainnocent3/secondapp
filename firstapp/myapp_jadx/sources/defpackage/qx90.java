package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qx90 {
    public final yvg0 a = new yvg0();
    public final owh b = new owh();
    public final owh c = new owh(128, 0);
    public final owh d = new owh(128, 0);
    public final owh e = new owh(128, 0);
    public final q590 f = new q590(128, 0);
    public final owh g = new owh();
    public ps7 h;
    public mw0<owh> i;

    public static void a(owh owhVar) {
        float[] fArr = owhVar.a;
        int i = owhVar.b;
        int i2 = i - 2;
        float f = (fArr[i2] * fArr[1]) - (fArr[0] * fArr[i - 1]);
        int i3 = i - 3;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 + 2;
            f += (fArr[i4] * fArr[i4 + 3]) - (fArr[i5] * fArr[i4 + 1]);
            i4 = i5;
        }
        if (f < 0.0f) {
            return;
        }
        int i6 = i >> 1;
        for (int i7 = 0; i7 < i6; i7 += 2) {
            float f2 = fArr[i7];
            int i8 = i7 + 1;
            float f3 = fArr[i8];
            int i9 = i2 - i7;
            fArr[i7] = fArr[i9];
            int i10 = i9 + 1;
            fArr[i8] = fArr[i10];
            fArr[i9] = f2;
            fArr[i10] = f3;
        }
    }
}
