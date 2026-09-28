package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kbp {
    public final qap a;

    public kbp(qap qapVar) {
        this.a = qapVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        jbp jbpVar;
        Object bVar;
        if (x1bVar instanceof jbp) {
            jbpVar = (jbp) x1bVar;
            int i = jbpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbpVar.c = i - Integer.MIN_VALUE;
            } else {
                jbpVar = new jbp(this, x1bVar);
            }
        } else {
            jbpVar = new jbp(this, x1bVar);
        }
        Object objA = jbpVar.a;
        y5b y5bVar = y5b.a;
        int i2 = jbpVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                qap qapVar = this.a;
                jbpVar.c = 1;
                objA = qapVar.a(str, jbpVar);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objA);
            }
            bVar = (Map) objA;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) == null) {
            return bVar;
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return o2gVar;
    }
}
