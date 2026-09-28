package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.domain.usecase.GetCurrencyToSymbolMapUseCase", f = "GetCurrencyToSymbolMapUseCase.kt", l = {28}, m = "invoke", v = 2)
public final class d5k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ e5k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5k(e5k e5kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = e5kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
