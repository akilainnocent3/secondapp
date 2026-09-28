package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyTierConfig;
import com.sporty.android.core.model.loyalty.UserTier;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyHomeUseCase$getData$3", f = "LoyaltyHomeUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qvt extends tje0 implements gaj<LoyaltyTierConfig, UserTier, v1b<? super ftt>, Object> {
    public /* synthetic */ LoyaltyTierConfig a;
    public /* synthetic */ UserTier b;

    @Override // defpackage.gaj
    public final Object invoke(LoyaltyTierConfig loyaltyTierConfig, UserTier userTier, v1b<? super ftt> v1bVar) {
        qvt qvtVar = new qvt(3, v1bVar);
        qvtVar.a = loyaltyTierConfig;
        qvtVar.b = userTier;
        return qvtVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        LoyaltyTierConfig loyaltyTierConfig = this.a;
        UserTier userTier = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new ftt(loyaltyTierConfig, userTier);
    }
}
