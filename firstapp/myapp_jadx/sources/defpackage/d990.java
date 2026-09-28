package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.domain.usecase.ShouldShowGiftIntroUseCase", f = "ShouldShowGiftIntroUseCase.kt", l = {30, 33, 40}, m = "invoke", v = 2)
public final class d990 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e990 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d990(e990 e990Var, x1b x1bVar) {
        super(x1bVar);
        this.c = e990Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
