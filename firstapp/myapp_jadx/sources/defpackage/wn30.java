package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl", f = "RCFetchInitDataUseCaseImpl.kt", l = {153}, m = "getOldCMSPagesFlow", v = 1)
public final class wn30 extends x1b {
    public String[] a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zn30 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn30(zn30 zn30Var, x1b x1bVar) {
        super(x1bVar);
        this.c = zn30Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
