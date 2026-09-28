package defpackage;

import com.sporty.android.core.model.loyalty.MissionData;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.data.repository.WorldCupPassBannerStateProviderImpl", f = "WorldCupPassBannerStateProviderImpl.kt", l = {118, 125}, m = "refresh", v = 2)
public final class a2k0 extends x1b {
    public z1k0 a;
    public MissionData b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z1k0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2k0(z1k0 z1k0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = z1k0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
