package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.joker.data.repository.JokerRepositoryImpl", f = "JokerRepositoryImpl.kt", l = {56}, m = "getJokerSelections", v = 2)
public final class nap extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ qap b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nap(qap qapVar, x1b x1bVar) {
        super(x1bVar);
        this.b = qapVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
