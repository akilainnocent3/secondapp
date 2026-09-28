package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.ChallengeRewardAnimationState", f = "WelcomeRewardScreen.kt", l = {344, 345, 346, 347, 355, 356, 357, 378}, m = "runSwapAnimation", v = 2)
public final class l27 extends x1b {
    public float a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ n27 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l27(n27 n27Var, x1b x1bVar) {
        super(x1bVar);
        this.d = n27Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(0.0f, 0, this);
    }
}
