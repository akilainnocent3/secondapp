package defpackage;

import com.sportygames.vip.data.StakeSafeUsageCountResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class sx7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sx7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double giftAmount;
        Double giftAmount2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((yx7) obj2).b.invoke(bool);
                break;
            case 1:
                qub0 qub0Var = (qub0) obj2;
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    try {
                        StakeSafeUsageCountResponse stakeSafeUsageCountResponse = (StakeSafeUsageCountResponse) new eal().e(str, StakeSafeUsageCountResponse.class);
                        if (stakeSafeUsageCountResponse != null) {
                            ((x5a0) gci0.a).setValue(stakeSafeUsageCountResponse);
                            StakeSafeUsageCountResponse stakeSafeUsageCountResponse2 = (StakeSafeUsageCountResponse) ((x5a0) gci0.b).getValue();
                            double dDoubleValue = 0.0d;
                            if (((stakeSafeUsageCountResponse2 == null || (giftAmount2 = stakeSafeUsageCountResponse2.getGiftAmount()) == null) ? 0.0d : giftAmount2.doubleValue()) > 0.0d) {
                                op5.a.getClass();
                                String strB = op5.b("stakesafe_saves:sg_vip", "Stakesafe saves the day", null);
                                String str2 = qub0Var.y0;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String strI = op5.i(str2);
                                if (stakeSafeUsageCountResponse2 != null && (giftAmount = stakeSafeUsageCountResponse2.getGiftAmount()) != null) {
                                    dDoubleValue = giftAmount.doubleValue();
                                }
                                qub0Var.b3(strB, "stake_win", strI + " " + fgo.b(Double.valueOf(dDoubleValue)));
                                qub0Var.t0();
                            }
                            ((x5a0) gci0.A).setValue(Boolean.FALSE);
                            qub0Var.R0().A1(false);
                            qub0Var.S0().A1(false);
                            qub0Var.A4();
                        }
                        break;
                    } catch (Exception unused) {
                    }
                }
                break;
            default:
                osw oswVar = (osw) obj2;
                jxo jxoVar = (jxo) obj;
                if (((int) (jxoVar.a & 4294967295L)) > oswVar.D()) {
                    oswVar.k((int) (jxoVar.a & 4294967295L));
                }
                break;
        }
        return Unit.a;
    }
}
