package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.domain.usecase.ShouldForceUpdateUseCase", f = "ShouldForceUpdateUseCase.kt", l = {40}, m = "invoke", v = 2)
public final class y890 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ z890 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y890(z890 z890Var, x1b x1bVar) {
        super(x1bVar);
        this.b = z890Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
