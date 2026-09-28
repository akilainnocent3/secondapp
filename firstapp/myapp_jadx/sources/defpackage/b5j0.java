package defpackage;

import com.sporty.android.core.model.welcomereward.WelcomeRewardTimingConfig;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel", f = "WelcomeRewardViewModel.kt", l = {615}, m = "getWelcomeRewardConfig", v = 2)
public final class b5j0 extends x1b {
    public WelcomeRewardTimingConfig a;
    public w4j0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w4j0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5j0(w4j0 w4j0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = w4j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.x1(this);
    }
}
