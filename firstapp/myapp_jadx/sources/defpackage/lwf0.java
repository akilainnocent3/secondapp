package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.manager.TimeLimitsManagerImpl", f = "TimeLimitsManagerImpl.kt", l = {63, 65, 65}, m = "refreshTimeLimits", v = 2)
public final class lwf0 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kwf0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwf0(kwf0 kwf0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = kwf0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(this);
    }
}
