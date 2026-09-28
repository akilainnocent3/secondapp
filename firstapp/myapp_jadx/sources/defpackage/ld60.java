package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl", f = "SBFetchDataUseCaseImpl.kt", l = {181}, m = "getOldCMSPagesFlow", v = 1)
public final class ld60 extends x1b {
    public String[] a;
    public /* synthetic */ Object b;
    public final /* synthetic */ od60 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld60(od60 od60Var, x1b x1bVar) {
        super(x1bVar);
        this.c = od60Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
