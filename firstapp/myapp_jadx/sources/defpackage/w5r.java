package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface w5r {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object a(w5r w5rVar, long j, x1b x1bVar) {
        v5r v5rVar;
        if (x1bVar instanceof v5r) {
            v5rVar = (v5r) x1bVar;
            int i = v5rVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v5rVar.e = i - Integer.MIN_VALUE;
            } else {
                v5rVar = new v5r(w5rVar, x1bVar);
            }
        } else {
            v5rVar = new v5r(w5rVar, x1bVar);
        }
        Object obj = v5rVar.c;
        y5b y5bVar = y5b.a;
        int i2 = v5rVar.e;
        if (i2 == 0) {
            uj50.b(obj);
            v5rVar.a = w5rVar;
            v5rVar.b = j;
            v5rVar.e = 1;
            if (w5rVar.e(j, v5rVar) != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = v5rVar.b;
        w5rVar = v5rVar.a;
        uj50.b(obj);
        v5rVar.a = null;
        v5rVar.b = j;
        v5rVar.e = 2;
        Object objC = w5rVar.c(v5rVar);
        return objC == y5bVar ? y5bVar : objC;
    }

    Object b(e6r e6rVar, ibr.a aVar);

    Object c(v5r v5rVar);

    q2i d();

    Object e(long j, v5r v5rVar);

    default Object f(long j, ebr ebrVar) {
        return a(this, j, ebrVar);
    }
}
