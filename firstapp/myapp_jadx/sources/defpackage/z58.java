package defpackage;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class z58 implements cvh0<Integer> {
    public static final z58 a = new z58();

    @Override // defpackage.cvh0
    public final Integer a(hep hepVar, float f) {
        boolean z = hepVar.J() == hep.b.a;
        if (z) {
            hepVar.d();
        }
        double dF = hepVar.F();
        double dF2 = hepVar.F();
        double dF3 = hepVar.F();
        double dF4 = hepVar.J() == hep.b.i ? hepVar.F() : 1.0d;
        if (z) {
            hepVar.g();
        }
        if (dF <= 1.0d && dF2 <= 1.0d && dF3 <= 1.0d) {
            dF *= 255.0d;
            dF2 *= 255.0d;
            dF3 *= 255.0d;
            if (dF4 <= 1.0d) {
                dF4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dF4, (int) dF, (int) dF2, (int) dF3));
    }
}
