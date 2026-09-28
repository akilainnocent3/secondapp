package defpackage;

import com.sporty.android.core.model.welcomereward.Reward;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.mapper.WelcomeRewardUiStateMapper", f = "WelcomeRewardUiStateMapper.kt", l = {222}, m = "getLuckyWheelDaysLeft", v = 2)
public final class o4j0 extends x1b {
    public Reward a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n4j0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4j0(n4j0 n4j0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = n4j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
