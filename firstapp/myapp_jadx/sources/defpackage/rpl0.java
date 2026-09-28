package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class rpl0 extends dal0 {
    public final /* synthetic */ brl0 b;

    public rpl0(brl0 brl0Var) {
        this.b = brl0Var;
    }

    @Override // defpackage.dal0
    public final void a() {
        esl0 esl0Var = this.b.a;
        esl0Var.b.a("unlinkToDeath", new Object[0]);
        esl0Var.m.asBinder().unlinkToDeath(esl0Var.j, 0);
        esl0Var.m = null;
        esl0Var.g = false;
    }
}
