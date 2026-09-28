package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.signup.domain.EmailValidator", f = "EmailValidator.kt", l = {18}, m = "validate", v = 2)
public final class m0g extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ n0g b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0g(n0g n0gVar, x1b x1bVar) {
        super(x1bVar);
        this.b = n0gVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
