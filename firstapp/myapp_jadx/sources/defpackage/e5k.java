package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class e5k {
    public final wo5 a;
    public final psm b;

    public e5k(wo5 wo5Var, psm psmVar) {
        wo5Var.getClass();
        psmVar.getClass();
        this.a = wo5Var;
        this.b = psmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(x1b x1bVar) {
        d5k d5kVar;
        if (x1bVar instanceof d5k) {
            d5kVar = (d5k) x1bVar;
            int i = d5kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d5kVar.c = i - Integer.MIN_VALUE;
            } else {
                d5kVar = new d5k(this, x1bVar);
            }
        } else {
            d5kVar = new d5k(this, x1bVar);
        }
        Object objQ = d5kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = d5kVar.c;
        if (i2 == 0) {
            uj50.b(objQ);
            wl50 wl50VarM = bm50.m(this.a.e(), new c5k(this, 0));
            d5kVar.c = 1;
            objQ = bm50.q(wl50VarM, d5kVar);
            if (objQ == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objQ);
        }
        Iterable<u4c> iterable = (List) objQ;
        if (iterable == null) {
            iterable = m2g.a;
        }
        int iA = jpu.a(l48.r(iterable, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (u4c u4cVar : iterable) {
            linkedHashMap.put(u4cVar.a, u4cVar.b);
        }
        return linkedHashMap;
    }
}
