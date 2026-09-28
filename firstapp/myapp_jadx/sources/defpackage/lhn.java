package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.domain.usecase.initialise.InitialiseBonusCupUseCase", f = "InitialiseBonusCupUseCase.kt", l = {76, 81}, m = "connectWebSocket", v = 1)
public final class lhn extends x1b {
    public long a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ohn d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhn(ohn ohnVar, x1b x1bVar) {
        super(x1bVar);
        this.d = ohnVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(0L, this, null);
    }
}
