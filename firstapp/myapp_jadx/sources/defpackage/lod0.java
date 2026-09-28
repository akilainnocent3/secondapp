package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.data.repository.StackerRepository", f = "StackerRepository.kt", l = {84}, m = "claimReward", v = 1)
public final class lod0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ xod0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lod0(xod0 xod0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = xod0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(0L, this);
    }
}
