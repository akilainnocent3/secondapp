package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {98, 99}, m = "updateSettings")
public final class gh80 extends x1b {
    public hh80 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hh80 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh80(hh80 hh80Var, x1b x1bVar) {
        super(x1bVar);
        this.c = hh80Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
