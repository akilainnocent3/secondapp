package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ax4 implements Callable {
    public final /* synthetic */ vr4 a;
    public final /* synthetic */ dx4 b;

    public /* synthetic */ ax4(vr4 vr4Var, dx4 dx4Var) {
        this.a = vr4Var;
        this.b = dx4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z = this.a.f;
        dx4 dx4Var = this.b;
        if (z) {
            azs azsVar = azs.a;
            dx4Var.c(new lqc(0));
        } else {
            dx4Var.c(new lqc());
        }
        return Boolean.TRUE;
    }
}
