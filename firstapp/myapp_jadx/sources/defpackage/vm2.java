package defpackage;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.vip.data.StakeSafeUsageCountResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vm2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ vm2(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xi60 xi60Var;
        Double stakeLimit;
        int i = this.a;
        int i2 = 1;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        int i3 = 0;
        switch (i) {
            case 0:
                fo2 fo2Var = (fo2) onCreateContextMenuListener;
                if (fo2Var.M == fo2.b.b) {
                    Function2<? super Integer, ? super Integer, Unit> function2 = fo2Var.I;
                    if (function2 == null) {
                        Intrinsics.n("betHistoryArchiveFetchManager");
                        throw null;
                    }
                    function2.invoke(Integer.valueOf(fo2Var.K + fo2Var.J), Integer.valueOf(fo2Var.J));
                }
                return Unit.a;
            case 1:
                enb enbVar = (enb) onCreateContextMenuListener;
                e activity = enbVar.getActivity();
                if (activity != null && enbVar.getContext() != null) {
                    GameDetails gameDetails = enbVar.G;
                    wz.a("FBGIconClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                    xi60 xi60Var2 = enbVar.j0;
                    if (xi60Var2 == null) {
                        xi60Var2 = new xi60();
                        enbVar.j0 = xi60Var2;
                    }
                    if (!xi60Var2.isAdded() && (xi60Var = enbVar.j0) != null) {
                        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        xi60Var.q0(supportFragmentManager, new ykb(enbVar, i3), new so2(enbVar, i2), new alb(enbVar, i3));
                    }
                }
                return Unit.a;
            default:
                qub0 qub0Var = (qub0) onCreateContextMenuListener;
                x5a0 x5a0Var = (x5a0) gci0.b;
                StakeSafeUsageCountResponse stakeSafeUsageCountResponse = (StakeSafeUsageCountResponse) x5a0Var.getValue();
                int maxAllowed = stakeSafeUsageCountResponse != null ? stakeSafeUsageCountResponse.getMaxAllowed() : 0;
                int used = stakeSafeUsageCountResponse != null ? stakeSafeUsageCountResponse.getUsed() : 0;
                Object[] objArr = ((BetContainerState) qub0Var.R0().a.getValue()).getBetPlaced() || ((BetContainerState) qub0Var.S0().a.getValue()).getBetPlaced();
                Object value = ((x5a0) gci0.z).getValue();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.g(value, bool) && ((Boolean) ((x5a0) gci0.j).getValue()).booleanValue() && !((Boolean) ((x5a0) gci0.I).getValue()).booleanValue() && !((Boolean) ((x5a0) gci0.n).getValue()).booleanValue()) {
                    x5a0 x5a0Var2 = (x5a0) gci0.B;
                    if (!Intrinsics.g(x5a0Var2.getValue(), bool) || objArr == false) {
                        if (used >= maxAllowed) {
                            op5.a.getClass();
                            qub0Var.w4(op5.b("ss_reset:sg_vip", "Stakesafe resets at midnight", null));
                        } else {
                            boolean zG = Intrinsics.g(x5a0Var2.getValue(), bool);
                            boolean z = !zG;
                            if (zG || !qub0Var.x1()) {
                                ((x5a0) gci0.A).setValue(Boolean.valueOf(z));
                                if (zG) {
                                    qub0Var.q4();
                                } else {
                                    StakeSafeUsageCountResponse stakeSafeUsageCountResponse2 = (StakeSafeUsageCountResponse) x5a0Var.getValue();
                                    if (stakeSafeUsageCountResponse2 != null && (stakeLimit = stakeSafeUsageCountResponse2.getStakeLimit()) != null) {
                                        Double d = stakeLimit.doubleValue() > 0.0d ? stakeLimit : null;
                                        if (d != null) {
                                            double dDoubleValue = d.doubleValue();
                                            qub0Var.b2 = d;
                                            DetailResponse detailResponseCopy$default = DetailResponse.copy$default(qub0Var.R0().y1(), 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, dDoubleValue, 0, 0, null, null, null, 8063, null);
                                            DetailResponse detailResponseCopy$default2 = DetailResponse.copy$default(qub0Var.S0().y1(), 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, dDoubleValue, 0, 0, null, null, null, 8063, null);
                                            qub0Var.R0().L1(detailResponseCopy$default);
                                            qub0Var.S0().L1(detailResponseCopy$default2);
                                            qub0Var.R0().U1(true);
                                            qub0Var.S0().U1(true);
                                        }
                                    }
                                    ((x5a0) qub0Var.j1).setValue(Boolean.FALSE);
                                    qub0Var.S0().R1(false);
                                    qub0Var.R0().R1(false);
                                }
                                qub0Var.R0().A1(z);
                                qub0Var.S0().A1(z);
                                qub0Var.A4();
                            } else {
                                op5.a.getClass();
                                qub0Var.b3(op5.b("stakesafe_fbg:sg_vip", "You cannot use StakeSafe with a free bet gift", null), "stake_fbg", "");
                            }
                        }
                    }
                }
                return Unit.a;
        }
    }
}
