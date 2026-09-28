package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyTierConfig;
import com.sporty.android.core.model.loyalty.UserTier;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.domain.loyalty.usecase.GetLoyaltyTierInfoUseCase$invoke$3", f = "GetLoyaltyTierInfoUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f8k extends tje0 implements gaj<LoyaltyTierConfig, UserTier, v1b<? super n0u>, Object> {
    public /* synthetic */ LoyaltyTierConfig a;
    public /* synthetic */ UserTier b;

    @Override // defpackage.gaj
    public final Object invoke(LoyaltyTierConfig loyaltyTierConfig, UserTier userTier, v1b<? super n0u> v1bVar) {
        f8k f8kVar = new f8k(3, v1bVar);
        f8kVar.a = loyaltyTierConfig;
        f8kVar.b = userTier;
        return f8kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        LoyaltyTierConfig loyaltyTierConfig = this.a;
        UserTier userTier = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new n0u(loyaltyTierConfig, userTier);
    }
}
