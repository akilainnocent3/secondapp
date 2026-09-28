package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class eom implements a2z {
    public static final nbd c = new nbd("http-client-experimental-metrics-start-attributes");
    public static final Logger d = Logger.getLogger(eom.class.getName());
    public final yjt a;
    public final yjt b;

    public eom(fpv fpvVar) {
        zjt zjtVarC = fpvVar.d("http.client.request.body.size").b("By").a("Size of HTTP client request bodies.").c();
        xom.a(zjtVarC);
        this.a = zjtVarC.build();
        zjt zjtVarC2 = fpvVar.d("http.client.response.body.size").b("By").a("Size of HTTP client response bodies.").c();
        xom.a(zjtVarC2);
        this.b = zjtVarC2.build();
    }

    @Override // defpackage.a2z
    public final m0b a(m0b m0bVar, wgh0 wgh0Var, long j) {
        return m0bVar.a(c, wgh0Var);
    }

    @Override // defpackage.a2z
    public final void b(m0b m0bVar, wgh0 wgh0Var, long j) {
        Object obj;
        Object objE;
        m21 m21Var = (m21) m0bVar.b(c);
        if (m21Var == null) {
            d.log(Level.FINE, "No state present when ending context {0}. Cannot record HTTP request metrics.", m0bVar);
            return;
        }
        xw0 builder = m21Var.toBuilder();
        builder.c(wgh0Var);
        m21 m21VarA = builder.a();
        m21[] m21VarArr = {wgh0Var, m21Var};
        kyo kyoVar = wom.a;
        int i = 0;
        while (true) {
            obj = null;
            if (i >= 2) {
                objE = null;
                break;
            }
            objE = m21VarArr[i].e(kyoVar);
            if (objE != null) {
                break;
            } else {
                i++;
            }
        }
        Long l = (Long) objE;
        if (l != null) {
            this.a.c(l.longValue(), m21VarA, m0bVar);
        }
        m21[] m21VarArr2 = {wgh0Var, m21Var};
        kyo kyoVar2 = wom.b;
        for (int i2 = 0; i2 < 2; i2++) {
            Object objE2 = m21VarArr2[i2].e(kyoVar2);
            if (objE2 != null) {
                obj = objE2;
                break;
            }
        }
        Long l2 = (Long) obj;
        if (l2 != null) {
            this.b.c(l2.longValue(), m21VarA, m0bVar);
        }
    }
}
