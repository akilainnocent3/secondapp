package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.domain.AppUpdateCoordinator", f = "AppUpdateCoordinator.kt", l = {111}, m = "handleVersionCheckResult", v = 2)
public final class zt0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ cu0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt0(cu0 cu0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = cu0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
