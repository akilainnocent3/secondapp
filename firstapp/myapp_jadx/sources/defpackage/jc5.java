package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.handler.BuildAndGoBetHistoryHandlerImpl", f = "BuildAndGoBetHistoryHandlerImpl.kt", l = {154}, m = "getTickets", v = 2)
public final class jc5 extends x1b {
    public vbo.a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mc5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc5(mc5 mc5Var, x1b x1bVar) {
        super(x1bVar);
        this.c = mc5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(null, null, null, this);
    }
}
