package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.event.recommendcode.PreMatchRecommendedCodeViewModel", f = "PreMatchRecommendedCodeViewModel.kt", l = {404}, m = "refreshPreMatchDetailCodeListVariant", v = 2)
public final class qi20 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mi20 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi20(mi20 mi20Var, x1b x1bVar) {
        super(x1bVar);
        this.b = mi20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.C1(this);
    }
}
