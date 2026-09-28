package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl", f = "RealSportsRepoImpl.kt", l = {270}, m = "getMultiMakerSports", v = 2)
public final class v940 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ l940 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v940(l940 l940Var, x1b x1bVar) {
        super(x1bVar);
        this.b = l940Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.B(this);
    }
}
