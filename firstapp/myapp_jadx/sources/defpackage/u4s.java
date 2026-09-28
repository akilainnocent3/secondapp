package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class u4s {
    public final ArrayList a;

    public u4s(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public boolean a(h8l h8lVar, Object obj) {
        ArrayList<Object> arrayList = h8lVar.a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (!(obj2 instanceof l00)) {
                if (!(obj2 instanceof h8l)) {
                    ogf.a(obj2, "Unexpected child source info ");
                    break;
                }
                if (a((h8l) obj2, obj)) {
                    return true;
                }
            } else {
                if (obj2 == obj) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract hqc b();

    public void c(hqc hqcVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((tce0) obj).a0(hqcVar);
        }
    }

    public void d(h8l h8lVar, Object obj) {
        if (h8lVar == null || obj == null) {
            return;
        }
        a(h8lVar, obj);
    }

    public void e(tce0 tce0Var) {
        ArrayList arrayList = this.a;
        if (arrayList.contains(tce0Var)) {
            return;
        }
        if (b() != null) {
            tce0Var.a0(b());
        }
        arrayList.add(tce0Var);
    }
}
