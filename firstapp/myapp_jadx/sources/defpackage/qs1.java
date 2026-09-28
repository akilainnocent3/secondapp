package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class qs1 {
    public static final List<j58> a(ps1 ps1Var) {
        ps1Var.getClass();
        if (ps1Var instanceof ps1.b) {
            long j = ((ps1.b) ps1Var).a;
            return b.k(new j58(j), new j58(j), new j58(j));
        }
        if (!(ps1Var instanceof ps1.a)) {
            uhc.a();
            return null;
        }
        List<j58> list = ((ps1.a) ps1Var).a;
        int size = list.size();
        if (size == 1) {
            return b.k(list.get(0), list.get(0), list.get(0));
        }
        if (size == 2) {
            return b.k(list.get(0), list.get(0), list.get(1));
        }
        if (size == 3) {
            return list;
        }
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            j58 j58Var = (j58) CollectionsKt.T(list);
            long j2 = j58Var.a;
            arrayList.add(j58Var);
        }
        return arrayList;
    }
}
