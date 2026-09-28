package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsBetBuilderHandlerImpl", f = "SportyLegendsBetBuilderHandlerImpl.kt", l = {270}, m = "createBetBuilderOutcome", v = 2)
public final class jac0 extends x1b {
    public String a;
    public String b;
    public BetBuilderOutcome c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gac0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jac0(gac0 gac0Var, x1b x1bVar) {
        super(x1bVar);
        this.e = gac0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.p(null, null, null, null, this);
    }
}
