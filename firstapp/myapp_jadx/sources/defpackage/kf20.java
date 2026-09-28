package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class kf20 extends fte<bi50<String>> {
    public final /* synthetic */ of20 a;

    public kf20(of20 of20Var) {
        this.a = of20Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.W.j(null);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        bi50<String> bi50Var = (bi50) obj;
        bi50Var.getClass();
        boolean isSuccessful = bi50Var.a.getIsSuccessful();
        of20 of20Var = this.a;
        if (isSuccessful) {
            of20Var.W.j(bi50Var);
        } else {
            of20Var.W.j(null);
        }
    }
}
