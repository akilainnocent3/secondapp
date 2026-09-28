package defpackage;

import com.sporty.android.core.model.loyalty.BetBuilderType;
import com.sporty.android.core.model.loyalty.BetType;
import com.sporty.android.core.model.loyalty.EarlyGoalsType;
import com.sporty.android.core.model.loyalty.LoyaltyMissionTaskType;
import com.sporty.android.core.model.loyalty.MissionBetCategory;
import com.sporty.android.core.model.loyalty.MissionConfigV2;
import com.sporty.android.core.model.loyalty.MissionParameterV2;
import com.sporty.android.core.model.loyalty.MissionPublishState;
import com.sporty.android.core.model.loyalty.MissionRewardDto;
import com.sporty.android.core.model.loyalty.MissionStatus;
import com.sporty.android.core.model.loyalty.MissionTaskContent;
import com.sporty.android.core.model.loyalty.MissionTaskParameter;
import com.sporty.android.core.model.loyalty.MissionV2Data;
import com.sporty.android.core.model.loyalty.UpType;
import com.sporty.android.core.model.loyalty.UserMissionRecord;
import com.sporty.android.core.model.loyalty.UserMissionRecordType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rlw {
    public final psm a;

    public rlw(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
    }

    public final ArrayList a(List list) {
        Object bVar;
        ArrayList arrayListA = kw5.a(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MissionV2Data missionV2Data = (MissionV2Data) it.next();
            try {
                zi50.a aVar = zi50.b;
                bVar = b(missionV2Data);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar3 = itf0.a;
                aVar3.q("MultiTaskMissionDtoMapper");
                aVar3.f(thA, "Dropping unmappable mission from v2 payload", new Object[0]);
                bVar = null;
            }
            qlw qlwVar = (qlw) bVar;
            if (qlwVar != null) {
                arrayListA.add(qlwVar);
            }
        }
        return arrayListA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [m2g] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    public final qlw b(MissionV2Data missionV2Data) {
        UserMissionRecord userMissionRecord;
        ?? arrayList;
        Long l;
        String strF;
        qrv bVar;
        Long lValueOf;
        yvv yvvVar;
        jrv jrvVarA;
        Object next;
        MissionConfigV2 missionConfig = missionV2Data.getMissionConfig();
        MissionParameterV2 parameter = missionConfig.getParameter();
        List<UserMissionRecord> missionList = missionV2Data.getMissionList();
        if (missionList != null) {
            Iterator it = missionList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((UserMissionRecord) next).getRecordType() != UserMissionRecordType.MISSION);
            userMissionRecord = (UserMissionRecord) next;
        } else {
            userMissionRecord = null;
        }
        List<UserMissionRecord> missionList2 = missionV2Data.getMissionList();
        if (missionList2 != null) {
            arrayList = new ArrayList();
            for (Object obj : missionList2) {
                if (((UserMissionRecord) obj).getRecordType() == UserMissionRecordType.TASK) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        List<MissionTaskParameter> taskParameterList = parameter.getTaskParameterList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = taskParameterList.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            MissionTaskParameter missionTaskParameter = (MissionTaskParameter) next2;
            LoyaltyMissionTaskType taskType = missionTaskParameter.getTaskType();
            if (taskType == null) {
                itf0.a aVar = itf0.a;
                aVar.q("MultiTaskMissionDtoMapper");
                aVar.n("Dropping task[" + i2 + "] with unknown taskType, mission=" + missionConfig.getId(), new Object[i]);
                it2 = it2;
                missionConfig = missionConfig;
                yvvVar = null;
            } else {
                UserMissionRecord userMissionRecord2 = (UserMissionRecord) CollectionsKt.V(i2, arrayList);
                MissionTaskContent missionTaskContent = (MissionTaskContent) CollectionsKt.V(i2, missionConfig.getContent().getTaskContentList());
                String typeDisplay = missionTaskContent != null ? missionTaskContent.getTypeDisplay() : null;
                if (typeDisplay == null) {
                    typeDisplay = "";
                }
                double target = missionTaskParameter.getTarget();
                String url = missionTaskParameter.getUrl();
                if (taskType == LoyaltyMissionTaskType.BET_TOTAL || taskType == LoyaltyMissionTaskType.PLACE_TOTAL) {
                    List<BetBuilderType> betBuilderTypeList = missionTaskParameter.getBetBuilderTypeList();
                    List<EarlyGoalsType> earlyGoalsTypeList = missionTaskParameter.getEarlyGoalsTypeList();
                    List<UpType> upTypeList = missionTaskParameter.getUpTypeList();
                    List<BetType> betTypeList = missionTaskParameter.getBetTypeList();
                    if (betTypeList == null) {
                        betTypeList = m2g.a;
                    }
                    jrvVarA = vsv.a(betBuilderTypeList, earlyGoalsTypeList, upTypeList, betTypeList);
                } else {
                    jrvVarA = null;
                }
                Double minStake = missionTaskParameter.getMinStake();
                Double minTotalOdd = missionTaskParameter.getMinTotalOdd();
                Boolean giftUsage = missionTaskParameter.getGiftUsage();
                Boolean cashOut = missionTaskParameter.getCashOut();
                MissionBetCategory missionBetCategoryA = msv.a(missionTaskParameter.getBetCategory());
                List<BetType> betTypeList2 = missionTaskParameter.getBetTypeList();
                if (betTypeList2 == null) {
                    betTypeList2 = m2g.a;
                }
                List<BetType> list = betTypeList2;
                List<String> betInSpecificRealSportTypeSportIdList = missionTaskParameter.getBetInSpecificRealSportTypeSportIdList();
                if (betInSpecificRealSportTypeSportIdList == null) {
                    betInSpecificRealSportTypeSportIdList = m2g.a;
                }
                List<String> list2 = betInSpecificRealSportTypeSportIdList;
                List<String> betInSpecificTournamentList = missionTaskParameter.getBetInSpecificTournamentList();
                if (betInSpecificTournamentList == null) {
                    betInSpecificTournamentList = m2g.a;
                }
                List<String> list3 = betInSpecificTournamentList;
                List<String> betInSpecificMarketList = missionTaskParameter.getBetInSpecificMarketList();
                if (betInSpecificMarketList == null) {
                    betInSpecificMarketList = m2g.a;
                }
                yvvVar = new yvv(taskType, typeDisplay, target, url, jrvVarA, minStake, minTotalOdd, giftUsage, cashOut, missionBetCategoryA, list, list2, list3, betInSpecificMarketList, userMissionRecord2 != null ? userMissionRecord2.getStatus() : null, userMissionRecord2 != null ? Double.valueOf(userMissionRecord2.getAccumulatedAmount()) : null);
            }
            if (yvvVar != null) {
                arrayList2.add(yvvVar);
            }
            i2 = i3;
            it2 = it2;
            missionConfig = missionConfig;
            i = 0;
        }
        MissionConfigV2 missionConfigV2 = missionConfig;
        long id = missionConfigV2.getId();
        MissionPublishState status = missionConfigV2.getStatus();
        String title = missionConfigV2.getContent().getTitle();
        String participationDuration = parameter.getParticipationDuration();
        if (participationDuration != null) {
            long id2 = missionConfigV2.getId();
            try {
                kotlin.time.b.b.getClass();
                long j = kotlin.time.b.j(kotlin.time.b.a.a(participationDuration), rgf.DAYS);
                if (j < 1) {
                    j = 1;
                }
                lValueOf = Long.valueOf(j);
            } catch (IllegalArgumentException e) {
                itf0.a.f(e, "Failed to parse participationDuration: " + participationDuration + " for mission " + id2, new Object[0]);
                lValueOf = null;
            }
            l = lValueOf;
        } else {
            l = null;
        }
        long expireTime = userMissionRecord != null ? userMissionRecord.getExpireTime() : missionConfigV2.getUnpublishedTime();
        long publishedTime = missionConfigV2.getPublishedTime();
        long lastParticipationTime = parameter.getLastParticipationTime();
        MissionRewardDto missionRewardDto = (MissionRewardDto) CollectionsKt.firstOrNull(parameter.getRewardList());
        if (missionRewardDto == null || (strF = missionRewardDto.getCurrency()) == null) {
            strF = this.a.f();
        }
        String str = strF;
        List<MissionRewardDto> rewardList = parameter.getRewardList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = rewardList.iterator();
        while (it3.hasNext()) {
            rtv rtvVarB = vsv.b((MissionRewardDto) it3.next());
            if (rtvVarB != null) {
                arrayList3.add(rtvVarB);
            }
        }
        boolean canParticipate = missionV2Data.getCanParticipate();
        MissionStatus status2 = userMissionRecord != null ? userMissionRecord.getStatus() : null;
        if (userMissionRecord == null || userMissionRecord.getCancelable() == null) {
            bVar = qrv.c.a;
        } else if (Intrinsics.g(userMissionRecord.getCancelable(), Boolean.TRUE)) {
            bVar = qrv.a.a;
        } else {
            Long cancelAvailableTime = userMissionRecord.getCancelAvailableTime();
            bVar = cancelAvailableTime != null ? new qrv.b(cancelAvailableTime.longValue()) : qrv.c.a;
        }
        return new qlw(id, status, title, l, expireTime, publishedTime, lastParticipationTime, str, arrayList3, canParticipate, status2, bVar, arrayList2, missionConfigV2.getType());
    }
}
