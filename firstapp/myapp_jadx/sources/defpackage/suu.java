package defpackage;

import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventEntity;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.data.repository.MatchAlertRepositoryImpl", f = "MatchAlertRepositoryImpl.kt", l = {53, 54, 57, 71}, m = "switchNotificationEnabled", v = 2)
public final class suu extends x1b {
    public String a;
    public String b;
    public SubscribedEventEntity c;
    public Object d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ tuu i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suu(tuu tuuVar, x1b x1bVar) {
        super(x1bVar);
        this.i = tuuVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.a(null, false, this);
    }
}
