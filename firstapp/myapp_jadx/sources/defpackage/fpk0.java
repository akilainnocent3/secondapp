package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fpk0 extends jok0 {
    public final ArrayList c;
    public final ArrayList d;
    public final g3l0 e;

    public fpk0(String str, ArrayList arrayList, List list, g3l0 g3l0Var) {
        super(str);
        this.c = new ArrayList();
        this.e = g3l0Var;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.c.add(((ipk0) obj).zzc());
            }
        }
        this.d = new ArrayList(list);
    }

    @Override // defpackage.jok0, defpackage.ipk0
    public final ipk0 a() {
        return new fpk0(this);
    }

    @Override // defpackage.jok0
    public final ipk0 g(g3l0 g3l0Var, List list) {
        bqk0 bqk0Var;
        g3l0 g3l0VarC = this.e.c();
        pqk0 pqk0Var = g3l0VarC.b;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            bqk0Var = ipk0.o;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                g3l0VarC.f((String) arrayList.get(i2), g3l0Var.b.b(g3l0Var, (ipk0) list.get(i2)));
            } else {
                g3l0VarC.f((String) arrayList.get(i2), bqk0Var);
            }
            i2++;
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            ipk0 ipk0Var = (ipk0) obj;
            ipk0 ipk0VarB = pqk0Var.b(g3l0VarC, ipk0Var);
            if (ipk0VarB instanceof lpk0) {
                ipk0VarB = pqk0Var.b(g3l0VarC, ipk0Var);
            }
            if (ipk0VarB instanceof ynk0) {
                return ((ynk0) ipk0VarB).a;
            }
        }
        return bqk0Var;
    }

    public fpk0(fpk0 fpk0Var) {
        super(fpk0Var.a);
        ArrayList arrayList = new ArrayList(fpk0Var.c.size());
        this.c = arrayList;
        arrayList.addAll(fpk0Var.c);
        ArrayList arrayList2 = new ArrayList(fpk0Var.d.size());
        this.d = arrayList2;
        arrayList2.addAll(fpk0Var.d);
        this.e = fpk0Var.e;
    }
}
