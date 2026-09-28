package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wkt extends ot {
    @Override // defpackage.ot
    public final long b(ywx ywxVar, long j) {
        ykt yktVarX1 = ywxVar.x1();
        yktVarX1.getClass();
        long j2 = yktVarX1.F;
        return gly.f((((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
    }

    @Override // defpackage.ot
    public final Map<kt, Integer> c(ywx ywxVar) {
        ykt yktVarX1 = ywxVar.x1();
        yktVarX1.getClass();
        return yktVarX1.O0().s();
    }

    @Override // defpackage.ot
    public final int d(ywx ywxVar, kt ktVar) {
        ykt yktVarX1 = ywxVar.x1();
        yktVarX1.getClass();
        return yktVarX1.f0(ktVar);
    }
}
