package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.bethistory.WDBetHistoryViewModel", f = "WDBetHistoryViewModel.kt", l = {90}, m = "updateSuccess", v = 1)
public final class lqi0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ iqi0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqi0(iqi0 iqi0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = iqi0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.y1(null, null, this);
    }
}
