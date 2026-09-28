package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.manager.MaintenanceTimerManagerImpl", f = "MaintenanceTimerManager.kt", l = {144}, m = "maintenanceDialogCheck", v = 2)
public final class qlu extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ tlu b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlu(tlu tluVar, x1b x1bVar) {
        super(x1bVar);
        this.b = tluVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
