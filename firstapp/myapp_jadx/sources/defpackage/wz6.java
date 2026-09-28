package defpackage;

import com.sporty.android.core.model.loyalty.BetBuilderType;
import com.sporty.android.core.model.loyalty.EarlyGoalsType;
import com.sporty.android.core.model.loyalty.UpType;
import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes6.dex */
public final class wz6 {
    public static final BetBuilderType a(String str) {
        Object bVar;
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = BetBuilderType.valueOf(str);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (BetBuilderType) ((Enum) bVar);
    }

    public static final hk2 b(String str) {
        Object bVar;
        Object obj = null;
        if (str != null) {
            try {
                zi50.a aVar = zi50.b;
                bVar = hk2.valueOf(str);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            obj = (Enum) (bVar instanceof zi50.b ? null : bVar);
        }
        hk2 hk2Var = (hk2) obj;
        return hk2Var == null ? hk2.a : hk2Var;
    }

    public static final lx6 c(String str) {
        Object bVar;
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = lx6.valueOf(str);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        lx6 lx6Var = (lx6) ((Enum) bVar);
        return lx6Var == null ? lx6.a : lx6Var;
    }

    public static final mz6 d(String str) {
        Object bVar;
        Object obj = null;
        if (str != null) {
            try {
                zi50.a aVar = zi50.b;
                bVar = mz6.valueOf(str);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            obj = (Enum) (bVar instanceof zi50.b ? null : bVar);
        }
        mz6 mz6Var = (mz6) obj;
        return mz6Var == null ? mz6.b : mz6Var;
    }

    public static final b27 e(String str) {
        Object bVar;
        Object obj = null;
        if (str != null) {
            try {
                zi50.a aVar = zi50.b;
                bVar = b27.valueOf(str);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            obj = (Enum) (bVar instanceof zi50.b ? null : bVar);
        }
        b27 b27Var = (b27) obj;
        return b27Var == null ? b27.d : b27Var;
    }

    public static final ChallengeType f(String str) {
        Object bVar;
        Object obj = null;
        if (str != null) {
            try {
                zi50.a aVar = zi50.b;
                bVar = ChallengeType.valueOf(str);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            obj = (Enum) (bVar instanceof zi50.b ? null : bVar);
        }
        ChallengeType challengeType = (ChallengeType) obj;
        return challengeType == null ? ChallengeType.UNKNOWN : challengeType;
    }

    public static final jx6 g(kx6 kx6Var) {
        ioh0 ioh0Var;
        Object bVar;
        m0u m0uVarA;
        kx6Var.getClass();
        lz6 challengeConfig = kx6Var.getChallengeConfig();
        long id = challengeConfig.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String();
        mz6 mz6VarD = d(challengeConfig.getType());
        b27 b27VarE = e(challengeConfig.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_STATUS java.lang.String());
        List<Integer> listG = challengeConfig.g();
        if (listG == null) {
            listG = m2g.a;
        }
        m0u.a aVar = m0u.b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            aVar.getClass();
            m0u m0uVarA2 = m0u.a.a(iIntValue);
            if (m0uVarA2 != null) {
                arrayList.add(m0uVarA2);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Object obj = null;
        List listC = arrayList;
        if (zIsEmpty) {
            Integer tier = challengeConfig.getTier();
            if (tier != null) {
                m0u.a aVar2 = m0u.b;
                int iIntValue2 = tier.intValue();
                aVar2.getClass();
                m0uVarA = m0u.a.a(iIntValue2);
            } else {
                m0uVarA = null;
            }
            listC = m0uVarA != null ? a.c(m0uVarA) : m2g.a;
        }
        List list = listC;
        String title = challengeConfig.getContent().getTitle();
        String typeDisplay = challengeConfig.getContent().getTypeDisplay();
        ChallengeType challengeTypeF = f(challengeConfig.getParameter().getChallengeType());
        int topRankLimit = challengeConfig.getParameter().getTopRankLimit();
        String url = challengeConfig.getParameter().getUrl();
        long lastParticipationTime = challengeConfig.getParameter().getLastParticipationTime();
        long publishedTime = challengeConfig.getPublishedTime();
        long unpublishedTime = challengeConfig.getUnpublishedTime();
        Integer participantCount = challengeConfig.getParameter().getParticipantCount();
        int iIntValue3 = participantCount != null ? participantCount.intValue() : 0;
        z17 parameter = challengeConfig.getParameter();
        hk2 hk2VarB = b(parameter.getBetCategory());
        List<String> listE = parameter.e();
        if (listE == null) {
            listE = m2g.a;
        }
        List<String> list2 = listE;
        ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m((String) it2.next()));
        }
        List<String> listC2 = parameter.c();
        if (listC2 == null) {
            listC2 = m2g.a;
        }
        ArrayList arrayList3 = new ArrayList(l48.r(listC2, 10));
        Iterator<T> it3 = listC2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(l((String) it3.next()));
        }
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
        List<String> listG2 = parameter.g();
        if (listG2 == null) {
            listG2 = m2g.a;
        }
        ArrayList arrayList4 = new ArrayList(l48.r(listG2, 10));
        Iterator<T> it4 = listG2.iterator();
        while (it4.hasNext()) {
            arrayList4.add(c((String) it4.next()));
        }
        List<String> listA = parameter.a();
        if (listA == null) {
            listA = m2g.a;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it5 = listA.iterator();
        while (it5.hasNext()) {
            BetBuilderType betBuilderTypeA = a((String) it5.next());
            if (betBuilderTypeA != null) {
                arrayList5.add(betBuilderTypeA);
            }
        }
        List<String> listT = parameter.t();
        if (listT == null) {
            listT = m2g.a;
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = listT.iterator();
        while (it6.hasNext()) {
            Iterator it7 = it6;
            UpType upTypeN = n((String) it6.next());
            if (upTypeN != null) {
                arrayList6.add(upTypeN);
            }
            it6 = it7;
        }
        List<String> listK = parameter.k();
        if (listK == null) {
            listK = m2g.a;
        }
        List<String> list5 = listK;
        ArrayList arrayList7 = new ArrayList();
        Iterator<T> it8 = list5.iterator();
        while (it8.hasNext()) {
            ArrayList arrayList8 = arrayList4;
            EarlyGoalsType earlyGoalsTypeK = k((String) it8.next());
            if (earlyGoalsTypeK != null) {
                arrayList7.add(earlyGoalsTypeK);
            }
            arrayList4 = arrayList8;
        }
        t27 t27Var = new t27(hk2VarB, arrayList2, arrayList3, list3, list4, arrayList4, arrayList5, arrayList6, arrayList7, parameter.getMinStake(), parameter.getMinTotalOdds(), parameter.getMaxTotalOdds(), parameter.getGiftUsage(), parameter.getCashOut());
        List<p27> listJ = challengeConfig.getParameter().j();
        ArrayList arrayList9 = new ArrayList(l48.r(listJ, 10));
        Iterator<T> it9 = listJ.iterator();
        while (it9.hasNext()) {
            arrayList9.add(i((p27) it9.next()));
        }
        List<p27> listS = challengeConfig.getParameter().s();
        ArrayList arrayList10 = new ArrayList(l48.r(listS, 10));
        Iterator<T> it10 = listS.iterator();
        while (it10.hasNext()) {
            arrayList10.add(i((p27) it10.next()));
        }
        qw6 qw6Var = new qw6(id, mz6VarD, b27VarE, list, title, typeDisplay, challengeTypeF, topRankLimit, url, lastParticipationTime, publishedTime, unpublishedTime, iIntValue3, t27Var, arrayList9, arrayList10);
        hoh0 challenge = kx6Var.getChallenge();
        if (challenge != null) {
            long j = challenge.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String();
            long challengeId = challenge.getChallengeId();
            String str = challenge.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_STATUS java.lang.String();
            if (str != null) {
                try {
                    zi50.a aVar3 = zi50.b;
                    bVar = joh0.valueOf(str);
                } catch (Throwable th) {
                    zi50.a aVar4 = zi50.b;
                    bVar = new zi50.b(th);
                }
                obj = (Enum) (bVar instanceof zi50.b ? null : bVar);
            }
            joh0 joh0Var = (joh0) obj;
            if (joh0Var == null) {
                joh0Var = joh0.d;
            }
            ioh0Var = new ioh0(j, challengeId, joh0Var, challenge.getAccumulatedAmount(), challenge.getExpireTime(), challenge.getUpdateTime());
        } else {
            ioh0Var = null;
        }
        return new jx6(qw6Var, ioh0Var, kx6Var.getCanParticipate(), kx6Var.getUnlockedLeaderboard());
    }

    public static final k07 h(l07 l07Var) {
        l07Var.getClass();
        g1s selfRanking = l07Var.getSelfRanking();
        f1s f1sVarJ = selfRanking != null ? j(selfRanking) : null;
        List<g1s> listA = l07Var.getRankingList().a();
        ArrayList arrayList = new ArrayList(l48.r(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(j((g1s) it.next()));
        }
        return new k07(f1sVarJ, arrayList, l07Var.getRankingList().getPageNo(), l07Var.getRankingList().getPageSize(), l07Var.getRankingList().getTotalNum());
    }

    public static final j27 i(p27 p27Var) {
        int rewardType = p27Var.getRewardType();
        if (rewardType != 1) {
            if (rewardType != 8) {
                return j27.c.a;
            }
            String customizedText = p27Var.getCustomizedText();
            return new j27.a(customizedText != null ? customizedText : "");
        }
        String referenceId = p27Var.getReferenceId();
        Long rewardAmount = p27Var.getRewardAmount();
        long jLongValue = rewardAmount != null ? rewardAmount.longValue() : 0L;
        String currency = p27Var.getCurrency();
        return new j27.b(jLongValue, referenceId, currency != null ? currency : "");
    }

    public static final f1s j(g1s g1sVar) {
        return new f1s(g1sVar.getUserId(), g1sVar.getRanking(), g1sVar.getAccumulatedAmount(), g1sVar.getNickname(), g1sVar.getPhone(), g1sVar.getEmail(), g1sVar.getAvatar(), g1sVar.getIsSelf());
    }

    public static final EarlyGoalsType k(String str) {
        Object bVar;
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = EarlyGoalsType.valueOf(str);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (EarlyGoalsType) ((Enum) bVar);
    }

    public static final e8o l(String str) {
        Object bVar;
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = e8o.valueOf(str);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        e8o e8oVar = (e8o) ((Enum) bVar);
        return e8oVar == null ? e8o.a : e8oVar;
    }

    public static final r840 m(String str) {
        Object bVar;
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = r840.valueOf(str);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        r840 r840Var = (r840) ((Enum) bVar);
        return r840Var == null ? r840.a : r840Var;
    }

    public static final UpType n(String str) {
        Object bVar;
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = UpType.valueOf(str);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (UpType) ((Enum) bVar);
    }
}
