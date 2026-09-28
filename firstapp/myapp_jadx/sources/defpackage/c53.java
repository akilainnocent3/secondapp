package defpackage;

import com.sporty.android.book.domain.entity.MarketingServiceType;
import com.sporty.android.core.model.gift.BonusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.service.BetSlipMarketingDomainService$validateBonusService$2", f = "BetSlipMarketingDomainService.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c53 extends tje0 implements Function2<lk50<? extends BonusResponse>, v1b<? super lyh<? extends isu>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ MarketingServiceType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c53(MarketingServiceType marketingServiceType, v1b<? super c53> v1bVar) {
        super(2, v1bVar);
        this.b = marketingServiceType;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        c53 c53Var = new c53(this.b, v1bVar);
        c53Var.a = obj;
        return c53Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BonusResponse> lk50Var, v1b<? super lyh<? extends isu>> v1bVar) {
        return ((c53) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        MarketingServiceType marketingServiceType = this.b;
        return new gzh(z ? new isu(marketingServiceType, jsu.b) : new isu(marketingServiceType, jsu.c));
    }
}
