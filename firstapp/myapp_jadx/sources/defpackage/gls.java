package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.notifications.LiveEventNotificationRepoImpl", f = "LiveEventNotificationRepoImpl.kt", l = {21}, m = "updateLiveEventNotificationPreference", v = 2)
public final class gls extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ hls b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gls(hls hlsVar, x1b x1bVar) {
        super(x1bVar);
        this.b = hlsVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, false, this);
    }
}
