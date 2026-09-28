package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.validation.domain.BrazilianMobilePhoneNumberValidator", f = "BrazilianMobilePhoneNumberValidator.kt", l = {19}, m = "validate", v = 2)
public final class q95 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ r95 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q95(r95 r95Var, x1b x1bVar) {
        super(x1bVar);
        this.b = r95Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
