package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zft implements yxd0<rft> {
    public static final zft a = new zft();

    @Override // defpackage.yxd0
    public final int a(rft rftVar, ptu ptuVar) {
        int iB;
        int iJ;
        rft rftVar2 = rftVar;
        int iE = cyd0.e(oft.d, rftVar2.i(), ptuVar) + qtu.c(oft.c, nft.d(rftVar2.e())) + qtu.e(oft.b, rftVar2.g()) + qtu.e(oft.a, rftVar2.h());
        if (rftVar2.f() != null) {
            ek1 ek1Var = oft.e;
            ruh0<?> ruh0VarF = rftVar2.f();
            int iB2 = ptuVar.b();
            int iC = dl0.c(ruh0VarF, ptuVar);
            int iA = s08.a(iC) + ek1Var.d() + iC;
            ptuVar.b[iB2] = iC;
            iE += iA;
        }
        if (rftVar2 instanceof ii1) {
            iB = z1h.d(oft.f, wen.c(rftVar2), ptuVar) + iE;
            iJ = qtu.j(oft.g, rftVar2.a() - wen.c(rftVar2).size());
        } else {
            iB = cyd0.b(oft.f, rftVar2.getAttributes(), ptuVar) + iE;
            iJ = qtu.j(oft.g, rftVar2.a() - rftVar2.getAttributes().size());
        }
        int i = iJ + iB;
        ui1 ui1VarB = rftVar2.b();
        int iD = qtu.d(oft.h, ui1VarB.b().b) + i;
        if (!ui1VarB.c().equals("00000000000000000000000000000000")) {
            iD += qtu.i(oft.i, ui1VarB.c());
        }
        if (!ui1VarB.a().equals("0000000000000000")) {
            iD += qtu.h(oft.j, ui1VarB.a());
        }
        return cyd0.e(oft.k, rftVar2.getEventName(), ptuVar) + iD;
    }

    @Override // defpackage.yxd0
    public final void b(me80 me80Var, rft rftVar, ptu ptuVar) throws IOException {
        int iA;
        int size;
        rft rftVar2 = rftVar;
        me80Var.g(oft.a, rftVar2.h());
        me80Var.g(oft.b, rftVar2.g());
        me80Var.d(oft.c, nft.d(rftVar2.e()));
        me80Var.P(oft.d, rftVar2.i(), ptuVar);
        if (rftVar2.f() != null) {
            me80Var.m(oft.e, rftVar2.f(), dl0.a, ptuVar);
        }
        if (rftVar2 instanceof ii1) {
            z1h.c(me80Var, oft.f, wen.c(rftVar2), ptuVar);
            iA = rftVar2.a();
            size = wen.c(rftVar2).size();
        } else {
            me80Var.F(oft.f, rftVar2.getAttributes(), ptuVar);
            iA = rftVar2.a();
            size = rftVar2.getAttributes().size();
        }
        me80Var.V(oft.g, iA - size);
        ui1 ui1VarB = rftVar2.b();
        me80Var.f(oft.h, ui1VarB.b().b);
        if (!ui1VarB.c().equals("00000000000000000000000000000000")) {
            ek1 ek1Var = oft.i;
            String strC = ui1VarB.c();
            if (strC != null) {
                me80Var.K0(ek1Var, strC, ptuVar);
            }
        }
        if (!ui1VarB.a().equals("0000000000000000")) {
            ek1 ek1Var2 = oft.j;
            String strA = ui1VarB.a();
            if (strA != null) {
                me80Var.u0(ek1Var2, strA, ptuVar);
            }
        }
        me80Var.P(oft.k, rftVar2.getEventName(), ptuVar);
    }
}
