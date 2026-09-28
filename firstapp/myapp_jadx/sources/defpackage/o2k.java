package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o2k {
    public final Object a;

    public o2k(mgb0 mgb0Var) {
        mgb0Var.getClass();
        this.a = mgb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    public uxt a(xxt xxtVar) {
        ?? arrayList;
        ?? arrayList2;
        xxtVar.getClass();
        List<j230> listC = xxtVar.c();
        ArrayList arrayList3 = new ArrayList(l48.r(listC, 10));
        for (j230 j230Var : listC) {
            String batchId = j230Var.getBatchId();
            int i = j230Var.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_STATUS java.lang.String();
            String currency = j230Var.getCurrency();
            long startTime = j230Var.getStartTime();
            long endTime = j230Var.getEndTime();
            Long potentialReward = j230Var.getPotentialReward();
            long jLongValue = potentialReward != null ? potentialReward.longValue() : 0L;
            Long claimedAmount = j230Var.getClaimedAmount();
            Long claimedTime = j230Var.getClaimedTime();
            Long lastClaimedTime = j230Var.getLastClaimedTime();
            String userId = j230Var.getUserId();
            boolean isDaily = j230Var.getIsDaily();
            jnc dailyRecordContent = j230Var.getDailyRecordContent();
            arrayList3.add(new yxt(batchId, i, currency, startTime, endTime, jLongValue, claimedAmount, claimedTime, lastClaimedTime, userId, isDaily, dailyRecordContent != null ? new knc(dailyRecordContent.getIsAccumulate(), dailyRecordContent.getDailyRewardStartDate(), dailyRecordContent.getDailyRewardEndDate()) : null));
        }
        ArrayList arrayListA = ((rlw) this.a).a(xxtVar.b());
        List<zrt> listA = xxtVar.a();
        ArrayList arrayList4 = new ArrayList(l48.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            zrt zrtVar = (zrt) it.next();
            long j = zrtVar.getChallengeConfig().getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String();
            String type = zrtVar.getChallengeConfig().getType();
            String str = zrtVar.getChallengeConfig().getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_STATUS java.lang.String();
            String title = zrtVar.getChallengeConfig().getContent().getTitle();
            String typeDisplay = zrtVar.getChallengeConfig().getContent().getTypeDisplay();
            long publishedTime = zrtVar.getChallengeConfig().getPublishedTime();
            long unpublishedTime = zrtVar.getChallengeConfig().getUnpublishedTime();
            xrt parameter = zrtVar.getChallengeConfig().getParameter();
            String challengeType = parameter.getChallengeType();
            int topRanking = parameter.getTopRanking();
            String url = parameter.getUrl();
            long lastParticipationTime = parameter.getLastParticipationTime();
            String betCategory = parameter.getBetCategory();
            List<String> listE = parameter.e();
            if (listE == null) {
                listE = m2g.a;
            }
            List<String> list = listE;
            List<String> listC2 = parameter.c();
            if (listC2 == null) {
                listC2 = m2g.a;
            }
            List<String> list2 = listC2;
            List<String> listF = parameter.f();
            if (listF == null) {
                listF = m2g.a;
            }
            List<String> list3 = listF;
            List<String> listD = parameter.d();
            if (listD == null) {
                listD = m2g.a;
            }
            List<String> list4 = listD;
            List<String> listG = parameter.g();
            List<String> listA2 = parameter.a();
            if (listA2 == null) {
                listA2 = m2g.a;
            }
            List<String> list5 = listA2;
            List<String> listT = parameter.t();
            if (listT == null) {
                listT = m2g.a;
            }
            List<String> list6 = listT;
            List<String> listK = parameter.k();
            if (listK == null) {
                listK = m2g.a;
            }
            List<String> list7 = listK;
            Long minStake = parameter.getMinStake();
            Double minTotalOdd = parameter.getMinTotalOdd();
            Double maxTotalOdd = parameter.getMaxTotalOdd();
            Boolean giftUsage = parameter.getGiftUsage();
            Boolean cashOut = parameter.getCashOut();
            List<o27> listJ = parameter.j();
            Iterator it2 = it;
            if (listJ != null) {
                arrayList = new ArrayList(l48.r(listJ, 10));
                for (o27 o27Var : listJ) {
                    arrayList.add(new k27(o27Var.getRewardType(), o27Var.getReferenceId(), o27Var.getRewardAmount(), o27Var.getCurrency(), o27Var.getCustomizedText()));
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = m2g.a;
            }
            ?? r39 = arrayList;
            List<o27> listS = parameter.s();
            if (listS != null) {
                arrayList2 = new ArrayList(l48.r(listS, 10));
                for (o27 o27Var2 : listS) {
                    arrayList2.add(new k27(o27Var2.getRewardType(), o27Var2.getReferenceId(), o27Var2.getRewardAmount(), o27Var2.getCurrency(), o27Var2.getCustomizedText()));
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = m2g.a;
            }
            arrayList4.add(new urt(j, type, str, title, typeDisplay, publishedTime, unpublishedTime, new yrt(challengeType, topRanking, url, lastParticipationTime, betCategory, list, list2, list3, list4, listG, list5, list6, list7, minStake, minTotalOdd, maxTotalOdd, giftUsage, cashOut, r39, arrayList2, parameter.getParticipantCount()), zrtVar.getCanParticipate()));
            it = it2;
        }
        List<zw3> listD2 = xxtVar.d();
        if (listD2 == null) {
            listD2 = m2g.a;
        }
        ArrayList arrayList5 = new ArrayList(l48.r(listD2, 10));
        Iterator it3 = listD2.iterator();
        while (it3.hasNext()) {
            arrayList5.add(jy8.a((zw3) it3.next()));
        }
        return new uxt(arrayList3, arrayListA, arrayList4, arrayList5);
    }

    public o2k(jy8 jy8Var, rlw rlwVar) {
        rlwVar.getClass();
        this.a = rlwVar;
    }
}
