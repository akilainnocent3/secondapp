package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class bra0 implements yxd0<sfs> {
    public static final bra0 a = new bra0();

    @Override // defpackage.yxd0
    public final int a(sfs sfsVar, ptu ptuVar) {
        sfs sfsVar2 = sfsVar;
        byte[] bArrD = dra0.d(sfsVar2.b().d());
        ptuVar.a(bArrD);
        return qtu.d(nqa0.b.f, puo.a(sfsVar2.b().b(), sfsVar2.b().e())) + qtu.j(nqa0.b.e, sfsVar2.a() - sfsVar2.getAttributes().size()) + cyd0.b(nqa0.b.d, sfsVar2.getAttributes(), ptuVar) + qtu.b(nqa0.b.c, bArrD) + qtu.h(nqa0.b.b, sfsVar2.b().a()) + qtu.i(nqa0.b.a, sfsVar2.b().c());
    }

    @Override // defpackage.yxd0
    public final void b(me80 me80Var, sfs sfsVar, ptu ptuVar) throws IOException {
        sfs sfsVar2 = sfsVar;
        ek1 ek1Var = nqa0.b.a;
        String strC = sfsVar2.b().c();
        if (strC != null) {
            me80Var.K0(ek1Var, strC, ptuVar);
        }
        ek1 ek1Var2 = nqa0.b.b;
        String strA = sfsVar2.b().a();
        if (strA != null) {
            me80Var.u0(ek1Var2, strA, ptuVar);
        }
        me80Var.J(nqa0.b.c, (byte[]) ptuVar.c(byte[].class));
        me80Var.F(nqa0.b.d, sfsVar2.getAttributes(), ptuVar);
        me80Var.V(nqa0.b.e, sfsVar2.a() - sfsVar2.getAttributes().size());
        me80Var.f(nqa0.b.f, puo.a(sfsVar2.b().b(), sfsVar2.b().e()));
    }
}
