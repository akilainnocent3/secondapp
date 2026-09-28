package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b00 implements aa5 {
    public final /* synthetic */ e00 a;

    @Override // defpackage.aa5
    public final void a(w95 w95Var) {
        e00 e00Var = this.a;
        synchronized (e00Var) {
            try {
                if (e00Var.b instanceof are) {
                    e00Var.c.add(w95Var);
                }
                e00Var.b.a(w95Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
