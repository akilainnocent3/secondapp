package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class sy1 extends cny {
    public final /* synthetic */ uy1<g6i0> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy1(uy1<g6i0> uy1Var) {
        super(true);
        this.d = uy1Var;
    }

    @Override // defpackage.cny
    public final void b() {
        uy1<g6i0> uy1Var = this.d;
        if (uy1Var.onBackPressedCompat()) {
            return;
        }
        f(false);
        uy1Var.getOnBackPressedDispatcher().d();
        f(true);
    }
}
