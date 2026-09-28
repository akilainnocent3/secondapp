package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class jf20 extends fte<bi50<Void>> {
    public final /* synthetic */ of20 a;

    public jf20(of20 of20Var) {
        this.a = of20Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.M.j(null);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        bi50<Void> bi50Var = (bi50) obj;
        bi50Var.getClass();
        this.a.M.j(bi50Var);
    }
}
