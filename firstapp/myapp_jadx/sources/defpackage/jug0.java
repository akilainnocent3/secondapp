package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jug0 extends wtw {
    public final wtw p;
    public final boolean q;
    public final boolean r;
    public Function1<Object, Unit> s;
    public Function1<Object, Unit> t;
    public final long u;

    /* JADX WARN: Illegal instructions before constructor call */
    public jug0(wtw wtwVar, Function1<Object, Unit> function1, Function1<Object, Unit> function2, boolean z, boolean z2) {
        Function1<Object, Unit> function1I;
        Function1<Object, Unit> function1E;
        k5a0 k5a0Var = n5a0.a;
        super(0L, i5a0.e, n5a0.h(function1, (wtwVar == null || (function1E = wtwVar.e()) == null) ? n5a0.j.f : function1E, z), n5a0.i(function2, (wtwVar == null || (function1I = wtwVar.i()) == null) ? n5a0.j.g : function1I));
        this.p = wtwVar;
        this.q = z;
        this.r = z2;
        this.s = this.f;
        this.t = this.g;
        this.u = ipf0.a();
    }

    @Override // defpackage.wtw
    public final void B(stw<nxd0> stwVar) {
        n6a0.a();
        throw null;
    }

    @Override // defpackage.wtw
    public final wtw C(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        Function1<Object, Unit> function1H = n5a0.h(function1, this.s, true);
        Function1<Object, Unit> function1I = n5a0.i(function2, this.t);
        return !this.q ? new jug0(D().C(null, function1I), function1H, function1I, false, true) : D().C(function1H, function1I);
    }

    public final wtw D() {
        wtw wtwVar = this.p;
        return wtwVar == null ? n5a0.j : wtwVar;
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final void c() {
        wtw wtwVar;
        this.c = true;
        if (!this.r || (wtwVar = this.p) == null) {
            return;
        }
        wtwVar.c();
    }

    @Override // defpackage.c5a0
    public final i5a0 d() {
        return D().d();
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final Function1 e() {
        return this.s;
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.c5a0
    public final long g() {
        return D().g();
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final int h() {
        return D().h();
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final Function1<Object, Unit> i() {
        return this.t;
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final void k() {
        n6a0.a();
        throw null;
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final void l() {
        n6a0.a();
        throw null;
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final void m() {
        D().m();
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final void n(nxd0 nxd0Var) {
        D().n(nxd0Var);
    }

    @Override // defpackage.c5a0
    public final void r(i5a0 i5a0Var) {
        n6a0.a();
        throw null;
    }

    @Override // defpackage.c5a0
    public final void s(long j) {
        n6a0.a();
        throw null;
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final c5a0 u(Function1<Object, Unit> function1) {
        Function1<Object, Unit> function1H = n5a0.h(function1, this.s, true);
        return !this.q ? n5a0.d(D().u(null), function1H, true) : D().u(function1H);
    }

    @Override // defpackage.wtw
    public final e5a0 w() {
        return D().w();
    }

    @Override // defpackage.wtw
    public final stw<nxd0> x() {
        return D().x();
    }

    @Override // defpackage.wtw
    /* JADX INFO: renamed from: y */
    public final Function1<Object, Unit> e() {
        return this.s;
    }
}
