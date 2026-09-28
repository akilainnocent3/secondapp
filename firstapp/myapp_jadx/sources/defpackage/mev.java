package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.facade.MeScreenAccountFacade", f = "MeScreenAccountFacade.kt", l = {94}, m = "updateTwoFAHintStatus", v = 2)
public final class mev extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ nev b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mev(nev nevVar, x1b x1bVar) {
        super(x1bVar);
        this.b = nevVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
