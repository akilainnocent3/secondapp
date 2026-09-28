package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class iwp implements iaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iwp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        String channelShowName;
        String phone;
        int i = this.a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj5;
                mwp mwpVar = (mwp) obj2;
                a aVar = (a) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((pf0) obj).getClass();
                mwpVar.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= aVar.M(mwpVar) ? 32 : 16;
                }
                if (!aVar.q(iIntValue & 1, (iIntValue & 145) != 144)) {
                    aVar.G();
                } else if (mwpVar instanceof mwp.b) {
                    aVar.N(394243850);
                    kwp.g((mwp.b) mwpVar, function1, aVar, (iIntValue >> 3) & 14);
                    aVar.H();
                } else {
                    if (!(mwpVar instanceof mwp.a)) {
                        throw rg.a(566904835, aVar);
                    }
                    aVar.N(394394572);
                    kwp.f((mwp.a) mwpVar, function1, aVar, (iIntValue >> 3) & 14);
                    aVar.H();
                }
                return Unit.a;
            default:
                dnj0 dnj0Var = (dnj0) obj5;
                String str = (String) obj;
                m8h0 m8h0Var = (m8h0) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                m8h0Var.getClass();
                ku90<spg0> ku90Var = dnj0Var.v;
                log0 log0Var = log0.b;
                String strF = dnj0Var.n0.f();
                BigDecimal bigDecimal = dnj0Var.S.c;
                Object value = dnj0Var.f0.a.getValue();
                value.getClass();
                BigDecimal bigDecimal2 = (BigDecimal) value;
                wwd0 wwd0Var = dnj0Var.F0;
                ChannelAsset.Channel channel = (ChannelAsset.Channel) wwd0Var.getValue();
                if (channel == null || (channelShowName = channel.getChannelShowName()) == null) {
                    channelShowName = "--";
                }
                ChannelAsset.Channel channel2 = (ChannelAsset.Channel) wwd0Var.getValue();
                String channelIconUrl = channel2 != null ? channel2.getChannelIconUrl() : null;
                UserPhone userPhone = (UserPhone) dnj0Var.y0.a.getValue();
                if (userPhone == null || (phone = userPhone.getPhone()) == null) {
                    phone = "--";
                }
                vpg0.c(ku90Var, new TxSuccessParams.Momo(log0Var, m8h0Var, str, strF, bigDecimal, bigDecimal2, zBooleanValue, channelShowName, channelIconUrl, null, phone));
                b.b(dnj0Var.f);
                return Unit.a;
        }
    }
}
