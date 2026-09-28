package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class zex extends f3z<Comparable<?>> implements Serializable {
    public static final zex a = new zex();

    @Override // defpackage.f3z
    public final <S extends Comparable<?>> f3z<S> a() {
        return xo50.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
