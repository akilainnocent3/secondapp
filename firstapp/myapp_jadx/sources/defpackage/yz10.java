package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class yz10 implements cvh0<PointF> {
    public static final yz10 a = new yz10();

    @Override // defpackage.cvh0
    public final PointF a(hep hepVar, float f) {
        hep.b bVarJ = hepVar.J();
        if (bVarJ == hep.b.a) {
            return lfp.b(hepVar, f);
        }
        if (bVarJ == hep.b.c) {
            return lfp.b(hepVar, f);
        }
        if (bVarJ != hep.b.i) {
            z9l.a(bVarJ, "Cannot convert json to point. Next token is ");
            return null;
        }
        PointF pointF = new PointF(((float) hepVar.F()) * f, ((float) hepVar.F()) * f);
        while (hepVar.o()) {
            hepVar.Z();
        }
        return pointF;
    }
}
