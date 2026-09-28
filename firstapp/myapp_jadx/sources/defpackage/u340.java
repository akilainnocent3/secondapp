package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u340 extends c5a0 {
    public final Function1<Object, Unit> f;
    public int g;

    public u340(long j, i5a0 i5a0Var, Function1<Object, Unit> function1) {
        super(j, i5a0Var);
        this.f = function1;
        this.g = 1;
    }

    @Override // defpackage.c5a0
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.g++;
    }

    @Override // defpackage.c5a0
    public final void l() {
        int i = this.g - 1;
        this.g = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.c5a0
    public final void n(nxd0 nxd0Var) {
        k5a0 k5a0Var = n5a0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.c5a0
    public final c5a0 u(Function1<Object, Unit> function1) {
        n5a0.u(this);
        return new elx(this.b, this.a, n5a0.h(function1, this.f, true), this);
    }

    @Override // defpackage.c5a0
    public final void m() {
    }
}
