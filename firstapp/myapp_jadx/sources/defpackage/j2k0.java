package defpackage;

import com.sporty.android.core.model.loyalty.MissionData;
import com.sporty.android.core.model.loyalty.MissionProgressDto;
import com.sporty.android.core.model.loyalty.MissionPublishState;
import com.sporty.android.core.model.loyalty.MissionRewardDto;
import com.sporty.android.core.model.loyalty.WorldCupPassInfoDto;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class j2k0 {
    public static r3k0 a(MissionData missionData) {
        Object next;
        WorldCupPassInfoDto worldCupPassInfo;
        missionData.getClass();
        if (missionData.getMissionConfig().getStatus() == MissionPublishState.UNPUBLISHED) {
            return r3k0.d.a;
        }
        long id = missionData.getMissionConfig().getId();
        Long purchasePayTotal = missionData.getMissionConfig().getParameter().getPurchasePayTotal();
        long jLongValue = purchasePayTotal != null ? purchasePayTotal.longValue() : 0L;
        Iterator<T> it = missionData.getMissionConfig().getParameter().getRewardList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((MissionRewardDto) next).getRewardType() != 1);
        MissionRewardDto missionRewardDto = (MissionRewardDto) next;
        long rewardAmount = missionRewardDto != null ? missionRewardDto.getRewardAmount() : 0L;
        MissionProgressDto mission = missionData.getMission();
        if (mission == null || (worldCupPassInfo = mission.getWorldCupPassInfo()) == null) {
            return new r3k0.b(id, jLongValue, rewardAmount);
        }
        Long passStartTime = worldCupPassInfo.getPassStartTime();
        Long passEndTime = worldCupPassInfo.getPassEndTime();
        return (passStartTime == null || passEndTime == null) ? new r3k0.c(id, jLongValue, rewardAmount, worldCupPassInfo.getPocketReceiveTime()) : new r3k0.a(id, jLongValue, rewardAmount, passStartTime.longValue(), passEndTime.longValue());
    }
}
