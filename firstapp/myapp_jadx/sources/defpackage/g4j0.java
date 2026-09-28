package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.plugin.sportystories.data.WelcomeRewardStoryProvider", f = "WelcomeRewardStoryProvider.kt", l = {92}, m = "checkShouldShowByAnTest", v = 2)
public final class g4j0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ f4j0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4j0(f4j0 f4j0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = f4j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
