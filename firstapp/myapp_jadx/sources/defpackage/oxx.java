package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.NonFtdEngagementRefresher", f = "NonFtdEngagementRefresher.kt", l = {77, 67}, m = "startRefresh", v = 2)
public final class oxx extends x1b {
    public quw a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rxx c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxx(rxx rxxVar, x1b x1bVar) {
        super(x1bVar);
        this.c = rxxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
