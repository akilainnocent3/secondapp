package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.data.repository.MatchAlertRepositoryImpl", f = "MatchAlertRepositoryImpl.kt", l = {86}, m = "getMatchNotificationAvailable", v = 2)
public final class ouu extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ tuu b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouu(tuu tuuVar, x1b x1bVar) {
        super(x1bVar);
        this.b = tuuVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
