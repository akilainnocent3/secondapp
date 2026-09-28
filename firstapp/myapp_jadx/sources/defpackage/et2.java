package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.data.repository.BetHistoryRepositoryImpl", f = "BetHistoryRepositoryImpl.kt", l = {116, 117, 128, 134}, m = "undoLastDeletedRealBetHistoryOrders", v = 2)
public final class et2 extends x1b {
    public List a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ht2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et2(ht2 ht2Var, x1b x1bVar) {
        super(x1bVar);
        this.e = ht2Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.m(this);
    }
}
