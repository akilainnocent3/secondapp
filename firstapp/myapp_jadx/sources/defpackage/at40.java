package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.registration.usecase.RegisterAccountUseCase", f = "RegisterAccountUseCase.kt", l = {135}, m = "register", v = 2)
public final class at40 extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ct40 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at40(ct40 ct40Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ct40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
