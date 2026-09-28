package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.domain.usecase.initialise.InitialiseBonusCupUseCase", f = "InitialiseBonusCupUseCase.kt", l = {92, 93, 95}, m = "connectWebSocketAndStart", v = 1)
public final class mhn extends x1b {
    public long a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ohn d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhn(ohn ohnVar, x1b x1bVar) {
        super(x1bVar);
        this.d = ohnVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(0L, this, null);
    }
}
