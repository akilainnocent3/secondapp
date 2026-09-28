package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.event.recommendcode.PreMatchRecommendedCodeViewModel", f = "PreMatchRecommendedCodeViewModel.kt", l = {173}, m = "loadRecommendedCodes", v = 2)
public final class pi20 extends x1b {
    public String a;
    public String b;
    public String c;
    public int d;
    public boolean e;
    public boolean f;
    public /* synthetic */ Object i;
    public final /* synthetic */ mi20 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi20(mi20 mi20Var, x1b x1bVar) {
        super(x1bVar);
        this.v = mi20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.A1(null, null, null, 0, false, false, this);
    }
}
