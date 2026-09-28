package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class pso implements xxd0<oso, List<rft>> {
    public static final pso a = new pso();

    @Override // defpackage.xxd0
    public final int a(oso osoVar, List<rft> list, ptu ptuVar) {
        oso osoVar2 = osoVar;
        qso qsoVarD = qso.d(osoVar2);
        ptuVar.a(qsoVarD);
        return cyd0.e(xn70.c, osoVar2.d(), ptuVar) + cyd0.c(xn70.b, list, zft.a, ptuVar) + qtu.f(xn70.a, qsoVarD);
    }

    @Override // defpackage.xxd0
    public final void b(me80 me80Var, oso osoVar, List<rft> list, ptu ptuVar) {
        me80Var.l(xn70.a, (qso) ptuVar.c(qso.class));
        me80Var.G(xn70.b, list, zft.a, ptuVar);
        me80Var.P(xn70.c, osoVar.d(), ptuVar);
    }
}
