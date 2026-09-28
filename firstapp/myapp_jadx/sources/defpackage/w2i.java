package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class w2i<T> extends r2i<T> {
    public final taj.i b;

    public w2i(taj.i iVar) {
        this.b = iVar;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        try {
            th = this.b.a;
        } catch (Throwable th) {
            th = th;
            qtg.a(th);
        }
        zde0Var.a(y3g.a);
        zde0Var.onError(th);
    }
}
