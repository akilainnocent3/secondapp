package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class lmt {
    public static final fmt a(a aVar) {
        aVar.x(2024497114);
        aVar.x(-610207850);
        Object objY = aVar.y();
        if (objY == a.C0041a.a) {
            objY = new jmt();
            aVar.r(objY);
        }
        fmt fmtVar = (fmt) objY;
        aVar.L();
        aVar.L();
        return fmtVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    public static final Object b(fmt fmtVar, tje0 tje0Var) {
        xmt xmtVarE = fmtVar.E();
        wmt wmtVarI = fmtVar.I();
        float fZ = fmtVar.z();
        float fB = 0.0f;
        if (fZ < 0.0f && xmtVarE == null) {
            fB = 1.0f;
        } else if (xmtVarE != null) {
            if (fZ < 0.0f) {
                if (wmtVarI != null) {
                    fB = wmtVarI.a();
                } else {
                    fB = 1.0f;
                }
            } else if (wmtVarI != null) {
                fB = wmtVarI.b();
            }
        }
        Object objB = fmt.a.b(fmtVar, null, fB, tje0Var, 9);
        return objB == y5b.a ? objB : Unit.a;
    }
}
