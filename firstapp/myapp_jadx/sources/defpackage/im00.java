package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.personalinfo.presentation.PersonalInfoViewModel", f = "PersonalInfoViewModel.kt", l = {109}, m = "fetchPostalCodeData", v = 2)
public final class im00 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ pm00 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im00(pm00 pm00Var, x1b x1bVar) {
        super(x1bVar);
        this.b = pm00Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.z1(null, this);
    }
}
