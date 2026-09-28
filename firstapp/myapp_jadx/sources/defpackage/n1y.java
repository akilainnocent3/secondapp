package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.push.NotificationConfig", f = "NotificationConfig.kt", l = {49}, m = "updateNotificationStatus", v = 2)
public final class n1y extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ l1y b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1y(l1y l1yVar, x1b x1bVar) {
        super(x1bVar);
        this.b = l1yVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, false, this);
    }
}
