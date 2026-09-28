package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.vip.data.StakeSafeUsageCountResponse;
import com.sportygames.vip.data.TurboUsageCountResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ge30 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ge30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0200  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:93:0x01df  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f4  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        StakeSafeUsageCountResponse stakeSafeUsageCountResponse;
        TurboUsageCountResponse turboUsageCountResponse;
        Double turboValue;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                SelectedGiftData selectedGiftData = (SelectedGiftData) obj2;
                GiftDetails giftDetails = (GiftDetails) obj;
                boolean z5 = QuickBetView.j1;
                return Boolean.valueOf(Intrinsics.g(giftDetails != null ? giftDetails.getGiftId() : null, selectedGiftData != null ? selectedGiftData.getGiftId() : null));
            default:
                qub0 qub0Var = (qub0) obj2;
                String str = (String) obj;
                if (!qub0Var.y1()) {
                    return Unit.a;
                }
                x5a0 x5a0Var = (x5a0) gci0.h;
                Object value = x5a0Var.getValue();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.g(value, bool) && Intrinsics.g(((x5a0) gci0.r).getValue(), bool) && Intrinsics.g(((x5a0) gci0.z).getValue(), bool)) {
                    x5a0 x5a0Var2 = (x5a0) gci0.I;
                    if (((Boolean) x5a0Var2.getValue()).booleanValue() && Intrinsics.g(str, "ROUND_END_WAIT")) {
                        x5a0Var2.setValue(Boolean.FALSE);
                    }
                }
                boolean z6 = true;
                if (Intrinsics.g(str, "ROUND_END_WAIT") && qub0Var.v3 > 0) {
                    qub0Var.R0().E1(qub0Var.v3);
                    qub0Var.S0().E1(qub0Var.v3);
                    TurboUsageCountResponse turboUsageCountResponse2 = qub0Var.p3;
                    if (turboUsageCountResponse2 != null && !qub0Var.S3()) {
                        qub0Var.p3 = null;
                        ((x5a0) gci0.c).setValue(turboUsageCountResponse2);
                        qub0Var.s4();
                        qub0Var.R3(turboUsageCountResponse2);
                    }
                    BetContainerState betContainerState = (BetContainerState) qub0Var.R0().a.getValue();
                    BetContainerState betContainerState2 = (BetContainerState) qub0Var.S0().a.getValue();
                    boolean z7 = (betContainerState.isStakeSafeBet() && betContainerState.getRoundId() == qub0Var.v3) || (betContainerState2.isStakeSafeBet() && betContainerState2.getRoundId() == qub0Var.v3);
                    qub0Var.R0().B1(qub0Var.v3);
                    qub0Var.S0().B1(qub0Var.v3);
                    if (z7) {
                        qub0Var.q4();
                    }
                    ((x5a0) gci0.m).setValue(Boolean.FALSE);
                }
                if (Intrinsics.g(x5a0Var.getValue(), bool) && Intrinsics.g(((x5a0) gci0.r).getValue(), bool) && Intrinsics.g(((x5a0) gci0.x).getValue(), bool) && (turboUsageCountResponse = (TurboUsageCountResponse) ((x5a0) gci0.d).getValue()) != null && (turboValue = turboUsageCountResponse.getTurboValue()) != null) {
                    double dDoubleValue = turboValue.doubleValue();
                    Long activateAfterRoundId = turboUsageCountResponse.getActivateAfterRoundId();
                    if (activateAfterRoundId != null) {
                        long jLongValue = activateAfterRoundId.longValue();
                        if (dDoubleValue >= 100.0d && Intrinsics.g(str, "ROUND_END_WAIT") && qub0Var.v3 == jLongValue) {
                            ((x5a0) gci0.o).setValue(bool);
                        }
                        x5a0 x5a0Var3 = (x5a0) gci0.p;
                        if (Intrinsics.g(x5a0Var3.getValue(), bool)) {
                            qub0Var.R0().D1(true);
                            qub0Var.S0().D1(true);
                        }
                        BetContainerState betContainerState3 = (BetContainerState) qub0Var.R0().a.getValue();
                        BetContainerState betContainerState4 = (BetContainerState) qub0Var.S0().a.getValue();
                        if (qub0Var.v3 <= 0 || !betContainerState3.getBetPlaced()) {
                            j = 0;
                        } else {
                            j = 0;
                            if (betContainerState3.getRoundId() == qub0Var.v3) {
                                z = true;
                            }
                            if (qub0Var.v3 <= j && betContainerState4.getBetPlaced() && betContainerState4.getRoundId() == qub0Var.v3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z || z2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!Intrinsics.g(str, "ROUND_ONGOING") || Intrinsics.g(str, "ROUND_PRE_START")) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!Intrinsics.g(x5a0Var3.getValue(), bool)) {
                                ((x5a0) gci0.k).setValue(Boolean.FALSE);
                            } else if (z4 && z3) {
                                ((x5a0) gci0.k).setValue(bool);
                            }
                        }
                        z = false;
                        if (qub0Var.v3 <= j) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (Intrinsics.g(str, "ROUND_ONGOING")) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (!Intrinsics.g(x5a0Var3.getValue(), bool)) {
                            ((x5a0) gci0.k).setValue(Boolean.FALSE);
                        } else if (z4) {
                            ((x5a0) gci0.k).setValue(bool);
                        }
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                if (Intrinsics.g(x5a0Var.getValue(), bool) && Intrinsics.g(((x5a0) gci0.r).getValue(), bool) && Intrinsics.g(((x5a0) gci0.z).getValue(), bool) && (stakeSafeUsageCountResponse = (StakeSafeUsageCountResponse) ((x5a0) gci0.b).getValue()) != null && stakeSafeUsageCountResponse.getStakeSafePercentage() != null) {
                    BetContainerState betContainerState5 = (BetContainerState) qub0Var.R0().a.getValue();
                    BetContainerState betContainerState6 = (BetContainerState) qub0Var.S0().a.getValue();
                    boolean z8 = qub0Var.v3 > j && betContainerState5.getBetPlaced() && betContainerState5.getRoundId() == qub0Var.v3;
                    boolean z9 = qub0Var.v3 > j && betContainerState6.getBetPlaced() && betContainerState6.getRoundId() == qub0Var.v3;
                    boolean z10 = z8 && betContainerState5.isStakeSafeBet();
                    boolean z11 = z9 && betContainerState6.isStakeSafeBet();
                    if (!z10 && !z11) {
                        z6 = false;
                    }
                    if ((Intrinsics.g(str, "ROUND_ONGOING") || Intrinsics.g(str, "ROUND_PRE_START")) && z6) {
                        ((x5a0) gci0.m).setValue(bool);
                        if (z8 && !z9 && betContainerState6.isStakeSafeApplied()) {
                            qub0Var.S0().A1(false);
                        }
                        if (z9 && !z8 && betContainerState5.isStakeSafeApplied()) {
                            qub0Var.R0().A1(false);
                        }
                        qub0Var.A4();
                    }
                }
                return Unit.a;
        }
    }
}
