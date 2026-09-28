package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.integrity.GenerateNonceUseCase", f = "GenerateNonceUseCase.kt", l = {22}, m = "tryToGenerateNonce", v = 2)
public final class f1k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ c1k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1k(c1k c1kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = c1kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
