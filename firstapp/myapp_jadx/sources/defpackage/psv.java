package defpackage;

import com.sporty.android.core.model.loyalty.MissionConfig;
import com.sporty.android.core.model.loyalty.MissionCriteria;
import com.sporty.android.core.model.loyalty.MissionData;
import com.sporty.android.core.model.loyalty.MissionProgressDto;
import com.sporty.android.core.model.loyalty.MissionPublishState;
import com.sporty.android.core.model.loyalty.MissionRewardDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.time.b;

/* JADX INFO: loaded from: classes6.dex */
public final class psv {
    public final psm a;

    public psv(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:54:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x012c A[SYNTHETIC] */
    public final ArrayList a(List list) {
        Double betTotal;
        Double d;
        String participationDuration;
        long j;
        Double d2;
        MissionProgressDto mission;
        long unpublishedTime;
        MissionRewardDto missionRewardDto;
        ArrayList arrayList;
        double dDoubleValue;
        rtv rtvVarB;
        list.getClass();
        ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MissionData missionData = (MissionData) it.next();
            MissionConfig missionConfig = missionData.getMissionConfig();
            MissionCriteria parameter = missionConfig.getParameter();
            qtv qtvVar = parameter.getPurchasePayTotal() != null ? qtv.b : parameter.getBetTotal() != null ? qtv.a : qtv.c;
            Long purchasePayTotal = parameter.getPurchasePayTotal();
            Long lValueOf = null;
            if (purchasePayTotal != null) {
                betTotal = Double.valueOf(purchasePayTotal.longValue());
            } else {
                betTotal = parameter.getBetTotal();
                if (betTotal == null) {
                    Integer placeTotal = parameter.getPlaceTotal();
                    if (placeTotal != null) {
                        betTotal = Double.valueOf(placeTotal.intValue());
                    } else {
                        d = null;
                    }
                }
                participationDuration = parameter.getParticipationDuration();
                if (participationDuration != null) {
                    try {
                        b.b.getClass();
                        j = b.j(b.a.a(participationDuration), rgf.DAYS);
                        if (j < 1) {
                            j = 1;
                        }
                        lValueOf = Long.valueOf(j);
                    } catch (Exception e) {
                        itf0.a.f(e, "Failed to parse participationDuration: " + participationDuration + " for mission " + missionConfig.getId(), new Object[0]);
                    }
                }
                Long l = lValueOf;
                d2 = d;
                int id = missionConfig.getId();
                MissionPublishState status = missionConfig.getStatus();
                String title = missionConfig.getContent().getTitle();
                long publishedTime = missionConfig.getPublishedTime();
                String typeDisplay = missionConfig.getContent().getTypeDisplay();
                mission = missionData.getMission();
                if (mission != null) {
                    unpublishedTime = mission.getExpireTime();
                } else {
                    unpublishedTime = missionConfig.getUnpublishedTime();
                }
                String url = parameter.getUrl();
                long lastParticipationTime = parameter.getLastParticipationTime();
                missionRewardDto = (MissionRewardDto) CollectionsKt.firstOrNull(parameter.getRewardList());
                if (missionRewardDto != null || (strF = missionRewardDto.getCurrency()) == null) {
                }
                String str = strF;
                List<MissionRewardDto> rewardList = parameter.getRewardList();
                arrayList = new ArrayList();
                for (MissionRewardDto missionRewardDto2 : rewardList) {
                    missionRewardDto2.getClass();
                    Iterator it2 = it;
                    rtvVarB = vsv.b(missionRewardDto2);
                    if (rtvVarB != null) {
                        arrayList.add(rtvVarB);
                    }
                    it = it2;
                }
                Iterator it3 = it;
                if (d2 != null) {
                    dDoubleValue = d2.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                arrayList2.add(new osv(id, status, title, typeDisplay, l, unpublishedTime, publishedTime, url, lastParticipationTime, str, qtvVar, dDoubleValue, vsv.a(parameter.getBetBuilderTypeList(), parameter.getEarlyGoalsTypeList(), parameter.getUpTypeList(), parameter.getBetTypeList()), parameter.getMinStake(), parameter.getMinTotalOdd(), parameter.getGiftUsage(), parameter.getCashOut(), arrayList, missionData.getCanParticipate(), missionData.getMission()));
                it = it3;
            }
            d = betTotal;
            participationDuration = parameter.getParticipationDuration();
            if (participationDuration != null) {
                b.b.getClass();
                j = b.j(b.a.a(participationDuration), rgf.DAYS);
                if (j < 1) {
                    j = 1;
                }
                lValueOf = Long.valueOf(j);
            }
            Long l2 = lValueOf;
            d2 = d;
            int id2 = missionConfig.getId();
            MissionPublishState status2 = missionConfig.getStatus();
            String title2 = missionConfig.getContent().getTitle();
            long publishedTime2 = missionConfig.getPublishedTime();
            String typeDisplay2 = missionConfig.getContent().getTypeDisplay();
            mission = missionData.getMission();
            if (mission != null) {
                unpublishedTime = mission.getExpireTime();
            } else {
                unpublishedTime = missionConfig.getUnpublishedTime();
            }
            String url2 = parameter.getUrl();
            long lastParticipationTime2 = parameter.getLastParticipationTime();
            missionRewardDto = (MissionRewardDto) CollectionsKt.firstOrNull(parameter.getRewardList());
            String strF = missionRewardDto != null ? this.a.f() : this.a.f();
            String str2 = strF;
            List<MissionRewardDto> rewardList2 = parameter.getRewardList();
            arrayList = new ArrayList();
            while (r21.hasNext()) {
                missionRewardDto2.getClass();
                Iterator it4 = it;
                rtvVarB = vsv.b(missionRewardDto2);
                if (rtvVarB != null) {
                    arrayList.add(rtvVarB);
                }
                it = it4;
            }
            Iterator it5 = it;
            if (d2 != null) {
                dDoubleValue = d2.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            arrayList2.add(new osv(id2, status2, title2, typeDisplay2, l2, unpublishedTime, publishedTime2, url2, lastParticipationTime2, str2, qtvVar, dDoubleValue, vsv.a(parameter.getBetBuilderTypeList(), parameter.getEarlyGoalsTypeList(), parameter.getUpTypeList(), parameter.getBetTypeList()), parameter.getMinStake(), parameter.getMinTotalOdd(), parameter.getGiftUsage(), parameter.getCashOut(), arrayList, missionData.getCanParticipate(), missionData.getMission()));
            it = it5;
        }
        return arrayList2;
    }
}
