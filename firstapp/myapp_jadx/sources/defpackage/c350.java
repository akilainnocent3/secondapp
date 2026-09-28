package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c350<T> implements qot {
    public final /* synthetic */ bc6 a;

    public c350(bc6 bc6Var) {
        this.a = bc6Var;
    }

    @Override // defpackage.qot
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        bc6 bc6Var = this.a;
        if (bc6Var.v()) {
            return;
        }
        zi50.a aVar = zi50.b;
        th.getClass();
        bc6Var.resumeWith(new zi50.b(th));
    }
}
