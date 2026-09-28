package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class c9l0 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ual0 d;

    public c9l0(ual0 ual0Var, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ual0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        iol0 iol0Var = this.d.a;
        iol0Var.B();
        lqk0 lqk0Var = iol0Var.c;
        iol0.U(lqk0Var);
        return lqk0Var.g0(this.a, this.b, this.c);
    }
}
