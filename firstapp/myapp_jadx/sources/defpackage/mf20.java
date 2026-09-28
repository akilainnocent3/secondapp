package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class mf20 extends fte<bi50<Void>> {
    public final /* synthetic */ of20 a;

    public mf20(of20 of20Var) {
        this.a = of20Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.O.j(null);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        bi50<Void> bi50Var = (bi50) obj;
        bi50Var.getClass();
        boolean isSuccessful = bi50Var.a.getIsSuccessful();
        of20 of20Var = this.a;
        if (isSuccessful) {
            of20Var.O.j(bi50Var);
        } else {
            of20Var.O.j(null);
        }
    }
}
