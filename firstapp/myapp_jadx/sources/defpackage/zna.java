package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class zna<T> implements oe80<T> {
    public final Function1<ygp<?>, php<T>> a;
    public final ConcurrentHashMap<Class<?>, nr5<T>> b = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public zna(Function1<? super ygp<?>, ? extends php<T>> function1) {
        this.a = function1;
    }

    @Override // defpackage.oe80
    public final php<T> a(ygp<Object> ygpVar) {
        nr5<T> nr5VarPutIfAbsent;
        Class<?> clsB = tgp.b(ygpVar);
        ConcurrentHashMap<Class<?>, nr5<T>> concurrentHashMap = this.b;
        nr5<T> nr5Var = concurrentHashMap.get(clsB);
        if (nr5Var == null && (nr5VarPutIfAbsent = concurrentHashMap.putIfAbsent(clsB, (nr5Var = new nr5<>(this.a.invoke(ygpVar))))) != null) {
            nr5Var = nr5VarPutIfAbsent;
        }
        return nr5Var.a;
    }
}
