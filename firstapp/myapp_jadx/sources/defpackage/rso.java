package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class rso implements xxd0 {
    public static final rso a = new rso();

    @Override // defpackage.xxd0
    public int a(Object obj, Object obj2, ptu ptuVar) {
        oso osoVar = (oso) obj;
        qso qsoVarD = qso.d(osoVar);
        ptuVar.a(qsoVarD);
        return cyd0.e(ao70.c, osoVar.d(), ptuVar) + cyd0.c(ao70.b, (List) obj2, jra0.a, ptuVar) + qtu.f(ao70.a, qsoVarD);
    }

    @Override // defpackage.xxd0
    public void b(me80 me80Var, Object obj, Object obj2, ptu ptuVar) {
        me80Var.l(ao70.a, (qso) ptuVar.c(qso.class));
        me80Var.G(ao70.b, (List) obj2, jra0.a, ptuVar);
        me80Var.P(ao70.c, ((oso) obj).d(), ptuVar);
    }
}
