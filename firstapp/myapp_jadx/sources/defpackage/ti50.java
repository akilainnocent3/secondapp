package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.RestrictionViewModel", f = "RestrictionViewModel.kt", l = {108}, m = "checkAppHooking", v = 2)
public final class ti50 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ui50 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti50(ui50 ui50Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ui50Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.x1(this);
    }
}
