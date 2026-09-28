package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ge0 {
    public static final hep.a a = hep.a.a("k", "x", "y");

    public static fe0 a(hfp hfpVar, xmt xmtVar) {
        ArrayList arrayList = new ArrayList();
        if (hfpVar.J() == hep.b.a) {
            hfpVar.d();
            while (hfpVar.o()) {
                hfp hfpVar2 = hfpVar;
                xmt xmtVar2 = xmtVar;
                arrayList.add(new lxz(xmtVar2, epp.b(hfpVar2, xmtVar2, srh0.c(), sxz.a, hfpVar.J() == hep.b.c, false)));
                hfpVar = hfpVar2;
                xmtVar = xmtVar2;
            }
            hfpVar.g();
            fpp.b(arrayList);
        } else {
            arrayList.add(new cpp(lfp.b(hfpVar, srh0.c())));
        }
        return new fe0(arrayList);
    }

    public static se0 b(hfp hfpVar, xmt xmtVar) {
        hfpVar.f();
        fe0 fe0VarA = null;
        be0 be0VarB = null;
        boolean z = false;
        be0 be0VarB2 = null;
        while (hfpVar.J() != hep.b.d) {
            int iV = hfpVar.V(a);
            if (iV != 0) {
                hep.b bVar = hep.b.f;
                if (iV != 1) {
                    if (iV != 2) {
                        hfpVar.Y();
                        hfpVar.Z();
                    } else if (hfpVar.J() == bVar) {
                        hfpVar.Z();
                        z = true;
                    } else {
                        be0VarB = te0.b(hfpVar, xmtVar, true);
                    }
                } else if (hfpVar.J() == bVar) {
                    hfpVar.Z();
                    z = true;
                } else {
                    be0VarB2 = te0.b(hfpVar, xmtVar, true);
                }
            } else {
                fe0VarA = a(hfpVar, xmtVar);
            }
        }
        hfpVar.l();
        if (z) {
            xmtVar.a("Lottie doesn't support expressions.");
        }
        return fe0VarA != null ? fe0VarA : new ke0(be0VarB2, be0VarB);
    }
}
