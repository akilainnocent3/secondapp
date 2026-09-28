package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class erg0 {
    public final ArrayList a = new ArrayList();

    public static final class a<Z, R> {
        public final Class<Z> a;
        public final Class<R> b;
        public final qh50<Z, R> c;

        public a(Class<Z> cls, Class<R> cls2, qh50<Z, R> qh50Var) {
            this.a = cls;
            this.b = cls2;
            this.c = qh50Var;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            a aVar = (a) obj;
            if ((aVar.a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.b)) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }
}
