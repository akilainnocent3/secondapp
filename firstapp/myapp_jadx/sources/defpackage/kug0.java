package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kug0 extends c5a0 {
    public final c5a0 f;
    public final boolean g;
    public final boolean h;
    public Function1<Object, Unit> i;
    public final long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kug0(c5a0 c5a0Var, Function1<Object, Unit> function1, boolean z, boolean z2) {
        Function1<Object, Unit> function1E;
        super(0L, i5a0.e);
        k5a0 k5a0Var = n5a0.a;
        this.f = c5a0Var;
        this.g = z;
        this.h = z2;
        this.i = n5a0.h(function1, (c5a0Var == null || (function1E = c5a0Var.e()) == null) ? n5a0.j.f : function1E, z);
        this.j = ipf0.a();
    }

    @Override // defpackage.c5a0
    public final void c() {
        c5a0 c5a0Var;
        this.c = true;
        if (!this.h || (c5a0Var = this.f) == null) {
            return;
        }
        c5a0Var.c();
    }

    @Override // defpackage.c5a0
    public final i5a0 d() {
        return v().d();
    }

    @Override // defpackage.c5a0
    public final Function1 e() {
        return this.i;
    }

    @Override // defpackage.c5a0
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.c5a0
    public final long g() {
        return v().g();
    }

    @Override // defpackage.c5a0
    public final Function1<Object, Unit> i() {
        return null;
    }

    @Override // defpackage.c5a0
    public final void k() {
        n6a0.a();
        throw null;
    }

    @Override // defpackage.c5a0
    public final void l() {
        n6a0.a();
        throw null;
    }

    @Override // defpackage.c5a0
    public final void m() {
        v().m();
    }

    @Override // defpackage.c5a0
    public final void n(nxd0 nxd0Var) {
        v().n(nxd0Var);
    }

    @Override // defpackage.c5a0
    public final c5a0 u(Function1<Object, Unit> function1) {
        Function1<Object, Unit> function1H = n5a0.h(function1, this.i, true);
        return !this.g ? n5a0.d(v().u(null), function1H, true) : v().u(function1H);
    }

    public final c5a0 v() {
        c5a0 c5a0Var = this.f;
        return c5a0Var == null ? n5a0.j : c5a0Var;
    }
}
