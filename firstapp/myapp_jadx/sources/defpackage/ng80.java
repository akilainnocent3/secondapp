package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {98, 104}, m = "shouldLogSession")
public final class ng80 extends x1b {
    public mg80 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mg80 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng80(mg80 mg80Var, x1b x1bVar) {
        super(x1bVar);
        this.c = mg80Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        int i = mg80.g;
        return this.c.b(this);
    }
}
