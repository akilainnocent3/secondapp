package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.google.firebase.sessions.settings.SettingsCacheImpl", f = "SettingsCache.kt", l = {98}, m = "updateConfigs")
public final class ij80 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ hj80 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij80(hj80 hj80Var, x1b x1bVar) {
        super(x1bVar);
        this.b = hj80Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
