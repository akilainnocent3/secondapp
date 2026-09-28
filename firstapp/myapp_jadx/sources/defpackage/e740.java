package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel", f = "RealBetHistoryViewModel.kt", l = {523, 524, 533, 543}, m = "checkWhetherUserAgreeToDiscardBulkDeleteSelections", v = 2)
public final class e740 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d740 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e740(d740 d740Var, x1b x1bVar) {
        super(x1bVar);
        this.c = d740Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.y1(this);
    }
}
