package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class x4s {
    public final m2l a;
    public final n4p b;

    public x4s(m2l m2lVar, n4p n4pVar) {
        m2lVar.getClass();
        this.a = m2lVar;
        this.b = n4pVar;
    }

    public static List a(List list, List list2) {
        if (list == null || list2 == null) {
            return m2g.a;
        }
        HashSet hashSet = new HashSet(list);
        hashSet.retainAll(list2);
        return new ArrayList(hashSet);
    }

    public static boolean b(List list, List list2) {
        return list != null && list.size() == list2.size() && new HashSet(list).equals(new HashSet(list2));
    }
}
