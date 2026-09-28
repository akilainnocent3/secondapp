package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.account.latam.personalinfo.domain.BrazilianPostalCodeHelper", f = "BrazilianPostalCodeHelper.kt", l = {13}, m = "isValid", v = 2)
public final class t95 extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l6a0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t95(l6a0 l6a0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = l6a0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
