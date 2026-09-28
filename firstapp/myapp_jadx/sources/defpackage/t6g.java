package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
public final class t6g extends x1b {
    public ap8 a;
    public nan b;
    public Object c;
    public u2z d;
    public rpg e;
    public uih f;
    public int i;
    public /* synthetic */ Object v;
    public final /* synthetic */ p6g w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6g(p6g p6gVar, x1b x1bVar) {
        super(x1bVar);
        this.w = p6gVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.d(null, null, null, null, null, this);
    }
}
