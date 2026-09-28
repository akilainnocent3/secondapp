package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class te6 {
    public static void a(tz5 tz5Var, ArrayList arrayList) {
        if (!(tz5Var instanceof uz5.a)) {
            if (tz5Var instanceof se6) {
                arrayList.add(((se6) tz5Var).a);
                return;
            } else {
                arrayList.add(new re6(tz5Var));
                return;
            }
        }
        ArrayList arrayList2 = ((uz5.a) tz5Var).a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            a((tz5) obj, arrayList);
        }
    }
}
