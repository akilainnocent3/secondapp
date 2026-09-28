package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.environment.EnvironmentManagerImpl", f = "EnvironmentManagerImpl.kt", l = {93}, m = "initialize", v = 2)
public final class gbg extends x1b {
    public fbg.a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fbg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbg(fbg fbgVar, x1b x1bVar) {
        super(x1bVar);
        this.c = fbgVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
