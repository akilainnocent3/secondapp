package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutConfigManagerImpl", f = "CashoutConfigManagerImpl.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "fetchBOConfigs", v = 2)
public final class bp6 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ep6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp6(ep6 ep6Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ep6Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.k(this);
    }
}
