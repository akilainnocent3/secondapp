package androidx.recyclerview.widget;

import defpackage.c220;
import defpackage.hb5;
import defpackage.nj90;
import defpackage.qkt;
import defpackage.rkt;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public final nj90<RecyclerView.d0, a> a = new nj90<>();
    public final qkt<RecyclerView.d0> b = new qkt<>();

    public static class a {
        public static final c220 d = new c220(20);
        public int a;
        public RecyclerView.l.b b;
        public RecyclerView.l.b c;

        public static a a() {
            a aVar = (a) d.b();
            return aVar == null ? new a() : aVar;
        }
    }

    public final void a(RecyclerView.d0 d0Var, RecyclerView.l.b bVar) {
        nj90<RecyclerView.d0, a> nj90Var = this.a;
        a aVarA = nj90Var.get(d0Var);
        if (aVarA == null) {
            aVarA = a.a();
            nj90Var.put(d0Var, aVarA);
        }
        aVarA.c = bVar;
        aVarA.a |= 8;
    }

    public final RecyclerView.l.b b(RecyclerView.d0 d0Var, int i) {
        a aVarK;
        RecyclerView.l.b bVar;
        nj90<RecyclerView.d0, a> nj90Var = this.a;
        int iE = nj90Var.e(d0Var);
        if (iE >= 0 && (aVarK = nj90Var.k(iE)) != null) {
            int i2 = aVarK.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                aVarK.a = i3;
                if (i == 4) {
                    bVar = aVarK.b;
                } else if (i == 8) {
                    bVar = aVarK.c;
                } else {
                    hb5.a("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    nj90Var.i(iE);
                    aVarK.a = 0;
                    aVarK.b = null;
                    aVarK.c = null;
                    a.d.a(aVarK);
                }
                return bVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    public final void d(RecyclerView.d0 d0Var) {
        qkt<RecyclerView.d0> qktVar = this.b;
        for (int iH = qktVar.h() - 1; iH >= 0; iH--) {
            if (d0Var == qktVar.i(iH)) {
                Object[] objArr = qktVar.c;
                Object obj = objArr[iH];
                Object obj2 = rkt.a;
                if (obj == obj2) {
                    break;
                }
                objArr[iH] = obj2;
                qktVar.a = true;
                break;
            }
        }
        a aVarRemove = this.a.remove(d0Var);
        if (aVarRemove != null) {
            aVarRemove.a = 0;
            aVarRemove.b = null;
            aVarRemove.c = null;
            a.d.a(aVarRemove);
        }
    }
}
