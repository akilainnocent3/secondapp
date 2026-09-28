package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.delegates.alert.BaseAlertDelegate", f = "BaseAlertDelegate.kt", l = {50, 49}, m = "refreshAllAlerts", v = 2)
public final class zy1 extends x1b {
    public ztw a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yy1<Object> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy1(yy1 yy1Var, x1b x1bVar) {
        super(x1bVar);
        this.c = yy1Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, null, this);
    }
}
