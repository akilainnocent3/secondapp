package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bl8 implements Function1 {
    public final /* synthetic */ el8 a;
    public final /* synthetic */ tnj0 b;

    public /* synthetic */ bl8(el8 el8Var, tnj0 tnj0Var) {
        this.a = el8Var;
        this.b = tnj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        el8 el8Var = this.a;
        ssw<Boolean> sswVar = el8Var.B;
        ssw<vhg<unj0>> sswVar2 = el8Var.F;
        lk50 lk50Var = (lk50) obj;
        lk50Var.getClass();
        if (lk50Var instanceof lk50.c) {
            BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
            BankTradeResponse bankTradeResponse = (BankTradeResponse) baseResponse.data;
            if (bankTradeResponse != null) {
                ku90<pdd0> ku90Var = el8Var.H;
                ssw<String> sswVar3 = el8Var.i;
                BigDecimal payAmount = this.b.getPayAmount();
                String str2 = bankTradeResponse.tradeId;
                String str3 = str2 == null ? "" : str2;
                int i = bankTradeResponse.status;
                if (i == 0) {
                    i = baseResponse.bizCode;
                }
                ku90Var.a(new ygj0(str3, payAmount, Integer.valueOf(i), null, null, null, null, 971));
                if (!baseResponse.isSuccessful() || bankTradeResponse.status != 10 || (str = bankTradeResponse.tradeId) == null) {
                    sswVar.m(Boolean.FALSE);
                    int i2 = baseResponse.bizCode;
                    switch (i2) {
                        case 10000:
                            int i3 = bankTradeResponse.status;
                            if (i3 == 20) {
                                BigDecimal bigDecimal = el8Var.b;
                                if (bigDecimal == null) {
                                    Intrinsics.n("amount");
                                    throw null;
                                }
                                BigDecimal bigDecimalB = p54.b(bigDecimal);
                                String str4 = el8Var.c;
                                if (str4 == null) {
                                    Intrinsics.n("withdrawTo");
                                    throw null;
                                }
                                String strD = sswVar3.d();
                                strD.getClass();
                                String str5 = strD;
                                String str6 = bankTradeResponse.tradeId;
                                sswVar2.m(new vhg<>(new unj0.n(bigDecimalB, str4, str5, str6 == null ? "" : str6, 2)));
                            } else if (i3 == 71) {
                                BigDecimal bigDecimal2 = el8Var.b;
                                if (bigDecimal2 == null) {
                                    Intrinsics.n("amount");
                                    throw null;
                                }
                                BigDecimal bigDecimalB2 = p54.b(bigDecimal2);
                                String str7 = el8Var.c;
                                if (str7 == null) {
                                    Intrinsics.n("withdrawTo");
                                    throw null;
                                }
                                String strD2 = sswVar3.d();
                                strD2.getClass();
                                String str8 = strD2;
                                String str9 = bankTradeResponse.tradeId;
                                sswVar2.m(new vhg<>(new unj0.n(bigDecimalB2, str7, str8, str9 == null ? "" : str9, 3)));
                            } else if (i3 == 72) {
                                sswVar2.m(new vhg<>(unj0.c.b));
                            }
                            break;
                        case 61100:
                            String str10 = baseResponse.message;
                            if (str10 == null) {
                                str10 = "";
                            }
                            sswVar2.m(new vhg<>(new unj0.b(str10)));
                            break;
                        case 61300:
                            String str11 = baseResponse.message;
                            if (str11 == null) {
                                str11 = "";
                            }
                            sswVar2.m(new vhg<>(new unj0.a(str11)));
                            break;
                        case 62100:
                            String str12 = baseResponse.message;
                            if (str12 == null) {
                                str12 = "";
                            }
                            sswVar2.m(new vhg<>(new unj0.e(str12)));
                            break;
                        case 62200:
                            String str13 = baseResponse.message;
                            if (str13 == null) {
                                str13 = "";
                            }
                            sswVar2.m(new vhg<>(new unj0.d(str13)));
                            break;
                        case 66215:
                        case 66217:
                            String str14 = baseResponse.message;
                            if (str14 == null) {
                                str14 = "";
                            }
                            sswVar2.m(new vhg<>(i2 == 66217 ? new unj0.j(str14) : new unj0.k(str14)));
                            break;
                        default:
                            String str15 = baseResponse.message;
                            if (str15 == null) {
                                str15 = "";
                            }
                            sswVar2.m(new vhg<>(new unj0.f(str15)));
                            break;
                    }
                } else {
                    ej5.c(o8i0.d(el8Var), null, null, new dl8(el8Var, str, null), 3);
                }
            }
        } else if (lk50Var instanceof lk50.a) {
            el8Var.D.m(Boolean.TRUE);
            sswVar.m(Boolean.FALSE);
            sswVar2.m(new vhg<>(unj0.g.b));
        } else if (!(lk50Var instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
