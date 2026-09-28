package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {75}, m = "intercept")
public final class u6g extends x1b {
    public h840 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ p6g c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6g(p6g p6gVar, x1b x1bVar) {
        super(x1bVar);
        this.c = p6gVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
