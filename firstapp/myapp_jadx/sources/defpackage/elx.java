package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class elx extends c5a0 {
    public final Function1<Object, Unit> f;
    public final c5a0 g;

    public elx(long j, i5a0 i5a0Var, Function1<Object, Unit> function1, c5a0 c5a0Var) {
        super(j, i5a0Var);
        this.f = function1;
        this.g = c5a0Var;
        c5a0Var.k();
    }

    @Override // defpackage.c5a0
    public final void c() {
        if (this.c) {
            return;
        }
        long j = this.b;
        c5a0 c5a0Var = this.g;
        if (j != c5a0Var.g()) {
            a();
        }
        c5a0Var.l();
        super.c();
    }

    @Override // defpackage.c5a0
    public final Function1 e() {
        return this.f;
    }

    @Override // defpackage.c5a0
    public final boolean f() {
        return true;
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
    public final void n(nxd0 nxd0Var) {
        k5a0 k5a0Var = n5a0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.c5a0
    public final c5a0 u(Function1 function1) {
        return new elx(this.b, this.a, n5a0.h(function1, this.f, true), this.g);
    }

    @Override // defpackage.c5a0
    public final void m() {
    }
}
