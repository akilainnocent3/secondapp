package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class jra0 implements yxd0<rqa0> {
    public static final jra0 a = new jra0();

    @Override // defpackage.yxd0
    public final int a(rqa0 rqa0Var, ptu ptuVar) {
        rqa0 rqa0Var2 = rqa0Var;
        int iH = qtu.h(nqa0.b, rqa0Var2.k()) + qtu.i(nqa0.a, rqa0Var2.m());
        byte[] bArrD = dra0.d(rqa0Var2.b().d());
        ptuVar.a(bArrD);
        int iJ = qtu.j(nqa0.o, rqa0Var2.h() - rqa0Var2.j().size()) + cyd0.c(nqa0.n, rqa0Var2.j(), bra0.a, ptuVar) + qtu.j(nqa0.m, rqa0Var2.l() - rqa0Var2.e().size()) + cyd0.c(nqa0.l, rqa0Var2.e(), sqa0.a, ptuVar) + qtu.j(nqa0.k, rqa0Var2.a() - rqa0Var2.getAttributes().size()) + cyd0.b(nqa0.j, rqa0Var2.getAttributes(), ptuVar) + qtu.e(nqa0.i, rqa0Var2.i()) + qtu.e(nqa0.h, rqa0Var2.f()) + qtu.c(nqa0.g, dra0.e(rqa0Var2.getKind())) + cyd0.e(nqa0.f, rqa0Var2.getName(), ptuVar) + qtu.h(nqa0.d, rqa0Var2.n().f() ? rqa0Var2.n().a() : null) + qtu.b(nqa0.c, bArrD) + iH;
        ek1 ek1Var = nqa0.p;
        yzd0 status = rqa0Var2.getStatus();
        int iB = ptuVar.b();
        int iA = nra0.a.a(status, ptuVar);
        int iA2 = s08.a(iA) + ek1Var.d() + iA;
        ptuVar.b[iB] = iA;
        return qtu.d(nqa0.e, puo.a(rqa0Var2.b().b(), rqa0Var2.n().e())) + iA2 + iJ;
    }

    @Override // defpackage.yxd0
    public final void b(me80 me80Var, rqa0 rqa0Var, ptu ptuVar) throws IOException {
        rqa0 rqa0Var2 = rqa0Var;
        ek1 ek1Var = nqa0.a;
        String strM = rqa0Var2.m();
        if (strM != null) {
            me80Var.K0(ek1Var, strM, ptuVar);
        }
        ek1 ek1Var2 = nqa0.b;
        String strK = rqa0Var2.k();
        if (strK != null) {
            me80Var.u0(ek1Var2, strK, ptuVar);
        }
        me80Var.J(nqa0.c, (byte[]) ptuVar.c(byte[].class));
        String strA = rqa0Var2.n().f() ? rqa0Var2.n().a() : null;
        ek1 ek1Var3 = nqa0.d;
        if (strA != null) {
            me80Var.u0(ek1Var3, strA, ptuVar);
        }
        me80Var.P(nqa0.f, rqa0Var2.getName(), ptuVar);
        me80Var.d(nqa0.g, dra0.e(rqa0Var2.getKind()));
        me80Var.g(nqa0.h, rqa0Var2.f());
        me80Var.g(nqa0.i, rqa0Var2.i());
        me80Var.F(nqa0.j, rqa0Var2.getAttributes(), ptuVar);
        me80Var.V(nqa0.k, rqa0Var2.a() - rqa0Var2.getAttributes().size());
        me80Var.G(nqa0.l, rqa0Var2.e(), sqa0.a, ptuVar);
        me80Var.V(nqa0.m, rqa0Var2.l() - rqa0Var2.e().size());
        me80Var.G(nqa0.n, rqa0Var2.j(), bra0.a, ptuVar);
        me80Var.V(nqa0.o, rqa0Var2.h() - rqa0Var2.j().size());
        ek1 ek1Var4 = nqa0.p;
        yzd0 status = rqa0Var2.getStatus();
        me80Var.z0(ek1Var4, ptuVar.e());
        dk1 dk1VarD = mra0.d(status);
        me80Var.P(vzd0.a, status.a(), ptuVar);
        me80Var.d(vzd0.b, dk1VarD);
        me80Var.b0();
        me80Var.f(nqa0.e, puo.a(rqa0Var2.b().b(), rqa0Var2.n().e()));
    }
}
