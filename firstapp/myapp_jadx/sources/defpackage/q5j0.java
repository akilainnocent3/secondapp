package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel", f = "WelcomeRewardViewModel.kt", l = {615, 388}, m = "updateCacheRecord", v = 2)
public final class q5j0 extends x1b {
    public wm20 a;
    public String b;
    public Function1 c;
    public o2g d;
    public w4j0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ w4j0 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5j0(w4j0 w4j0Var, x1b x1bVar) {
        super(x1bVar);
        this.i = w4j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.C1(null, null, null, this);
    }
}
