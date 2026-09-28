package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.integrity.GetIntegrityVerdictUseCase", f = "GetIntegrityVerdictUseCase.kt", l = {18}, m = "tryGettingIntegrityVerdict", v = 2)
public final class j7k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ g7k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7k(g7k g7kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = g7kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
