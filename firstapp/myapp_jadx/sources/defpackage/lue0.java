package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.bethistory.TGBetHistoryViewModel", f = "TGBetHistoryViewModel.kt", l = {92}, m = "updateNotEmpty", v = 1)
public final class lue0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ iue0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lue0(iue0 iue0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = iue0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.y1(null, null, this);
    }
}
