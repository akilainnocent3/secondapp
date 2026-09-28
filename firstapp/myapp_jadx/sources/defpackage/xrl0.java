package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class xrl0 extends jok0 {
    public final boolean c;
    public final boolean d;
    public final /* synthetic */ jsl0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrl0(jsl0 jsl0Var, boolean z, boolean z2) {
        super("log");
        this.e = jsl0Var;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095 A[LOOP:0: B:23:0x008b->B:25:0x0095, LOOP_END] */
    @Override // defpackage.jok0
    public final ipk0 g(g3l0 g3l0Var, List list) {
        int i;
        int i2;
        String strZzc;
        ArrayList arrayList;
        r5l0.b(1, "log", list);
        int size = list.size();
        bqk0 bqk0Var = ipk0.o;
        jsl0 jsl0Var = this.e;
        if (size == 1) {
            jsl0Var.c.a(3, g3l0Var.b.b(g3l0Var, (ipk0) list.get(0)).zzc(), Collections.EMPTY_LIST, this.c, this.d);
            return bqk0Var;
        }
        ipk0 ipk0Var = (ipk0) list.get(0);
        pqk0 pqk0Var = g3l0Var.b;
        pqk0 pqk0Var2 = g3l0Var.b;
        int iG = r5l0.g(pqk0Var.b(g3l0Var, ipk0Var).zzd().doubleValue());
        if (iG != 2) {
            i = 3;
            if (iG == 3) {
                i2 = 1;
            } else if (iG == 5) {
                i2 = 5;
            } else if (iG == 6) {
                i2 = 2;
            }
            strZzc = pqk0Var2.b(g3l0Var, (ipk0) list.get(1)).zzc();
            if (list.size() == 2) {
                jsl0Var.c.a(i2, strZzc, Collections.EMPTY_LIST, this.c, this.d);
                return bqk0Var;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(pqk0Var2.b(g3l0Var, (ipk0) list.get(i3)).zzc());
            }
            jsl0Var.c.a(i2, strZzc, arrayList, this.c, this.d);
            return bqk0Var;
        }
        i = 4;
        i2 = i;
        strZzc = pqk0Var2.b(g3l0Var, (ipk0) list.get(1)).zzc();
        if (list.size() == 2) {
            jsl0Var.c.a(i2, strZzc, Collections.EMPTY_LIST, this.c, this.d);
            return bqk0Var;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(pqk0Var2.b(g3l0Var, (ipk0) list.get(i3)).zzc());
        }
        jsl0Var.c.a(i2, strZzc, arrayList, this.c, this.d);
        return bqk0Var;
    }
}
