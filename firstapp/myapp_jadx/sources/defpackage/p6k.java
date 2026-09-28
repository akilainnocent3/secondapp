package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.result.GetGameOverDataUseCase", f = "GetGameOverDataUseCase.kt", l = {16, 17}, m = "invoke", v = 1)
public final class p6k extends x1b {
    public hu00 a;
    public bnj b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q6k d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6k(q6k q6kVar, x1b x1bVar) {
        super(x1bVar);
        this.d = q6kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
