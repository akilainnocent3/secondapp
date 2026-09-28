package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class poz {
    public static l5f0 a(zpz zpzVar, i4d i4dVar, a aVar, int i, int i2) {
        spz spzVar = new spz();
        h4d h4dVarA = i4dVar;
        if ((i2 & 4) != 0) {
            h4dVarA = zdb0.a(aVar);
        }
        lk40 lk40Var = mni0.a;
        boolean z = true;
        fkd0 fkd0VarD = yi0.d(0.0f, 400.0f, Float.valueOf(1.0f), 1);
        Object obj = (mmd) aVar.O(kna.h);
        asr asrVar = (asr) aVar.O(kna.n);
        boolean zM = ((((i & 14) ^ 6) > 4 && aVar.M(zpzVar)) || (i & 6) == 4) | aVar.M(h4dVarA) | aVar.M(fkd0VarD);
        if ((((i & 112) ^ 48) <= 32 || !aVar.M(spzVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean zM2 = zM | z | aVar.M(obj) | aVar.d(asrVar.ordinal());
        Object objY = aVar.y();
        if (zM2 || objY == a.C0041a.a) {
            Object t4a0Var = new t4a0(new tpz(zpzVar, new ooz(zpzVar, asrVar), spzVar), h4dVarA, fkd0VarD);
            aVar.r(t4a0Var);
            objY = t4a0Var;
        }
        return (l5f0) objY;
    }
}
