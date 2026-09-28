package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$requestWithdraw$1", f = "WithdrawMomoViewModel.kt", l = {431}, m = "invokeSuspend", v = 2)
public final class bnj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ dnj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnj0(v1b v1bVar, dnj0 dnj0Var) {
        super(2, v1bVar);
        this.b = dnj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bnj0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bnj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String channelSendName;
        dnj0 dnj0Var = this.b;
        wwd0 wwd0Var = dnj0Var.G;
        wwd0 wwd0Var2 = dnj0Var.F0;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            UserPhone userPhone = (UserPhone) dnj0Var.y0.a.getValue();
            String phone = userPhone != null ? userPhone.getPhone() : null;
            if (phone == null) {
                b.h(dnj0Var.f);
                return Unit.a;
            }
            ChannelAsset.Channel channel = (ChannelAsset.Channel) wwd0Var2.getValue();
            if (channel == null) {
                return Unit.a;
            }
            int payChId = channel.getPayChId();
            ChannelAsset.Channel channel2 = (ChannelAsset.Channel) wwd0Var2.getValue();
            if (channel2 == null || (channelSendName = channel2.getChannelSendName()) == null) {
                return Unit.a;
            }
            BigDecimal bigDecimalC = p54.c(dnj0Var.S.c);
            String strF = dnj0Var.n0.f();
            BigDecimal bigDecimal = (BigDecimal) dnj0Var.f0.a.getValue();
            WithdrawRequest withdrawRequest = new WithdrawRequest(0, bigDecimalC, payChId, phone, null, strF, bigDecimal != null ? p54.c(bigDecimal) : null, null, null, null, null, null, channelSendName, null, null, null, null, null, null, null, null, null, 4190096, null);
            wwd0Var.setValue(tzs.b.a);
            xqj0 xqj0Var = dnj0Var.k0;
            y300.b bVar = dnj0Var.q0;
            ku90<a> ku90Var = dnj0Var.f;
            ku90<spg0> ku90Var2 = dnj0Var.v;
            ku90<m480> ku90Var3 = dnj0Var.y;
            ku90<tng0> ku90Var4 = dnj0Var.A;
            ku90<kqj0> ku90Var5 = dnj0Var.d0;
            iwp iwpVar = dnj0Var.O0;
            ku90<pdd0> ku90Var6 = dnj0Var.K;
            this.a = 1;
            if (xqj0Var.a(bVar, withdrawRequest, ku90Var, ku90Var2, ku90Var3, ku90Var4, ku90Var5, iwpVar, ku90Var6, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wwd0Var.setValue(tzs.a.a);
        lqj0.a(dnj0Var.d0);
        vpg0.d(dnj0Var.v);
        dnj0Var.x1("");
        return Unit.a;
    }
}
