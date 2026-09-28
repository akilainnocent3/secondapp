package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hac0 implements gv5<Object> {
    public final /* synthetic */ bc6 a;

    public hac0(bc6 bc6Var) {
        this.a = bc6Var;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<Object> su5Var, Throwable th) {
        th.getClass();
        bc6 bc6Var = this.a;
        if (bc6Var.p() instanceof bzx) {
            bc6Var.cancel(th);
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<Object> su5Var, bi50<Object> bi50Var) {
        bc6 bc6Var = this.a;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(bi50Var);
        }
    }
}
