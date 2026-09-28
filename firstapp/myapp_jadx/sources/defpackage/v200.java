package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.delegates.limits.PayLimitsBaseDelegate", f = "PayLimitsBaseDelegate.kt", l = {76}, m = "fetchLimitsData", v = 2)
public final class v200 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ x200 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v200(x200 x200Var, x1b x1bVar) {
        super(x1bVar);
        this.b = x200Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(false, this);
    }
}
