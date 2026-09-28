package defpackage;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
public class vl8 {
    /* JADX WARN: Type inference failed for: r0v1, types: [sl8] */
    public static sl8 a(final Function1... function1Arr) {
        if (function1Arr.length > 0) {
            return new Comparator() { // from class: sl8
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    for (Function1 function1 : function1Arr) {
                        int iB = vl8.b((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                        if (iB != 0) {
                            return iB;
                        }
                    }
                    return 0;
                }
            };
        }
        hb5.a("Failed requirement.");
        return null;
    }

    public static <T extends Comparable<?>> int b(T t, T t2) {
        if (t == null) {
            return t2 == null ? 0 : -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
