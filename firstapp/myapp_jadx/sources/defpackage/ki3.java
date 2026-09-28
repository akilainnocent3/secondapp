package defpackage;

import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.sportysim.SimOneCutStatus;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ki3 implements pya, do8 {
    public final /* synthetic */ Object a;

    public /* synthetic */ ki3(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.do8
    public Object a(hi50 hi50Var) {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    @Override // defpackage.pya
    public void accept(Object obj) throws Throwable {
        BetTypeFlexiBetConfig betTypeFlexiBetConfig;
        so3 so3Var;
        so3 so3Var2;
        BetslipActivity betslipActivity = (BetslipActivity) this.a;
        ((Boolean) obj).getClass();
        Set<g08> set = BetslipActivity.X2;
        betslipActivity.Q1().X1();
        betslipActivity.w3(false);
        int iE = qq1.e(betslipActivity.T1(), BOConfigParam.SimCutStatus, SimOneCutStatus.DISABLED_ALL.getValue());
        if (betslipActivity.N1().m0() && iE == SimOneCutStatus.ACCESS_WITHOUT_LIVE.getValue()) {
            if (betslipActivity.N1().p()) {
                if (betslipActivity.R1().M()) {
                    betslipActivity.O2 = false;
                    betslipActivity.P2 = false;
                    betslipActivity.m4(R.string.component_betslip__sporty_insure_is_unavailable_for_live_events);
                }
                so3Var2 = betslipActivity.p1;
                if (so3Var2 != null) {
                    so3Var2.a.setOneCutEnable(luo.b);
                }
            } else {
                so3Var = betslipActivity.p1;
                if (so3Var != null) {
                    so3Var.a.setOneCutEnable(luo.c);
                }
            }
        } else if (!betslipActivity.N1().m0()) {
            bqy.a aVar = betslipActivity.m1.b;
            if ((aVar == null ? 2 : aVar.a) == 1) {
                if (betslipActivity.N1().p()) {
                    if (betslipActivity.R1().M()) {
                        betslipActivity.O2 = false;
                        betslipActivity.P2 = false;
                        betslipActivity.m4(R.string.component_betslip__sporty_insure_is_unavailable_for_live_events);
                    }
                    so3Var2 = betslipActivity.p1;
                    if (so3Var2 != null) {
                        so3Var2.a.setOneCutEnable(luo.b);
                    }
                } else {
                    so3Var = betslipActivity.p1;
                    if (so3Var != null) {
                        so3Var.a.setOneCutEnable(luo.c);
                    }
                }
            }
        }
        if (betslipActivity.O2 && (betTypeFlexiBetConfig = betslipActivity.J2) != null && betTypeFlexiBetConfig.getStatus() == 1) {
            betslipActivity.m4(R.string.component_betslip__sporty_insure_is_unavailable_for_live_events);
            betslipActivity.O2 = false;
            betslipActivity.P2 = false;
        }
    }
}
