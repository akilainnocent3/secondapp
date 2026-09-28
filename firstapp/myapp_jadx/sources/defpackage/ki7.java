package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.domain.usecase.CheckCodeSelectionsLiabilityUseCase", f = "CheckCodeSelectionsLiabilityUseCase.kt", l = {15}, m = "invoke", v = 2)
public final class ki7 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ li7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki7(li7 li7Var, x1b x1bVar) {
        super(x1bVar);
        this.b = li7Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
