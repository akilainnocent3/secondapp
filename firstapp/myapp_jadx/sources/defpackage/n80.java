package defpackage;

import android.graphics.Rect;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n80 extends x5s {
    public c9p b;
    public p6s c;
    public b390 d;

    @Override // defpackage.rk10
    public final void a() {
        t4s t4sVar = this.a;
        if (t4sVar == null) {
            return;
        }
        this.b = t4sVar.C ? ej5.c(t4sVar.d2(), null, a6b.d, new s4s(t4sVar, new m80(null, this, t4sVar, null), null), 1) : null;
    }

    @Override // defpackage.rk10
    public final void b() throws Throwable {
        c9p c9pVar = this.b;
        if (c9pVar != null) {
            c9pVar.cancel((CancellationException) null);
        }
        this.b = null;
        vtw<Unit> vtwVarK = k();
        if (vtwVarK != null) {
            ((b390) vtwVarK).h();
        }
    }

    @Override // defpackage.rk10
    public final void c(final ijf0 ijf0Var, final bcn bcnVar, final vff0 vff0Var, final uhi uhiVar) {
        Function1 function1 = new Function1() { // from class: j80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                p6s p6sVar = (p6s) obj;
                t4s t4sVar = this.a;
                p6sVar.h = ijf0Var;
                p6sVar.i = bcnVar;
                p6sVar.c = vff0Var;
                p6sVar.d = uhiVar;
                p6sVar.e = t4sVar != null ? t4sVar.E : null;
                p6sVar.f = t4sVar != null ? t4sVar.F : null;
                p6sVar.g = t4sVar != null ? (z6i0) zma.a(t4sVar, kna.s) : null;
                return Unit.a;
            }
        };
        t4s t4sVar = this.a;
        if (t4sVar == null) {
            return;
        }
        this.b = t4sVar.C ? ej5.c(t4sVar.d2(), null, a6b.d, new s4s(t4sVar, new m80(function1, this, t4sVar, null), null), 1) : null;
    }

    @Override // defpackage.rk10
    public final void d(ijf0 ijf0Var, ijf0 ijf0Var2) {
        p6s p6sVar = this.c;
        if (p6sVar != null) {
            boolean z = (ulf0.b(p6sVar.h.b, ijf0Var2.b) && Intrinsics.g(p6sVar.h.c, ijf0Var2.c)) ? false : true;
            p6sVar.h = ijf0Var2;
            int size = p6sVar.j.size();
            for (int i = 0; i < size; i++) {
                ik40 ik40Var = (ik40) ((WeakReference) p6sVar.j.get(i)).get();
                if (ik40Var != null) {
                    ik40Var.g = ijf0Var2;
                }
            }
            b5s b5sVar = p6sVar.m;
            synchronized (b5sVar.c) {
                b5sVar.j = null;
                b5sVar.l = null;
                b5sVar.k = null;
                b5sVar.m = null;
                b5sVar.n = null;
                Unit unit = Unit.a;
            }
            if (Intrinsics.g(ijf0Var, ijf0Var2)) {
                if (z) {
                    cmn cmnVar = p6sVar.b;
                    int iF = ulf0.f(ijf0Var2.b);
                    int iE = ulf0.e(ijf0Var2.b);
                    ulf0 ulf0Var = p6sVar.h.c;
                    int iF2 = ulf0Var != null ? ulf0.f(ulf0Var.a) : -1;
                    ulf0 ulf0Var2 = p6sVar.h.c;
                    cmnVar.b(iF, iE, iF2, ulf0Var2 != null ? ulf0.e(ulf0Var2.a) : -1);
                    return;
                }
                return;
            }
            if (ijf0Var != null && (!Intrinsics.g(ijf0Var.a.b, ijf0Var2.a.b) || (ulf0.b(ijf0Var.b, ijf0Var2.b) && !Intrinsics.g(ijf0Var.c, ijf0Var2.c)))) {
                cmn cmnVar2 = p6sVar.b;
                cmnVar2.a().restartInput(cmnVar2.a);
                return;
            }
            int size2 = p6sVar.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ik40 ik40Var2 = (ik40) ((WeakReference) p6sVar.j.get(i2)).get();
                if (ik40Var2 != null) {
                    ijf0 ijf0Var3 = p6sVar.h;
                    cmn cmnVar3 = p6sVar.b;
                    if (ik40Var2.k) {
                        ik40Var2.g = ijf0Var3;
                        if (ik40Var2.i) {
                            cmnVar3.a().updateExtractedText(cmnVar3.a, ik40Var2.h, flh.c(ijf0Var3));
                        }
                        ulf0 ulf0Var3 = ijf0Var3.c;
                        long j = ijf0Var3.b;
                        int iF3 = ulf0Var3 != null ? ulf0.f(ulf0Var3.a) : -1;
                        ulf0 ulf0Var4 = ijf0Var3.c;
                        cmnVar3.b(ulf0.f(j), ulf0.e(j), iF3, ulf0Var4 != null ? ulf0.e(ulf0Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.rk10
    public final void f(lk40 lk40Var) {
        Rect rect;
        p6s p6sVar = this.c;
        if (p6sVar != null) {
            p6sVar.l = new Rect(ycv.b(lk40Var.a), ycv.b(lk40Var.b), ycv.b(lk40Var.c), ycv.b(lk40Var.d));
            if (!p6sVar.j.isEmpty() || (rect = p6sVar.l) == null) {
                return;
            }
            p6sVar.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.rk10
    public final void h(ijf0 ijf0Var, mly mlyVar, ukf0 ukf0Var, wff0 wff0Var, lk40 lk40Var, lk40 lk40Var2) {
        p6s p6sVar = this.c;
        if (p6sVar != null) {
            b5s b5sVar = p6sVar.m;
            synchronized (b5sVar.c) {
                try {
                    b5sVar.j = ijf0Var;
                    b5sVar.l = mlyVar;
                    b5sVar.k = ukf0Var;
                    b5sVar.m = lk40Var;
                    b5sVar.n = lk40Var2;
                    if (b5sVar.e || b5sVar.d) {
                        b5sVar.a();
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.x5s
    public final void i() {
        vtw<Unit> vtwVarK = k();
        if (vtwVarK != null) {
            ((b390) vtwVarK).a(Unit.a);
        }
    }

    public final vtw<Unit> k() {
        b390 b390Var = this.d;
        if (b390Var != null) {
            return b390Var;
        }
        if (!zbe0.a) {
            return null;
        }
        b390 b390VarB = d390.b(1, 0, pb5.c, 2);
        this.d = b390VarB;
        return b390VarB;
    }
}
