package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.facade.MeScreenAccountFacade", f = "MeScreenAccountFacade.kt", l = {86}, m = "refreshKycHintState", v = 2)
public final class lev extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ nev b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lev(nev nevVar, x1b x1bVar) {
        super(x1bVar);
        this.b = nevVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
