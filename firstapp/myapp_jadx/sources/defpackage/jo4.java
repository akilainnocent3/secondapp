package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.data.repository.BonusCupRepository", f = "BonusCupRepository.kt", l = {38}, m = "validateUser", v = 1)
public final class jo4 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ lo4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo4(lo4 lo4Var, x1b x1bVar) {
        super(x1bVar);
        this.b = lo4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
