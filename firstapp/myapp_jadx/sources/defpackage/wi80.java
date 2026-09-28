package defpackage;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class wi80 {
    public static ph80 a(ph80 ph80Var) {
        xnu<E, ?> xnuVar = ph80Var.a;
        xnuVar.c();
        return xnuVar.w > 0 ? ph80Var : ph80.c;
    }

    public static <T> Set<T> b(T t) {
        Set<T> setSingleton = Collections.singleton(t);
        setSingleton.getClass();
        return setSingleton;
    }
}
