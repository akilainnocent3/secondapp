package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.domain.usecase.ShouldShowGiftIntroUseCase", f = "ShouldShowGiftIntroUseCase.kt", l = {53, 55, 57, 58, 67}, m = "checkGateA", v = 2)
public final class c990 extends x1b {
    public String a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e990 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c990(e990 e990Var, x1b x1bVar) {
        super(x1bVar);
        this.d = e990Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
