package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel", f = "WelcomeRewardViewModel.kt", l = {615, 262, 273, 281}, m = "handleRewardPageView", v = 2)
public final class j5j0 extends x1b {
    public String a;
    public List b;
    public xr50 c;
    public Object d;
    public w4j0 e;
    public long f;
    public long i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ w4j0 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5j0(w4j0 w4j0Var, x1b x1bVar) {
        super(x1bVar);
        this.y = w4j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.A1(null, 0L, null, this);
    }
}
