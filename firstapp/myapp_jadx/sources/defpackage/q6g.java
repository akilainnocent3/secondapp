package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {203}, m = "decode")
public final class q6g extends x1b {
    public aqa0 a;
    public ap8 b;
    public nan c;
    public Object d;
    public u2z e;
    public rpg f;
    public a5d i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ p6g y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6g(p6g p6gVar, x1b x1bVar) {
        super(x1bVar);
        this.y = p6gVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.b(null, null, null, null, null, null, this);
    }
}
