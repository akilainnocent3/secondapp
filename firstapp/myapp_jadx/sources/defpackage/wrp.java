package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class wrp implements gv5<Object> {
    public final /* synthetic */ bc6 a;

    public wrp(bc6 bc6Var) {
        this.a = bc6Var;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<Object> su5Var, Throwable th) {
        th.getClass();
        zi50.a aVar = zi50.b;
        this.a.resumeWith(new zi50.b(th));
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<Object> su5Var, bi50<Object> bi50Var) {
        zi50.a aVar = zi50.b;
        this.a.resumeWith(bi50Var);
    }
}
