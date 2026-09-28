package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class sgl0 implements Runnable {
    public final /* synthetic */ igl0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ khl0 c;

    public sgl0(khl0 khl0Var, igl0 igl0Var, long j) {
        this.a = igl0Var;
        this.b = j;
        Objects.requireNonNull(khl0Var);
        this.c = khl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.b;
        khl0 khl0Var = this.c;
        khl0Var.k(this.a, false, j);
        khl0Var.e = null;
        ikl0 ikl0VarO = khl0Var.a.o();
        ikl0VarO.g();
        ikl0VarO.h();
        ikl0VarO.u(new fil0(ikl0VarO, null));
    }
}
