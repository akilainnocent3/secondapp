package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b350<T> implements qot {
    public final /* synthetic */ bc6 a;

    public b350(bc6 bc6Var) {
        this.a = bc6Var;
    }

    @Override // defpackage.qot
    public final void onResult(T t) {
        bc6 bc6Var = this.a;
        if (bc6Var.v()) {
            return;
        }
        zi50.a aVar = zi50.b;
        bc6Var.resumeWith(t);
    }
}
