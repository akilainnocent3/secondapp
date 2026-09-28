package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class cjg0 {
    public final Object a;
    public final boolean b;
    public final pg50 c;
    public final ss60 d;
    public final fra0 e;
    public final gcd f;
    public final ht70 g;
    public volatile rm8 h;

    public cjg0(pg50 pg50Var, kt70 kt70Var, ss60 ss60Var, ArrayList arrayList, gcd gcdVar, ht70 ht70Var) {
        tx30 tx30Var = tx30.a;
        this.a = new Object();
        this.h = null;
        this.b = true;
        this.c = pg50Var;
        this.d = ss60Var;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add((fra0) obj);
        }
        this.e = arrayList2.isEmpty() ? eyx.a : arrayList2.size() == 1 ? (fra0) arrayList2.get(0) : new flw(new ArrayList(arrayList2));
        this.f = gcdVar;
        this.g = ht70Var;
    }
}
