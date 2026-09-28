package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class xo50 extends f3z<Comparable<?>> implements Serializable {
    public static final xo50 a = new xo50();

    @Override // defpackage.f3z
    public final <S extends Comparable<?>> f3z<S> a() {
        return zex.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
