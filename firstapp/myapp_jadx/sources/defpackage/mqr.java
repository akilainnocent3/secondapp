package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.signup.presentation.LatamSignUpEmailViewModel", f = "LatamSignUpEmailViewModel.kt", l = {253, 259}, m = "handleCreateAccountForBR", v = 2)
public final class mqr extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ lqr b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqr(lqr lqrVar, x1b x1bVar) {
        super(x1bVar);
        this.b = lqrVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.C1(this);
    }
}
