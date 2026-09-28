package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ah50 {
    public final ArrayList a = new ArrayList();

    public static final class a<T> {
        public final Class<T> a;
        public final zg50<T> b;

        public a(Class<T> cls, zg50<T> zg50Var) {
            this.a = cls;
            this.b = zg50Var;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized <Z> zg50<Z> a(Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.a.get(i);
            if (aVar.a.isAssignableFrom((Class<?>) cls)) {
                return aVar.b;
            }
        }
        return null;
    }
}
