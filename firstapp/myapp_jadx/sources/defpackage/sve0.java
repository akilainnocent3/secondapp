package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase", f = "TGInitDataFlowUseCase.kt", l = {166}, m = "getOldCMSPagesFlow", v = 1)
public final class sve0 extends x1b {
    public String[] a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zve0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sve0(zve0 zve0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = zve0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
