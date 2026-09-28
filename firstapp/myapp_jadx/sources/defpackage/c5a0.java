package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class c5a0 {
    public static final a e = new a();
    public i5a0 a;
    public long b;
    public boolean c;
    public int d;

    public static final class a {
        public static c5a0 a() {
            return n5a0.b.a();
        }

        public static c5a0 b(c5a0 c5a0Var) {
            if (c5a0Var instanceof jug0) {
                jug0 jug0Var = (jug0) c5a0Var;
                if (jug0Var.u == ipf0.a()) {
                    jug0Var.s = null;
                    return c5a0Var;
                }
            }
            if (c5a0Var instanceof kug0) {
                kug0 kug0Var = (kug0) c5a0Var;
                if (kug0Var.j == ipf0.a()) {
                    kug0Var.i = null;
                    return c5a0Var;
                }
            }
            c5a0 c5a0VarD = n5a0.d(c5a0Var, null, false);
            c5a0VarD.j();
            return c5a0VarD;
        }

        public static Object c(Function0 function0, Function1 function1) {
            c5a0 jug0Var;
            if (function1 == null) {
                return function0.invoke();
            }
            c5a0 c5a0VarA = n5a0.b.a();
            if (c5a0VarA instanceof jug0) {
                jug0 jug0Var2 = (jug0) c5a0VarA;
                if (jug0Var2.u == ipf0.a()) {
                    Function1<Object, Unit> function2 = jug0Var2.s;
                    Function1<Object, Unit> function3 = jug0Var2.t;
                    try {
                        ((jug0) c5a0VarA).s = n5a0.h(function1, function2, true);
                        ((jug0) c5a0VarA).t = function3;
                        return function0.invoke();
                    } finally {
                        jug0Var2.s = function2;
                        jug0Var2.t = function3;
                    }
                }
            }
            if (c5a0VarA == null || (c5a0VarA instanceof wtw)) {
                jug0Var = new jug0(c5a0VarA instanceof wtw ? (wtw) c5a0VarA : null, function1, null, true, false);
            } else {
                if (function1 == null) {
                    return function0.invoke();
                }
                jug0Var = c5a0VarA.u(function1);
            }
            try {
                c5a0 c5a0VarJ = jug0Var.j();
                try {
                    Object objInvoke = function0.invoke();
                    c5a0.q(c5a0VarJ);
                    jug0Var.c();
                    return objInvoke;
                } catch (Throwable th) {
                    c5a0.q(c5a0VarJ);
                    throw th;
                }
            } catch (Throwable th2) {
                jug0Var.c();
                throw th2;
            }
        }

        public static b5a0 d(Function2 function2) {
            n5a0.b(n5a0.a);
            synchronized (n5a0.c) {
                n5a0.h = CollectionsKt.j0(n5a0.h, function2);
                Unit unit = Unit.a;
            }
            return new b5a0(function2);
        }

        public static void e(c5a0 c5a0Var, c5a0 c5a0Var2, Function1 function1) {
            if (c5a0Var != c5a0Var2) {
                c5a0Var2.getClass();
                c5a0.q(c5a0Var);
                c5a0Var2.c();
            } else if (c5a0Var instanceof jug0) {
                ((jug0) c5a0Var).s = function1;
            } else if (c5a0Var instanceof kug0) {
                ((kug0) c5a0Var).i = function1;
            } else {
                ogf.a(c5a0Var, "Non-transparent snapshot was reused: ");
            }
        }

        public static void f() {
            boolean z;
            synchronized (n5a0.c) {
                stw<nxd0> stwVar = n5a0.j.i;
                z = false;
                if (stwVar != null && stwVar.c()) {
                    z = true;
                }
            }
            if (z) {
                n5a0.b(n5a0.a);
            }
        }

        public static wtw g(wer werVar, sj40 sj40Var) {
            wtw wtwVarC;
            c5a0 c5a0VarG = n5a0.g();
            wtw wtwVar = c5a0VarG instanceof wtw ? (wtw) c5a0VarG : null;
            if (wtwVar != null && (wtwVarC = wtwVar.C(werVar, sj40Var)) != null) {
                return wtwVarC;
            }
            ib5.a("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
    }

    public c5a0(long j, i5a0 i5a0Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = i5a0Var;
        this.b = j;
        k5a0 k5a0Var = n5a0.a;
        if (j != 0) {
            i5a0 i5a0VarD = d();
            long j2 = i5a0VarD.c;
            long[] jArr = i5a0VarD.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = i5a0VarD.b;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = i5a0VarD.a;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (n5a0.c) {
                iA = n5a0.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(c5a0 c5a0Var) {
        n5a0.b.b(c5a0Var);
    }

    public final void a() {
        synchronized (n5a0.c) {
            b();
            p();
            Unit unit = Unit.a;
        }
    }

    public void b() {
        n5a0.d = n5a0.d.c(g());
    }

    public void c() {
        this.c = true;
        synchronized (n5a0.c) {
            o();
            Unit unit = Unit.a;
        }
    }

    public i5a0 d() {
        return this.a;
    }

    public abstract Function1<Object, Unit> e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract Function1<Object, Unit> i();

    public final c5a0 j() {
        t6a0<c5a0> t6a0Var = n5a0.b;
        c5a0 c5a0VarA = t6a0Var.a();
        t6a0Var.b(this);
        return c5a0VarA;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(nxd0 nxd0Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            n5a0.s(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(i5a0 i5a0Var) {
        this.a = i5a0Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract c5a0 u(Function1<Object, Unit> function1);
}
