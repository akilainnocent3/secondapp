package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.database.CMSCacheIO", f = "CMSCacheIO.kt", l = {58}, m = "insertCMSValues-gIAlu-s", v = 2)
public final class hn5 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ in5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn5(in5 in5Var, x1b x1bVar) {
        super(x1bVar);
        this.b = in5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objG = this.b.g(null, this);
        return objG == y5b.a ? objG : new zi50(objG);
    }
}
