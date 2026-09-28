package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public interface h690 {
    /* JADX WARN: Code duplicated, block: B:27:0x005c A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:13:0x002b, B:25:0x0056, B:27:0x005c, B:30:0x0071, B:18:0x0039, B:24:0x004f, B:21:0x0040), top: B:39:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:25:0x0056->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object f(h690 h690Var, ArrayList arrayList, x1b x1bVar) {
        g690 g690Var;
        Object bVar;
        Throwable thA;
        h690 h690Var2;
        Iterator it;
        ygm ygmVar;
        if (x1bVar instanceof g690) {
            g690Var = (g690) x1bVar;
            int i = g690Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                g690Var.f = i - Integer.MIN_VALUE;
            } else {
                g690Var = new g690(h690Var, x1bVar);
            }
        } else {
            g690Var = new g690(h690Var, x1bVar);
        }
        Object obj = g690Var.d;
        y5b y5bVar = y5b.a;
        int i2 = g690Var.f;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                g690Var.a = h690Var;
                g690Var.b = arrayList;
                g690Var.f = 1;
                if (h690Var.d(g690Var) == y5bVar) {
                }
                return y5bVar;
            }
            if (i2 == 1) {
                arrayList = g690Var.b;
                h690Var = g690Var.a;
                uj50.b(obj);
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = g690Var.c;
                h690Var2 = g690Var.a;
                uj50.b(obj);
            }
            while (it.hasNext()) {
                ygmVar = (ygm) it.next();
                g690Var.a = h690Var2;
                g690Var.b = null;
                g690Var.c = it;
                g690Var.f = 2;
                if (h690Var2.g(ygmVar, g690Var) == y5bVar) {
                    return y5bVar;
                }
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
            thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a.f(thA, a320.a("Error while replacing all home shortcuts: ", thA), new Object[0]);
            }
            return Unit.a;
            Iterator it2 = arrayList.iterator();
            h690Var2 = h690Var;
            it = it2;
            while (it.hasNext()) {
                ygmVar = (ygm) it.next();
                g690Var.a = h690Var2;
                g690Var.b = null;
                g690Var.c = it;
                g690Var.f = 2;
                if (h690Var2.g(ygmVar, g690Var) == y5bVar) {
                    return y5bVar;
                }
            }
            bVar = Unit.a;
            zi50.a aVar3 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.f(thA, a320.a("Error while replacing all home shortcuts: ", thA), new Object[0]);
        }
        return Unit.a;
    }

    default Object a(ArrayList arrayList, t790 t790Var) {
        return f(this, arrayList, t790Var);
    }

    Object b(ArrayList arrayList, n790 n790Var);

    Object c(s790 s790Var);

    Object d(x1b x1bVar);

    Object e(ArrayList arrayList, z690 z690Var);

    Object g(ygm ygmVar, x1b x1bVar);

    Object h(u690 u690Var, q790 q790Var);
}
