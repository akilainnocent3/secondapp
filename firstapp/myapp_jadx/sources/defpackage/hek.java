package defpackage;

import android.os.Handler;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sporty.android.core.model.sportysim.NetworkSpeedControllerConfig;
import com.sporty.android.core.model.sportysim.SIMMultiBetBonusData;
import com.sporty.android.core.model.sportysim.SimBonusRatiosData;
import com.sporty.android.core.model.sportysim.SimSportSupData;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class hek {
    public final ln90 a;
    public final psm b;
    public final hrd0 c;

    public hek(ln90 ln90Var, psm psmVar, hrd0 hrd0Var) {
        psmVar.getClass();
        hrd0Var.getClass();
        this.a = ln90Var;
        this.b = psmVar;
        this.c = hrd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        gek gekVar;
        Object objC;
        NetworkSpeedControllerConfig networkSpeedControllerConfig;
        if (x1bVar instanceof gek) {
            gekVar = (gek) x1bVar;
            int i = gekVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gekVar.c = i - Integer.MIN_VALUE;
            } else {
                gekVar = new gek(this, x1bVar);
            }
        } else {
            gekVar = new gek(this, x1bVar);
        }
        Object obj = gekVar.a;
        y5b y5bVar = y5b.a;
        int i2 = gekVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            gekVar.c = 1;
            objC = this.a.c(gekVar);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objC = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objC instanceof zi50.b) {
            return objC;
        }
        tm90 tm90Var = (tm90) objC;
        SimShareData simShareData = SimShareData.INSTANCE;
        boolean z = tm90Var.a;
        dl90 dl90Var = tm90Var.h;
        el90 el90Var = dl90Var.b;
        String string = tm90Var.d;
        String string2 = tm90Var.c;
        String string3 = tm90Var.b;
        simShareData.setSimulatedActive(z);
        boolean z2 = tm90Var.a;
        simShareData.setSpeedControllerEnabled(z2 && (networkSpeedControllerConfig = tm90Var.i) != null && networkSpeedControllerConfig.getEnable());
        iu2 iu2Var = iu2.a;
        if (z2) {
            if (this.b.r()) {
                StakeConfig stakeConfigY = this.c.y();
                if (string3.equals("0")) {
                    string3 = p54.c(stakeConfigY.getMinStake()).toString();
                    string3.getClass();
                }
                simShareData.setMinStake(string3);
                if (string2.equals("0")) {
                    string2 = p54.c(stakeConfigY.getMaxStake()).toString();
                    string2.getClass();
                }
                simShareData.setMaxStake(string2);
                if (string.equals("0")) {
                    string = p54.c(stakeConfigY.getMaxPayout()).toString();
                    string.getClass();
                }
                simShareData.setMaxPayout(string);
            } else {
                simShareData.setMinStake(string3);
                simShareData.setMaxStake(string2);
                simShareData.setMaxPayout(string);
            }
            simShareData.setMaxSelection(tm90Var.f);
            simShareData.setAutoBetMaxTimes(el90Var.a);
            simShareData.setAutoBetEnabled(dl90Var.a && el90Var.a > 1);
            simShareData.clearMarketCategorySets();
            List<SimSportSupData> list = tm90Var.g;
            if (list != null) {
                for (SimSportSupData simSportSupData : list) {
                    List<String> preMatchMarkets = simSportSupData.getPreMatchMarkets();
                    if (preMatchMarkets != null) {
                        SimShareData.INSTANCE.getPrematchMarketCategorySet().put(simSportSupData.getSportId(), CollectionsKt.y0(preMatchMarkets));
                    }
                    List<String> liveMarkets = simSportSupData.getLiveMarkets();
                    if (liveMarkets != null) {
                        SimShareData.INSTANCE.getLiveMarketCategorySet().put(simSportSupData.getSportId(), CollectionsKt.y0(liveMarkets));
                    }
                }
            }
            if (iu2.p()) {
                iu2Var.j().b1();
                if (!((ArrayList) iu2.d()).isEmpty()) {
                    ((Handler) gpf0.a.getValue()).post(new fek());
                }
            }
            SIMMultiBetBonusData sIMMultiBetBonusData = tm90Var.e;
            if (sIMMultiBetBonusData != null) {
                SimShareData simShareData2 = SimShareData.INSTANCE;
                simShareData2.setMultiBetBonusEnable(sIMMultiBetBonusData.getEnable());
                simShareData2.setMultiBetBonusFactor(sIMMultiBetBonusData.getFactor());
                simShareData2.setMultiBetBonusQualifyingOddsLimit(sIMMultiBetBonusData.getQualifyingOddsLimit());
                List<SimBonusRatiosData> bonusRatios = sIMMultiBetBonusData.getBonusRatios();
                if (bonusRatios != null) {
                    for (SimBonusRatiosData simBonusRatiosData : bonusRatios) {
                        SimShareData.INSTANCE.setRationBySelectionMapping(simBonusRatiosData.getSelections(), simBonusRatiosData);
                    }
                }
            }
        } else {
            if (!iu2.k()) {
                iu2Var.j().r0(k53.REAL);
            }
            simShareData.setAutoBetEnabled(false);
        }
        return Unit.a;
    }
}
