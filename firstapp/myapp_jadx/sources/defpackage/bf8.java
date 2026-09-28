package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bf8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bf8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String channelShowName;
        String channelShowName2;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                df8 df8Var = (df8) obj3;
                ssw<vhg<t6e>> sswVar = df8Var.F;
                ssw<Boolean> sswVar2 = df8Var.N;
                p6e p6eVar = (p6e) obj2;
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                    BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
                    ssw<String> sswVar3 = df8Var.K;
                    c0e c0eVar = df8Var.w;
                    sswVar2.m(Boolean.FALSE);
                    BankTradeResponse bankTradeResponse = (BankTradeResponse) baseResponse.data;
                    if (bankTradeResponse != null) {
                        if (c0eVar.a()) {
                            ku90<pdd0> ku90Var = df8Var.T;
                            BigDecimal payAmount = p6eVar.getPayAmount();
                            String str = bankTradeResponse.tradeId;
                            String str2 = str == null ? "" : str;
                            int i2 = bankTradeResponse.status;
                            if (i2 == 0) {
                                i2 = baseResponse.bizCode;
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis() - c0eVar.a;
                            c0eVar.a = 0L;
                            ku90Var.a(new qnd(null, str2, payAmount, Integer.valueOf(i2), Long.valueOf(jCurrentTimeMillis), null, null, null, 16267));
                        }
                        int i3 = baseResponse.bizCode;
                        if (i3 == 10) {
                            String str3 = baseResponse.message;
                            sswVar.m(new vhg<>(new t6e.d(str3 != null ? str3 : "")));
                        } else if (i3 == 30) {
                            String str4 = baseResponse.message;
                            sswVar.m(new vhg<>(new t6e.b(str4 != null ? str4 : "")));
                        } else if (i3 != 10000) {
                            String str5 = baseResponse.message;
                            if (i3 == 62100) {
                                sswVar.m(new vhg<>(new t6e.g(str5 != null ? str5 : "")));
                            } else if (i3 != 65001) {
                                sswVar.m(new vhg<>(new t6e.h(str5 != null ? str5 : "")));
                            } else {
                                sswVar.m(new vhg<>(new t6e.a(str5 != null ? str5 : "")));
                            }
                        } else {
                            int i4 = cf8.a.a[df8Var.f.getCountryCode().ordinal()];
                            String str6 = bankTradeResponse.tradeId;
                            if (i4 == 1) {
                                str6.getClass();
                                PaymentChannel paymentChannel = df8Var.C;
                                if (paymentChannel == null || (channelShowName2 = paymentChannel.getChannelShowName()) == null) {
                                    channelShowName2 = "";
                                }
                                PaymentChannel paymentChannel2 = df8Var.C;
                                o77 o77Var = new o77(channelShowName2, paymentChannel2 != null ? paymentChannel2.getChannelIconResId() : 0, "");
                                String strD = sswVar3.d();
                                sswVar.m(new vhg<>(new t6e.f(str6, o77Var, strD != null ? strD : "")));
                            } else {
                                str6.getClass();
                                PaymentChannel paymentChannel3 = df8Var.C;
                                if (paymentChannel3 == null || (channelShowName = paymentChannel3.getChannelShowName()) == null) {
                                    channelShowName = "";
                                }
                                PaymentChannel paymentChannel4 = df8Var.C;
                                o77 o77Var2 = new o77(channelShowName, paymentChannel4 != null ? paymentChannel4.getChannelIconResId() : 0, "");
                                String strD2 = sswVar3.d();
                                sswVar.m(new vhg<>(new t6e.e(str6, o77Var2, strD2 != null ? strD2 : "")));
                            }
                        }
                    }
                } else if (lk50Var instanceof lk50.a) {
                    sswVar2.m(Boolean.FALSE);
                    sswVar.m(new vhg<>(t6e.i.b));
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    sswVar2.m(Boolean.TRUE);
                }
                return Unit.a;
            default:
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                ((j2c) obj3).b.b(vp60Var, (ArrayList) obj2);
                return Unit.a;
        }
    }
}
