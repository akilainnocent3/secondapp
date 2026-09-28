package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.data.manager.RecapDataManagerImpl", f = "RecapDataManagerImpl.kt", l = {60}, m = "fetchFromApi", v = 2)
public final class id40 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kd40 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id40(kd40 kd40Var, x1b x1bVar) {
        super(x1bVar);
        this.c = kd40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(0, this);
    }
}
