package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.core.model.pocket.withdraw.partner.PartnerWithdrawRequest;
import com.sporty.android.core.model.pocket.withdraw.partner.PartnerWithdrawResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawPartnerViewModel$requestWithdraw$1", f = "WithdrawPartnerViewModel.kt", l = {245}, m = "invokeSuspend", v = 2)
public final class rnj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ snj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnj0(snj0 snj0Var, v1b<? super rnj0> v1bVar) {
        super(2, v1bVar);
        this.c = snj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rnj0 rnj0Var = new rnj0(this.c, v1bVar);
        rnj0Var.b = obj;
        return rnj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rnj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        String tradeId;
        snj0 snj0Var = this.c;
        ku90<onj0> ku90Var = snj0Var.p0;
        wwd0 wwd0Var = snj0Var.G;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                int i2 = snj0.z0;
                PartnerWithdrawRequest partnerWithdrawRequest = new PartnerWithdrawRequest(p54.c(snj0Var.S.c), (String) snj0Var.u0.getValue());
                wwd0Var.setValue(tzs.b.a);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = snj0Var.j0;
                this.b = null;
                this.a = 1;
                obj = sr10Var.Z(partnerWithdrawRequest, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = (PartnerWithdrawResponse) n52.b((BaseResponse) obj);
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        int i3 = snj0.z0;
        wwd0Var.setValue(tzs.a.a);
        lqj0.a(snj0Var.d0);
        vpg0.d(snj0Var.v);
        snj0Var.x1("");
        if (!(bVar instanceof zi50.b) && (tradeId = ((PartnerWithdrawResponse) bVar).getTradeId()) != null) {
            ku90Var.a(onj0.b.a);
            snj0Var.f.a(a.b.a);
            ku90Var.a(new onj0.a(tradeId));
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            b.e(snj0Var.f, null, null, ppf0.a(thA), null, null, null, null, 507);
        }
        return Unit.a;
    }
}
