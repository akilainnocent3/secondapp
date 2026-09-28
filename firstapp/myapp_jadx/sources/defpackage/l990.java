package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.usecase.ShowAcceptOddsChangeLogicUseCase", f = "ShowAcceptOddsChangeLogicUseCase.kt", l = {12}, m = "invoke", v = 2)
public final class l990 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ m990 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l990(m990 m990Var, x1b x1bVar) {
        super(x1bVar);
        this.b = m990Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
