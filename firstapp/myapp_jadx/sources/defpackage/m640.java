package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.data.paging.mediator.RealBetHistoryOrderPagingMediator", f = "RealBetHistoryOrderPagingMediator.kt", l = {79, 89, 97, 108}, m = "fetchRemote", v = 2)
public final class m640 extends x1b {
    public o640 a;
    public Boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ o640 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m640(o640 o640Var, x1b x1bVar) {
        super(x1bVar);
        this.i = o640Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.c(null, false, this);
    }
}
