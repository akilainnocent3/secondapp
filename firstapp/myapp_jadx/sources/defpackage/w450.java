package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.remixbet.domain.usecase.RemixBetTutorialUseCase", f = "RemixBetTutorialUseCase.kt", l = {10}, m = "hasDismissed", v = 2)
public final class w450 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ x450 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w450(x450 x450Var, x1b x1bVar) {
        super(x1bVar);
        this.b = x450Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
