package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportygames.commons.components.BetBoxContainer;
import com.sportygames.commons.components.BetChipContainer;
import com.sportygames.commons.components.ChipSlider;
import com.sportygames.redblack.remote.models.BetAmountVO;
import com.sportygames.redblack.remote.models.RoundInitializeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ss00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ss00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xo40 xo40Var;
        BetAmountVO betAmountVO;
        BetAmountVO betAmountVO2;
        BetAmountVO betAmountVO3;
        BetAmountVO betAmountVO4;
        BetAmountVO betAmountVO5;
        BetAmountVO betAmountVO6;
        xo40 xo40Var2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ts00 ts00Var = (ts00) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                ts00Var.b = OtpData.PhoneMigration.a((OtpData.PhoneMigration) ts00Var.B1(), oTPResult);
                break;
            case 1:
                nn40 nn40Var = (nn40) obj2;
                Double d = (Double) obj;
                if (d != null) {
                    if (nn40Var.N != null) {
                        double dDoubleValue = d.doubleValue();
                        Double d2 = nn40Var.N;
                        if (dDoubleValue < (d2 != null ? d2.doubleValue() : 0.0d) || d.doubleValue() <= 0.0d) {
                            xo40Var2 = (xo40) nn40Var.b;
                            if (xo40Var2 != null) {
                                xo40Var2.b.setVisibility(8);
                            }
                        } else {
                            Double d3 = nn40Var.N;
                            if ((d3 != null ? d3.doubleValue() : 0.0d) <= nn40Var.X) {
                                xo40 xo40Var3 = (xo40) nn40Var.b;
                                if (xo40Var3 != null) {
                                    xo40Var3.b.setVisibility(0);
                                }
                            } else {
                                xo40Var2 = (xo40) nn40Var.b;
                                if (xo40Var2 != null) {
                                    xo40Var2.b.setVisibility(8);
                                }
                            }
                        }
                    } else {
                        xo40Var2 = (xo40) nn40Var.b;
                        if (xo40Var2 != null) {
                            xo40Var2.b.setVisibility(8);
                        }
                    }
                }
                xo40 xo40Var4 = (xo40) nn40Var.b;
                Double dValueOf = null;
                if (xo40Var4 != null) {
                    BetChipContainer betChipContainer = xo40Var4.f;
                    RoundInitializeResponse roundInitializeResponseD = nn40Var.C0().c.d();
                    betChipContainer.setBetAmount(d, (roundInitializeResponseD == null || (betAmountVO6 = roundInitializeResponseD.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO6.getMaxAmount()));
                }
                if (nn40Var.V != 0) {
                    Double d4 = nn40Var.N;
                    double dDoubleValue2 = d4 != null ? d4.doubleValue() : 0.0d;
                    RoundInitializeResponse roundInitializeResponseD2 = nn40Var.C0().c.d();
                    if (dDoubleValue2 >= ((roundInitializeResponseD2 == null || (betAmountVO5 = roundInitializeResponseD2.getBetAmountVO()) == null) ? 0.0d : betAmountVO5.getDefaultAmount()) || nn40Var.V != 0) {
                        xo40 xo40Var5 = (xo40) nn40Var.b;
                        if (xo40Var5 != null) {
                            xo40Var5.e.setBetAmount(d, nn40Var.U);
                        }
                        if (d != null) {
                            double dDoubleValue3 = d.doubleValue();
                            xo40 xo40Var6 = (xo40) nn40Var.b;
                            if (xo40Var6 != null) {
                                xo40Var6.X.setBetAmount(dDoubleValue3, nn40Var.U);
                            }
                        }
                    } else {
                        Double d5 = nn40Var.N;
                        double dDoubleValue4 = d5 != null ? d5.doubleValue() : 0.0d;
                        RoundInitializeResponse roundInitializeResponseD3 = nn40Var.C0().c.d();
                        double minAmount = (roundInitializeResponseD3 == null || (betAmountVO4 = roundInitializeResponseD3.getBetAmountVO()) == null) ? 0.0d : betAmountVO4.getMinAmount();
                        B b = nn40Var.b;
                        if (dDoubleValue4 < minAmount) {
                            xo40 xo40Var7 = (xo40) b;
                            if (xo40Var7 != null) {
                                ChipSlider chipSlider = xo40Var7.X;
                                BetAmountVO betAmountVO7 = nn40Var.P;
                                Double dValueOf2 = betAmountVO7 != null ? Double.valueOf(betAmountVO7.getMinAmount()) : null;
                                RoundInitializeResponse roundInitializeResponseD4 = nn40Var.C0().c.d();
                                Double dValueOf3 = (roundInitializeResponseD4 == null || (betAmountVO3 = roundInitializeResponseD4.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO3.getMaxAmount());
                                BetAmountVO betAmountVO8 = nn40Var.P;
                                chipSlider.setConfiguration(dValueOf2, dValueOf3, betAmountVO8 != null ? Double.valueOf(betAmountVO8.getDefaultAmount()) : null);
                            }
                            xo40 xo40Var8 = (xo40) nn40Var.b;
                            if (xo40Var8 != null) {
                                BetBoxContainer betBoxContainer = xo40Var8.e;
                                RoundInitializeResponse roundInitializeResponseD5 = nn40Var.C0().c.d();
                                if (roundInitializeResponseD5 != null && (betAmountVO2 = roundInitializeResponseD5.getBetAmountVO()) != null) {
                                    dValueOf = Double.valueOf(betAmountVO2.getMinAmount());
                                }
                                betBoxContainer.setBetAmount(dValueOf, nn40Var.U);
                            }
                            xo40 xo40Var9 = (xo40) nn40Var.b;
                            if (xo40Var9 != null) {
                                ChipSlider chipSlider2 = xo40Var9.X;
                                RoundInitializeResponse roundInitializeResponseD6 = nn40Var.C0().c.d();
                                chipSlider2.setBetAmount((roundInitializeResponseD6 == null || (betAmountVO = roundInitializeResponseD6.getBetAmountVO()) == null) ? 0.0d : betAmountVO.getMinAmount(), nn40Var.U);
                            }
                        } else {
                            xo40 xo40Var10 = (xo40) b;
                            if (xo40Var10 != null) {
                                xo40Var10.X.setSeekMax();
                            }
                            xo40 xo40Var11 = (xo40) nn40Var.b;
                            if (xo40Var11 != null) {
                                xo40Var11.e.setBetAmount(nn40Var.N, nn40Var.U);
                            }
                            Double d6 = nn40Var.N;
                            if (d6 != null) {
                                double dDoubleValue5 = d6.doubleValue();
                                xo40 xo40Var12 = (xo40) nn40Var.b;
                                if (xo40Var12 != null) {
                                    xo40Var12.X.setBetAmount(dDoubleValue5, nn40Var.U);
                                }
                            }
                        }
                    }
                    double dDoubleValue6 = d != null ? d.doubleValue() : 0.0d;
                    Double d7 = nn40Var.N;
                    if (dDoubleValue6 >= (d7 != null ? d7.doubleValue() : 0.0d) * 0.8d) {
                        Double d8 = nn40Var.N;
                        if ((d8 != null ? d8.doubleValue() : 0.0d) <= nn40Var.X && (xo40Var = (xo40) nn40Var.b) != null) {
                            xo40Var.b.setVisibility(0);
                        }
                    }
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new b.u.d(str));
                break;
        }
        return Unit.a;
    }
}
