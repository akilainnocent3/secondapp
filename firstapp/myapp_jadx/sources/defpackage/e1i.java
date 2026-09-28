package defpackage;

import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e1i {
    public static final t340 a(vtw vtwVar) {
        return new t340(vtwVar, null);
    }

    public static final v340 b(ztw ztwVar) {
        return new v340(ztwVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    public static final <T> p490<T> c(lyh<? extends T> lyhVar, int i) {
        l67.j.getClass();
        int i2 = l67.a.b;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        if (lyhVar instanceof u67) {
            u67 u67Var = (u67) lyhVar;
            pb5 pb5Var = u67Var.c;
            lyh<T> lyhVarJ = u67Var.j();
            if (lyhVarJ != null) {
                int i4 = u67Var.b;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i3 = i4;
                } else if (pb5Var == pb5.a) {
                    if (i4 == 0) {
                        i3 = 0;
                    }
                } else if (i == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                return new p490<>(i3, pb5Var, lyhVarJ, u67Var.a);
            }
        }
        return new p490<>(i3, pb5.a, lyhVar, e.a);
    }

    public static final t340 d(lyh lyhVar, v5b v5bVar, q490 q490Var, int i) {
        p490 p490VarC = c(lyhVar, i);
        b390 b390VarA = d390.a(i, p490VarC.b, p490VarC.c);
        return new t340(b390VarA, ej5.b(v5bVar, p490VarC.d, q490Var.equals(q490.a.a) ? a6b.a : a6b.d, new b1i(q490Var, p490VarC.a, b390VarA, d390.a, null)));
    }

    public static final v340 e(lyh lyhVar, v5b v5bVar, q490 q490Var, Object obj) {
        p490 p490VarC = c(lyhVar, 1);
        wwd0 wwd0VarA = xwd0.a(obj);
        return new v340(wwd0VarA, ej5.b(v5bVar, p490VarC.d, q490Var.equals(q490.a.a) ? a6b.a : a6b.d, new b1i(q490Var, p490VarC.a, wwd0VarA, obj, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(lyh lyhVar, v5b v5bVar, x1b x1bVar) throws Throwable {
        d1i d1iVar;
        if (x1bVar instanceof d1i) {
            d1iVar = (d1i) x1bVar;
            int i = d1iVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                d1iVar.b = i - Integer.MIN_VALUE;
            } else {
                d1iVar = new d1i(x1bVar);
            }
        } else {
            d1iVar = new d1i(x1bVar);
        }
        Object objQ = d1iVar.a;
        y5b y5bVar = y5b.a;
        int i2 = d1iVar.b;
        if (i2 == 0) {
            uj50.b(objQ);
            p490 p490VarC = c(lyhVar, 1);
            c9p c9pVar = (c9p) v5bVar.getCoroutineContext().get(c9p.b.a);
            dm8 dm8Var = new dm8(true);
            dm8Var.N(c9pVar);
            ej5.c(v5bVar, p490VarC.d, null, new c1i(p490VarC.a, dm8Var, null), 2);
            d1iVar.b = 1;
            objQ = dm8Var.q(d1iVar);
            if (objQ == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objQ);
        }
        Object obj = ((zi50) objQ).a;
        uj50.b(obj);
        return obj;
    }
}
