package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.PendingRequestViewModel", f = "PendingRequestViewModel.kt", l = {74}, m = "refreshPushNotificationStatus", v = 2)
public final class fd00 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ hd00 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd00(hd00 hd00Var, x1b x1bVar) {
        super(x1bVar);
        this.b = hd00Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.x1(this);
    }
}
