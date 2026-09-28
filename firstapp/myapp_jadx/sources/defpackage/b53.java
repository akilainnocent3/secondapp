package defpackage;

import com.sporty.android.core.model.gift.BonusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.service.BetSlipMarketingDomainService$validateBonusService$1", f = "BetSlipMarketingDomainService.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b53 extends tje0 implements Function2<lk50<? extends BonusResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ h53 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b53(h53 h53Var, v1b v1bVar, boolean z, boolean z2) {
        super(2, v1bVar);
        this.b = h53Var;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b53 b53Var = new b53(this.b, v1bVar, this.c, this.d);
        b53Var.a = obj;
        return b53Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BonusResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((b53) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        if (!z) {
            return Unit.a;
        }
        h53 h53Var = this.b;
        krm krmVar = h53Var.a;
        String json = h53Var.e.toJson(((lk50.c) lk50Var).a);
        json.getClass();
        krmVar.R(json);
        if (this.c || !this.d) {
            h53Var.f(z);
        } else {
            h53Var.c(z);
        }
        return Unit.a;
    }
}
