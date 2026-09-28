package defpackage;

import com.sporty.android.core.model.sportysim.NetworkSpeedControllerConfig;
import com.sporty.android.core.model.sportysim.SIMMultiBetBonusData;
import com.sporty.android.core.model.sportysim.SimSportSupData;
import com.sportybet.android.instantwin.newtork.model.response.simulation.AddToStakeConfigVO;
import com.sportybet.android.instantwin.newtork.model.response.simulation.GiftConfigVO;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationAutoBetConfig;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationAutoBetTimes;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationConfigData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class fej {
    public static final /* synthetic */ int a = 0;

    public static final tm90 a(NetworkSimulationConfigData networkSimulationConfigData) {
        el90 el90Var;
        dl90 dl90Var;
        boolean z;
        NetworkSpeedControllerConfig networkSpeedControllerConfig;
        networkSimulationConfigData.getClass();
        Boolean boolIsSimulatedActive = networkSimulationConfigData.isSimulatedActive();
        boolean zBooleanValue = boolIsSimulatedActive != null ? boolIsSimulatedActive.booleanValue() : false;
        String minStake = networkSimulationConfigData.getMinStake();
        if (minStake == null) {
            minStake = "0";
        }
        String maxStake = networkSimulationConfigData.getMaxStake();
        if (maxStake == null) {
            maxStake = "0";
        }
        String maxPayout = networkSimulationConfigData.getMaxPayout();
        String str = maxPayout != null ? maxPayout : "0";
        String str2 = minStake;
        String str3 = maxStake;
        SIMMultiBetBonusData multiBetBonus = networkSimulationConfigData.getMultiBetBonus();
        Integer maxSelection = networkSimulationConfigData.getMaxSelection();
        int iIntValue = maxSelection != null ? maxSelection.intValue() : 0;
        List<SimSportSupData> sports = networkSimulationConfigData.getSports();
        NetworkSimulationAutoBetConfig autoBet = networkSimulationConfigData.getAutoBet();
        boolean z2 = true;
        if (autoBet == null) {
            dl90Var = new dl90(false, new el90(1));
        } else {
            boolean zIsEnable = autoBet.isEnable();
            NetworkSimulationAutoBetTimes times = autoBet.getTimes();
            if (times == null) {
                el90Var = new el90(1);
            } else {
                Integer limit = times.getLimit();
                el90Var = new el90(limit != null ? limit.intValue() : 1);
            }
            dl90Var = new dl90(zIsEnable, el90Var);
        }
        NetworkSpeedControllerConfig speedControllerConfig = networkSimulationConfigData.getSpeedControllerConfig();
        GiftConfigVO gift = networkSimulationConfigData.getGift();
        if (gift == null || !gift.getEnable()) {
            z2 = false;
        }
        AddToStakeConfigVO addToStake = networkSimulationConfigData.getAddToStake();
        if (addToStake == null || addToStake.getEnable() != z2) {
            z = false;
            networkSpeedControllerConfig = speedControllerConfig;
        } else {
            networkSpeedControllerConfig = speedControllerConfig;
            z = true;
        }
        return new tm90(zBooleanValue, str2, str3, str, multiBetBonus, iIntValue, sports, dl90Var, networkSpeedControllerConfig, z2, z);
    }
}
