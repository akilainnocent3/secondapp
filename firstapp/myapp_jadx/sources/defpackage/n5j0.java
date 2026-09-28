package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel", f = "WelcomeRewardViewModel.kt", l = {203}, m = "resolveLuckyWheelDestination", v = 2)
public final class n5j0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ w4j0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5j0(w4j0 w4j0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = w4j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.B1(0, this);
    }
}
