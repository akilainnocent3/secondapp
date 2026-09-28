package defpackage;

import androidx.compose.runtime.d;

/* JADX INFO: loaded from: classes.dex */
public final class jna {
    public static final <T> T a(ne00 ne00Var, d dVar) {
        dVar.getClass();
        Object objB = ne00Var.get(dVar);
        if (objB == null) {
            objB = dVar.b();
        }
        return (T) ((avh0) objB).a(ne00Var);
    }

    public static final ne00 b(j730<?>[] j730VarArr, ne00 ne00Var, ne00 ne00Var2) {
        me00 me00Var = me00.i;
        me00.a aVar = new me00.a(me00Var);
        aVar.i = me00Var;
        for (j730<?> j730Var : j730VarArr) {
            d dVar = j730Var.a;
            if (j730Var.f || !ne00Var.containsKey(dVar)) {
                aVar.put(dVar, dVar.c(j730Var, (avh0) ne00Var2.get(dVar)));
            }
        }
        return aVar.build();
    }
}
