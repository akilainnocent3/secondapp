package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.joker.domain.usecase.JokerUseCase", f = "JokerUseCase.kt", l = {11}, m = "getJokerMarkets", v = 2)
public final class jbp extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ kbp b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbp(kbp kbpVar, x1b x1bVar) {
        super(x1bVar);
        this.b = kbpVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
