package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider", f = "MeScreenRowsProvider.kt", l = {382}, m = "fetchSportyRecap", v = 2)
public final class vfv extends x1b {
    public wwd0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qfv c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfv(qfv qfvVar, x1b x1bVar) {
        super(x1bVar);
        this.c = qfvVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
