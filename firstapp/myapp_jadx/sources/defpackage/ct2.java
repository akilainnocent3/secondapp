package defpackage;

import java.util.List;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.data.repository.BetHistoryRepositoryImpl", f = "BetHistoryRepositoryImpl.kt", l = {91, 92, 99, HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "deleteRealBetHistoryOrders", v = 2)
public final class ct2 extends x1b {
    public Iterable a;
    public List b;
    public Object c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ht2 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct2(ht2 ht2Var, x1b x1bVar) {
        super(x1bVar);
        this.f = ht2Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.l(null, false, this);
    }
}
