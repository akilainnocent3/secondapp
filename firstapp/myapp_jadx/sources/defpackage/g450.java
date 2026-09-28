package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.domain.usecase.RemixBetRedDotUseCase", f = "RemixBetRedDotUseCase.kt", l = {10}, m = "hasDismissed", v = 2)
public final class g450 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ h450 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g450(h450 h450Var, x1b x1bVar) {
        super(x1bVar);
        this.b = h450Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
