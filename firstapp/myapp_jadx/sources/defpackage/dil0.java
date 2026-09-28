package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class dil0 extends yqk0 {
    public final /* synthetic */ ikl0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dil0(ikl0 ikl0Var, zal0 zal0Var) {
        super(zal0Var);
        this.e = ikl0Var;
    }

    @Override // defpackage.yqk0
    public final void a() {
        ikl0 ikl0Var = this.e;
        ikl0Var.g();
        if (ikl0Var.x()) {
            y4l0 y4l0Var = ikl0Var.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.a("Inactivity, disconnecting from the service");
            ikl0Var.o();
        }
    }
}
