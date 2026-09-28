package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.domain.usecase.FormatCurrencyAmountUseCase", f = "FormatCurrencyAmountUseCase.kt", l = {109, 115}, m = "formatAsDisplay", v = 2)
public final class vti extends x1b {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uti d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vti(uti utiVar, x1b x1bVar) {
        super(x1bVar);
        this.d = utiVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, false, this);
    }
}
