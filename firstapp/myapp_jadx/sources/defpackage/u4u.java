package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u4u extends r4u<nlp, qg50<?>> {
    public n6g d;

    @Override // defpackage.r4u
    public final int b(qg50<?> qg50Var) {
        qg50<?> qg50Var2 = qg50Var;
        if (qg50Var2 == null) {
            return 1;
        }
        return qg50Var2.a();
    }

    @Override // defpackage.r4u
    public final void c(nlp nlpVar, qg50<?> qg50Var) {
        qg50<?> qg50Var2 = qg50Var;
        n6g n6gVar = this.d;
        if (n6gVar == null || qg50Var2 == null) {
            return;
        }
        n6gVar.e.a(qg50Var2, true);
    }
}
