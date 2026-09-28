package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl", f = "NNDFetchUseCaseImpl.kt", l = {152}, m = "getOldCMSPagesFlow", v = 1)
public final class h9x extends x1b {
    public String[] a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f9x c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9x(f9x f9xVar, x1b x1bVar) {
        super(x1bVar);
        this.c = f9xVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
