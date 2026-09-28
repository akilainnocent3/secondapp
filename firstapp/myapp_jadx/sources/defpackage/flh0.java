package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.domain.UpdateUserTierUnlockedUseCase", f = "UpdateUserTierUnlockedUseCase.kt", l = {41, 46}, m = "invoke", v = 2)
public final class flh0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ glh0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flh0(glh0 glh0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = glh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
