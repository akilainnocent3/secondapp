package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.repo.AppUpdateRepoImpl", f = "AppUpdateRepoImpl.kt", l = {16}, m = "getVersionInfo", v = 2)
public final class ju0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ku0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju0(ku0 ku0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ku0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
