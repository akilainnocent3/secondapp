package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wsl0 extends jjl0 {
    public final /* synthetic */ mtl0 b;

    public wsl0(mtl0 mtl0Var) {
        this.b = mtl0Var;
    }

    @Override // defpackage.jjl0
    public final void a() {
        vtl0 vtl0Var = this.b.a;
        vtl0Var.b.a("unlinkToDeath", new Object[0]);
        vtl0Var.m.asBinder().unlinkToDeath(vtl0Var.j, 0);
        vtl0Var.m = null;
        vtl0Var.g = false;
    }
}
