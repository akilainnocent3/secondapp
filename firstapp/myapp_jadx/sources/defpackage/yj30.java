package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yj30 {
    public final ArrayList a;

    public yj30(List<uj30> list) {
        this.a = new ArrayList(list);
    }

    public static String d(yj30 yj30Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = yj30Var.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((uj30) obj).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    public final boolean a(Class<? extends uj30> cls) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (cls.isAssignableFrom(((uj30) obj).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final <T extends uj30> T b(Class<T> cls) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            T t = (T) obj;
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            uj30 uj30Var = (uj30) obj;
            if (cls.isAssignableFrom(uj30Var.getClass())) {
                arrayList.add(uj30Var);
            }
        }
        return arrayList;
    }
}
