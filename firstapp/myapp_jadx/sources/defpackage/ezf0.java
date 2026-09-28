package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.favoritemarkets.domain.ToggleFavoriteMarketUseCase", f = "ToggleFavoriteMarketUseCase.kt", l = {17, 19}, m = "invoke", v = 2)
public final class ezf0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fzf0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezf0(fzf0 fzf0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = fzf0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, 0, null, false, this);
    }
}
