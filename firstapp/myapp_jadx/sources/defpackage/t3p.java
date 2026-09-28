package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t3p {
    public static <T> T a(Iterable<T> iterable) {
        T next;
        if (!(iterable instanceof List)) {
            Iterator<T> it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return (T) uts.a(1, list);
        }
        lrh0.a();
        return null;
    }

    public static <T> void b(List<T> list, om20<? super T> om20Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (om20Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }
}
