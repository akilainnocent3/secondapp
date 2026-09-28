package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.usecase.PinStatusUseCase", f = "PinStatusUseCase.kt", l = {17}, m = "invoke-gIAlu-s", v = 2)
public final class h010 extends x1b {
    public g010 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g010 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h010(g010 g010Var, x1b x1bVar) {
        super(x1bVar);
        this.c = g010Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objA = this.c.a(null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
