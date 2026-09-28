package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class lom {
    public static final ArrayList a = new ArrayList();

    static {
        Iterator it = ServiceLoader.load(jom.class).iterator();
        while (it.hasNext()) {
            a.add((jom) it.next());
        }
    }

    public static String a(m0b m0bVar, final Object obj) {
        bom bomVar = amy.a;
        final String strB = bomVar instanceof com ? ((com) bomVar).b() : null;
        if (a.isEmpty()) {
            return strB;
        }
        Function function = new Function() { // from class: kom
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                ArrayList arrayList = lom.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    String strA = ((jom) obj3).a();
                    if (strA != null) {
                        return strA;
                    }
                }
                return strB;
            }
        };
        ThreadLocal<bto> threadLocal = bto.b;
        bto btoVar = threadLocal.get();
        if (btoVar == null) {
            btoVar = new bto();
            threadLocal.set(btoVar);
        }
        return (String) btoVar.a.computeIfAbsent("url.template", function);
    }
}
