package yads;

import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ly2 {
    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static iy2 a(Set set, og2 og2Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof iy2) {
                iy2 iy2Var = (iy2) sortedSet;
                og2 og2Var2 = iy2Var.f152181c;
                og2Var2.getClass();
                og2Var.getClass();
                return new jy2((SortedSet) iy2Var.f152180b, new pg2(Arrays.asList(og2Var2, og2Var)));
            }
            og2Var.getClass();
            return new jy2(sortedSet, og2Var);
        }
        if (set instanceof iy2) {
            iy2 iy2Var2 = (iy2) set;
            og2 og2Var3 = iy2Var2.f152181c;
            og2Var3.getClass();
            og2Var.getClass();
            return new iy2((Set) iy2Var2.f152180b, new pg2(Arrays.asList(og2Var3, og2Var)));
        }
        set.getClass();
        og2Var.getClass();
        return new iy2(set, og2Var);
    }

    public static int a(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static Set a() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }
}
