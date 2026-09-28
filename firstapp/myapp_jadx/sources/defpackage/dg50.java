package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.domain.usecase.ResolveCurrencyLabelUseCase", f = "ResolveCurrencyLabelUseCase.kt", l = {13}, m = "invoke", v = 2)
public final class dg50 extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eg50 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg50(eg50 eg50Var, x1b x1bVar) {
        super(x1bVar);
        this.c = eg50Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
