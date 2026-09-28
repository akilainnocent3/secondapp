package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ea5 {
    public static final Object a(okd okdVar, Function0 function0, x1b x1bVar) {
        Object obj;
        wwx wwxVar;
        if (!okdVar.i().C) {
            return Unit.a;
        }
        if (!okdVar.i().C) {
            wkn.c("visitAncestors called on an unattached node");
        }
        d.c cVar = okdVar.i().e;
        tsr tsrVarF = pkd.f(okdVar);
        loop0: while (true) {
            obj = null;
            if (tsrVarF == null) {
                break;
            }
            if ((tsrVarF.U.f.d & 524288) != 0) {
                while (cVar != null) {
                    if ((cVar.c & 524288) != 0) {
                        d.c cVarC = cVar;
                        duw duwVar = null;
                        while (cVarC != null) {
                            if (cVarC instanceof ca5) {
                                obj = cVarC;
                                break loop0;
                            }
                            if ((cVarC.c & 524288) != 0 && (cVarC instanceof tkd)) {
                                int i = 0;
                                for (d.c cVar2 = ((tkd) cVarC).E; cVar2 != null; cVar2 = cVar2.f) {
                                    if ((cVar2.c & 524288) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarC = cVar2;
                                        } else {
                                            if (duwVar == null) {
                                                duwVar = new duw(new d.c[16]);
                                            }
                                            if (cVarC != null) {
                                                duwVar.b(cVarC);
                                                cVarC = null;
                                            }
                                            duwVar.b(cVar2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVarC = pkd.c(duwVar);
                        }
                    }
                    cVar = cVar.e;
                }
            }
            tsrVarF = tsrVarF.H();
            cVar = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
        }
        ca5 ca5Var = (ca5) obj;
        if (ca5Var == null) {
            return Unit.a;
        }
        ywx ywxVarE = pkd.e(okdVar);
        Object objT1 = ca5Var.t1(ywxVarE, new da5(function0, ywxVarE), x1bVar);
        return objT1 == y5b.a ? objT1 : Unit.a;
    }
}
