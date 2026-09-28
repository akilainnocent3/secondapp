package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class ch30 {
    public static dh30.c a(fg30 fg30Var, Function1 function1) {
        boolean z = fg30Var.c;
        ArrayList arrayList = fg30Var.a;
        if (z) {
            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                bh30 bh30Var = (bh30) obj;
                arrayList2.add(bh30Var.a == 20 ? bh30.a(bh30Var, true) : bh30.a(bh30Var, false));
            }
            arrayList = arrayList2;
        }
        fg30 fg30Var2 = new fg30();
        fg30Var2.a.addAll(arrayList);
        fg30Var2.b = function1;
        return new dh30.c(fg30Var2);
    }

    public static dh30.c b(fg30 fg30Var, Function1 function1) {
        fg30Var.getClass();
        ArrayList arrayList = fg30Var.a;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(bh30.a((bh30) obj, false));
        }
        fg30 fg30Var2 = new fg30();
        fg30Var2.a.addAll(arrayList2);
        fg30Var2.b = function1;
        return new dh30.c(fg30Var2);
    }

    public static dh30 c(sj30 sj30Var, Function1 function1, boolean z) {
        sj30Var.getClass();
        List<Integer> list = sj30Var.b;
        if (list == null || list.isEmpty()) {
            return dh30.a.a;
        }
        fg30 fg30Var = new fg30();
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new bh30(iIntValue, String.valueOf(iIntValue), hce0.a(iIntValue, sj30Var.a), z && iIntValue == 20));
        }
        fg30Var.a.addAll(arrayList);
        fg30Var.b = function1;
        return new dh30.c(fg30Var);
    }

    public static dh30.c d(fg30 fg30Var, bh30 bh30Var, Function1 function1) {
        fg30Var.getClass();
        ArrayList arrayList = fg30Var.a;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bh30 bh30Var2 = (bh30) obj;
            arrayList2.add(bh30Var2.a == bh30Var.a ? bh30.a(bh30Var2, !bh30Var.d) : bh30.a(bh30Var2, false));
        }
        fg30 fg30Var2 = new fg30();
        fg30Var2.a.addAll(arrayList2);
        fg30Var2.b = function1;
        return new dh30.c(fg30Var2);
    }
}
