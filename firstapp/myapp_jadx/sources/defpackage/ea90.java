package defpackage;

import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.loyalty.BetBuilderType;
import com.sporty.android.core.model.loyalty.BetType;
import com.sporty.android.core.model.loyalty.EarlyGoalsType;
import com.sporty.android.core.model.loyalty.LoyaltyMissionTaskType;
import com.sporty.android.core.model.loyalty.MissionBetCategory;
import com.sporty.android.core.model.loyalty.MissionConfigV2;
import com.sporty.android.core.model.loyalty.MissionPublishState;
import com.sporty.android.core.model.loyalty.MissionRewardDto;
import com.sporty.android.core.model.loyalty.MissionTaskContent;
import com.sporty.android.core.model.loyalty.MissionTaskParameter;
import com.sporty.android.core.model.loyalty.MissionV2Data;
import com.sporty.android.core.model.loyalty.UpType;
import com.sporty.android.core.model.loyalty.UserMissionRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ea90 {
    public final psm a;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoyaltyMissionTaskType.values().length];
            try {
                iArr[LoyaltyMissionTaskType.BET_TOTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoyaltyMissionTaskType.PLACE_TOTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public ea90(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
    }

    public final da90 a(MissionV2Data missionV2Data) {
        qtv qtvVar;
        ArrayList arrayList;
        UserMissionRecord userMissionRecord;
        String str;
        jrv jrvVarA;
        List<EarlyGoalsType> earlyGoalsTypeList;
        List<BetBuilderType> betBuilderTypeList;
        Iterator it;
        MissionTaskParameter missionTaskParameter;
        ga90 bVar;
        String currency;
        String url;
        Object next;
        LoyaltyMissionTaskType taskType;
        List<BetType> betTypeList;
        OrderBetType orderBetType;
        missionV2Data.getClass();
        MissionConfigV2 missionConfig = missionV2Data.getMissionConfig();
        List<MissionTaskParameter> taskParameterList = missionConfig.getParameter().getTaskParameterList();
        Iterator<MissionTaskParameter> it2 = taskParameterList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            LoyaltyMissionTaskType taskType2 = it2.next().getTaskType();
            if (taskType2 == LoyaltyMissionTaskType.BET_TOTAL || taskType2 == LoyaltyMissionTaskType.PLACE_TOTAL) {
                break;
            }
            i++;
        }
        MissionTaskParameter missionTaskParameter2 = (MissionTaskParameter) CollectionsKt.V(i, taskParameterList);
        MissionBetCategory missionBetCategoryA = msv.a(missionTaskParameter2 != null ? missionTaskParameter2.getBetCategory() : null);
        LoyaltyMissionTaskType taskType3 = missionTaskParameter2 != null ? missionTaskParameter2.getTaskType() : null;
        int i2 = taskType3 != null ? a.a[taskType3.ordinal()] : -1;
        int i3 = 1;
        if (i2 != 1) {
            qtvVar = i2 != 2 ? qtv.d : qtv.c;
        } else {
            qtvVar = qtv.a;
        }
        qtv qtvVar2 = qtvVar;
        if (missionTaskParameter2 == null || (betTypeList = missionTaskParameter2.getBetTypeList()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(l48.r(betTypeList, 10));
            Iterator<T> it3 = betTypeList.iterator();
            while (it3.hasNext()) {
                int i4 = fa90.a[((BetType) it3.next()).ordinal()];
                if (i4 == 1) {
                    orderBetType = OrderBetType.SINGLE;
                } else if (i4 == 2) {
                    orderBetType = OrderBetType.MULTIPLE;
                } else {
                    if (i4 != 3) {
                        uhc.a();
                        return null;
                    }
                    orderBetType = OrderBetType.SYSTEM;
                }
                arrayList.add(orderBetType);
            }
        }
        List<UserMissionRecord> missionList = missionV2Data.getMissionList();
        if (missionList != null) {
            Iterator<T> it4 = missionList.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                taskType = ((UserMissionRecord) next).getTaskType();
                if (taskType == LoyaltyMissionTaskType.BET_TOTAL) {
                    break;
                }
            } while (taskType != LoyaltyMissionTaskType.PLACE_TOTAL);
            userMissionRecord = (UserMissionRecord) next;
        } else {
            userMissionRecord = null;
        }
        int id = (int) missionConfig.getId();
        ArrayList arrayList2 = arrayList;
        MissionPublishState status = missionConfig.getStatus();
        String title = missionConfig.getContent().getTitle();
        long publishedTime = missionConfig.getPublishedTime();
        MissionTaskContent missionTaskContent = (MissionTaskContent) CollectionsKt.V(i, missionConfig.getContent().getTaskContentList());
        String typeDisplay = missionTaskContent != null ? missionTaskContent.getTypeDisplay() : null;
        if (typeDisplay == null) {
            typeDisplay = "";
            str = typeDisplay;
        } else {
            str = "";
        }
        long unpublishedTime = missionConfig.getUnpublishedTime();
        if (missionTaskParameter2 != null && (url = missionTaskParameter2.getUrl()) != null) {
            str = url;
        }
        long lastParticipationTime = missionConfig.getParameter().getLastParticipationTime();
        MissionRewardDto missionRewardDto = (MissionRewardDto) CollectionsKt.firstOrNull(missionConfig.getParameter().getRewardList());
        String strF = (missionRewardDto == null || (currency = missionRewardDto.getCurrency()) == null) ? this.a.f() : currency;
        List<MissionRewardDto> rewardList = missionConfig.getParameter().getRewardList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it5 = rewardList.iterator();
        while (it5.hasNext()) {
            MissionRewardDto missionRewardDto2 = (MissionRewardDto) it5.next();
            int rewardType = missionRewardDto2.getRewardType();
            if (rewardType == i3) {
                it = it5;
                missionTaskParameter = missionTaskParameter2;
                strF = strF;
                bVar = new ga90.b(missionRewardDto2.getRewardAmount());
            } else if (rewardType == 7) {
                it = it5;
                missionTaskParameter = missionTaskParameter2;
                Integer multiplier = missionRewardDto2.getMultiplier();
                Integer days = missionRewardDto2.getDays();
                if (multiplier == null || days == null) {
                    strF = strF;
                    itf0.a.n("Dropping rakeback boost reward: multiplier=" + multiplier + " days=" + days, new Object[0]);
                    bVar = null;
                } else {
                    bVar = ga90.c.a;
                }
            } else if (rewardType == 9) {
                it = it5;
                missionTaskParameter = missionTaskParameter2;
                bVar = ga90.d.a;
            } else if (rewardType != 10) {
                it = it5;
                missionTaskParameter = missionTaskParameter2;
                itf0.a.n(hce0.a(missionRewardDto2.getRewardType(), "Dropping reward with unknown rewardType="), new Object[0]);
                bVar = null;
            } else {
                it = it5;
                missionTaskParameter = missionTaskParameter2;
                bVar = ga90.a.a;
            }
            if (bVar != null) {
                arrayList3.add(bVar);
            }
            it5 = it;
            strF = strF;
            missionTaskParameter2 = missionTaskParameter;
            i3 = 1;
        }
        MissionTaskParameter missionTaskParameter3 = missionTaskParameter2;
        String str2 = strF;
        double target = missionTaskParameter3 != null ? missionTaskParameter3.getTarget() : 0.0d;
        List list = arrayList2 == null ? m2g.a : arrayList2;
        Double minStake = missionTaskParameter3 != null ? missionTaskParameter3.getMinStake() : null;
        Double minTotalOdd = missionTaskParameter3 != null ? missionTaskParameter3.getMinTotalOdd() : null;
        Boolean giftUsage = missionTaskParameter3 != null ? missionTaskParameter3.getGiftUsage() : null;
        Boolean cashOut = missionTaskParameter3 != null ? missionTaskParameter3.getCashOut() : null;
        Double dValueOf = userMissionRecord != null ? Double.valueOf(userMissionRecord.getAccumulatedAmount()) : null;
        List<String> betInSpecificRealSportTypeSportIdList = missionTaskParameter3 != null ? missionTaskParameter3.getBetInSpecificRealSportTypeSportIdList() : null;
        if (betInSpecificRealSportTypeSportIdList == null) {
            betInSpecificRealSportTypeSportIdList = m2g.a;
        }
        List<String> list2 = betInSpecificRealSportTypeSportIdList;
        List<String> betInSpecificTournamentList = missionTaskParameter3 != null ? missionTaskParameter3.getBetInSpecificTournamentList() : null;
        if (betInSpecificTournamentList == null) {
            betInSpecificTournamentList = m2g.a;
        }
        List<String> list3 = betInSpecificTournamentList;
        List<String> betInSpecificMarketList = missionTaskParameter3 != null ? missionTaskParameter3.getBetInSpecificMarketList() : null;
        if (betInSpecificMarketList == null) {
            betInSpecificMarketList = m2g.a;
        }
        List<String> list4 = betInSpecificMarketList;
        if (missionTaskParameter3 != null) {
            List<BetBuilderType> betBuilderTypeList2 = missionTaskParameter3.getBetBuilderTypeList();
            List<EarlyGoalsType> earlyGoalsTypeList2 = missionTaskParameter3.getEarlyGoalsTypeList();
            List<UpType> upTypeList = missionTaskParameter3.getUpTypeList();
            List<BetType> betTypeList2 = missionTaskParameter3.getBetTypeList();
            if (betTypeList2 == null) {
                betTypeList2 = m2g.a;
            }
            jrvVarA = vsv.a(betBuilderTypeList2, earlyGoalsTypeList2, upTypeList, betTypeList2);
        } else {
            jrvVarA = null;
        }
        return new da90(missionBetCategoryA, id, status, title, typeDisplay, unpublishedTime, publishedTime, str, lastParticipationTime, str2, qtvVar2, target, list, minStake, minTotalOdd, giftUsage, cashOut, arrayList3, dValueOf, jrvVarA, list2, list3, list4, (missionTaskParameter3 == null || (betBuilderTypeList = missionTaskParameter3.getBetBuilderTypeList()) == null) ? null : (BetBuilderType) CollectionsKt.firstOrNull(betBuilderTypeList), missionTaskParameter3 != null ? missionTaskParameter3.getUpTypeList() : null, (missionTaskParameter3 == null || (earlyGoalsTypeList = missionTaskParameter3.getEarlyGoalsTypeList()) == null) ? null : (EarlyGoalsType) CollectionsKt.firstOrNull(earlyGoalsTypeList));
    }
}
