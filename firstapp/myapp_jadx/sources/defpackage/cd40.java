package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.data.manager.RecapConfigManagerImpl", f = "RecapConfigManagerImpl.kt", l = {33}, m = "fetchFromApi", v = 2)
public final class cd40 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fd40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd40(fd40 fd40Var, x1b x1bVar) {
        super(x1bVar);
        this.b = fd40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
