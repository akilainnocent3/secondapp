package defpackage;

import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class pkd {
    public static final void a(duw duwVar, d.c cVar) {
        duw<tsr> duwVarK = f(cVar).K();
        int i = duwVarK.c - 1;
        tsr[] tsrVarArr = duwVarK.a;
        if (i < tsrVarArr.length) {
            while (i >= 0) {
                duwVar.b(tsrVarArr[i].U.f);
                i--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final psr b(d.c cVar) {
        if ((cVar.c & 2) != 0) {
            if (cVar instanceof psr) {
                return (psr) cVar;
            }
            if (cVar instanceof tkd) {
                d.c cVar2 = ((tkd) cVar).E;
                while (cVar2 != 0) {
                    if (cVar2 instanceof psr) {
                        return (psr) cVar2;
                    }
                    cVar2 = (!(cVar2 instanceof tkd) || (cVar2.c & 2) == 0) ? cVar2.f : ((tkd) cVar2).E;
                }
            }
        }
        return null;
    }

    public static final d.c c(duw<d.c> duwVar) {
        int i;
        if (duwVar == null || (i = duwVar.c) == 0) {
            return null;
        }
        return duwVar.k(i - 1);
    }

    public static final ywx d(okd okdVar, int i) {
        ywx ywxVar = okdVar.i().v;
        ywxVar.getClass();
        if (ywxVar.E1() != okdVar || !dxx.g(i)) {
            return ywxVar;
        }
        ywx ywxVar2 = ywxVar.H;
        ywxVar2.getClass();
        return ywxVar2;
    }

    public static final ywx e(okd okdVar) {
        if (!okdVar.i().C) {
            wkn.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        ywx ywxVarD = d(okdVar, 2);
        if (!ywxVarD.E1().C) {
            wkn.c("LayoutCoordinates is not attached.");
        }
        return ywxVarD;
    }

    public static final tsr f(okd okdVar) {
        ywx ywxVar = okdVar.i().v;
        if (ywxVar != null) {
            return ywxVar.E;
        }
        throw w20.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final wgz g(okd okdVar) {
        wgz wgzVar = f(okdVar).C;
        if (wgzVar != null) {
            return wgzVar;
        }
        throw w20.a("This node does not have an owner.");
    }
}
