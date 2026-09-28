package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class m8l0 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ ual0 b;

    public m8l0(ual0 ual0Var, String str) {
        this.a = str;
        this.b = ual0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        iol0 iol0Var = this.b.a;
        iol0Var.B();
        lqk0 lqk0Var = iol0Var.c;
        iol0.U(lqk0Var);
        return lqk0Var.b0(this.a);
    }
}
