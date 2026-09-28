package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l6a0 {
    public static final Object a = new Object();

    public static final boolean a(gxd0 gxd0Var, int i, o4 o4Var, boolean z) {
        boolean z2;
        synchronized (a) {
            try {
                int i2 = gxd0Var.d;
                if (i2 == i) {
                    gxd0Var.c = o4Var;
                    z2 = true;
                    if (z) {
                        gxd0Var.e++;
                    }
                    gxd0Var.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final gxd0 b(SnapshotStateList snapshotStateList) {
        gxd0 gxd0Var = snapshotStateList.a;
        gxd0Var.getClass();
        return (gxd0) n5a0.r(gxd0Var, snapshotStateList);
    }

    public static final int c(SnapshotStateList snapshotStateList) {
        gxd0 gxd0Var = snapshotStateList.a;
        gxd0Var.getClass();
        return ((gxd0) n5a0.e(gxd0Var)).e;
    }

    public static final boolean e(SnapshotStateList snapshotStateList, Function1 function1) {
        int i;
        o4 o4Var;
        Object objInvoke;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (a) {
                gxd0 gxd0Var = snapshotStateList.a;
                gxd0Var.getClass();
                gxd0 gxd0Var2 = (gxd0) n5a0.e(gxd0Var);
                i = gxd0Var2.d;
                o4Var = gxd0Var2.c;
                Unit unit = Unit.a;
            }
            o4Var.getClass();
            fh00 fh00VarF = o4Var.f();
            objInvoke = function1.invoke(fh00VarF);
            o4 o4VarD = fh00VarF.d();
            if (Intrinsics.g(o4VarD, o4Var)) {
                break;
            }
            gxd0 gxd0Var3 = snapshotStateList.a;
            gxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = a((gxd0) n5a0.v(gxd0Var3, snapshotStateList, c5a0VarG), i, o4VarD, true);
            }
            n5a0.k(c5a0VarG, snapshotStateList);
        } while (!zA);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final void f(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, x1b x1bVar) {
        t95 t95Var;
        if (x1bVar instanceof t95) {
            t95Var = (t95) x1bVar;
            int i = t95Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t95Var.d = i - Integer.MIN_VALUE;
            } else {
                t95Var = new t95(this, x1bVar);
            }
        } else {
            t95Var = new t95(this, x1bVar);
        }
        Object obj = t95Var.b;
        y5b y5bVar = y5b.a;
        int i2 = t95Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            t95Var.a = str;
            t95Var.d = 1;
            if (hkd.b(1000L, t95Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = t95Var.a;
            uj50.b(obj);
        }
        return Boolean.valueOf(str.length() == 8);
    }
}
