package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.navigation.MeScreenNavigationCoordinator", f = "MeScreenNavigationCoordinator.kt", l = {104}, m = "handleLoyaltyClick", v = 2)
public final class jfv extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ lfv b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfv(lfv lfvVar, x1b x1bVar) {
        super(x1bVar);
        this.b = lfvVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
