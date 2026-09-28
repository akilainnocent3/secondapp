package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class aoa<T> implements csz<T> {
    public final Function2<ygp<Object>, List<? extends qhp>, php<T>> a;
    public final ConcurrentHashMap<Class<?>, bsz<T>> b = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public aoa(Function2<? super ygp<Object>, ? super List<? extends qhp>, ? extends php<T>> function2) {
        this.a = function2;
    }

    @Override // defpackage.csz
    public final Object a(ygp ygpVar, ArrayList arrayList) {
        Object bVar;
        bsz<T> bszVarPutIfAbsent;
        Class<?> clsB = tgp.b(ygpVar);
        ConcurrentHashMap<Class<?>, bsz<T>> concurrentHashMap = this.b;
        bsz<T> bszVar = concurrentHashMap.get(clsB);
        if (bszVar == null && (bszVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsB, (bszVar = new bsz<>()))) != null) {
            bszVar = bszVarPutIfAbsent;
        }
        bsz<T> bszVar2 = bszVar;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(new rhp((qhp) obj));
        }
        ConcurrentHashMap<List<rhp>, zi50<php<T>>> concurrentHashMap2 = bszVar2.a;
        zi50<php<T>> zi50Var = concurrentHashMap2.get(arrayList2);
        if (zi50Var == null) {
            try {
                zi50.a aVar = zi50.b;
                bVar = (php) this.a.invoke(ygpVar, arrayList);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            zi50<php<T>> zi50Var2 = new zi50<>(bVar);
            zi50<php<T>> zi50VarPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList2, zi50Var2);
            zi50Var = zi50VarPutIfAbsent == null ? zi50Var2 : zi50VarPutIfAbsent;
        }
        return zi50Var.a;
    }
}
