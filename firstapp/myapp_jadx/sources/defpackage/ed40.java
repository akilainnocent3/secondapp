package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.data.manager.RecapConfigManagerImpl", f = "RecapConfigManagerImpl.kt", l = {43}, m = "withBadgeStatus", v = 2)
public final class ed40 extends x1b {
    public ad40 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fd40 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed40(fd40 fd40Var, x1b x1bVar) {
        super(x1bVar);
        this.c = fd40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
