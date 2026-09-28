package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballConfig;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballDynamicMultiBetBonusBonusRatio;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class y270 {
    /* JADX WARN: Code duplicated, block: B:75:0x018b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v34, types: [m2g] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.ArrayList] */
    public static final x270 a(NetworkScheduledFootballConfig networkScheduledFootballConfig) {
        BigDecimal bigDecimalG;
        BigDecimal bigDecimalG2;
        BigDecimal bigDecimalG3;
        wr4 bVar;
        Object next;
        ?? arrayList;
        Integer numValueOf;
        Integer numValueOf2;
        networkScheduledFootballConfig.getClass();
        String minStake = networkScheduledFootballConfig.getMinStake();
        if (minStake == null || (bigDecimalG = b.g(minStake)) == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        bigDecimalG.getClass();
        String maxStake = networkScheduledFootballConfig.getMaxStake();
        if (maxStake == null || (bigDecimalG2 = b.g(maxStake)) == null) {
            bigDecimalG2 = BigDecimal.ZERO;
        }
        bigDecimalG2.getClass();
        String maxPayout = networkScheduledFootballConfig.getMaxPayout();
        if (maxPayout == null || (bigDecimalG3 = b.g(maxPayout)) == null) {
            bigDecimalG3 = BigDecimal.ZERO;
        }
        bigDecimalG3.getClass();
        g070 g070Var = new g070(bigDecimalG, bigDecimalG2, bigDecimalG3);
        uag uagVar = wr4.a.e;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            bVar = null;
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
        } while (((wr4.a) next).a != networkScheduledFootballConfig.getBonusType());
        wr4.a aVar = (wr4.a) next;
        if (aVar == null) {
            bVar = wr4.c.a;
        } else {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                wr4.c cVar = wr4.c.a;
                bVar = cVar;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                if (networkScheduledFootballConfig.getDynamicMultiBetBonus() != null && networkScheduledFootballConfig.getDynamicMultiBetBonus().getEnable()) {
                    List<NetworkScheduledFootballDynamicMultiBetBonusBonusRatio> bonusRatios = networkScheduledFootballConfig.getDynamicMultiBetBonus().getBonusRatios();
                    if (bonusRatios != null) {
                        arrayList = new ArrayList(l48.r(bonusRatios, 10));
                        for (NetworkScheduledFootballDynamicMultiBetBonusBonusRatio networkScheduledFootballDynamicMultiBetBonusBonusRatio : bonusRatios) {
                            int selections = networkScheduledFootballDynamicMultiBetBonusBonusRatio.getSelections();
                            Integer numValueOf3 = Integer.valueOf(networkScheduledFootballDynamicMultiBetBonusBonusRatio.getMin());
                            BigDecimal bigDecimal = s5y.a;
                            arrayList.add(new wr4.b.a(selections, new BigDecimal(numValueOf3.toString()), new BigDecimal(Integer.valueOf(networkScheduledFootballDynamicMultiBetBonusBonusRatio.getMax()).toString())));
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = m2g.a;
                    }
                    ?? r10 = arrayList;
                    Iterator it = r10.iterator();
                    if (it.hasNext()) {
                        numValueOf = Integer.valueOf(((wr4.b.a) it.next()).a);
                        while (it.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(((wr4.b.a) it.next()).a);
                            if (numValueOf.compareTo(numValueOf4) > 0) {
                                numValueOf = numValueOf4;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        Iterator it2 = r10.iterator();
                        if (it2.hasNext()) {
                            numValueOf2 = Integer.valueOf(((wr4.b.a) it2.next()).a);
                            while (it2.hasNext()) {
                                Integer numValueOf5 = Integer.valueOf(((wr4.b.a) it2.next()).a);
                                if (numValueOf2.compareTo(numValueOf5) < 0) {
                                    numValueOf2 = numValueOf5;
                                }
                            }
                        } else {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            int iIntValue2 = numValueOf2.intValue();
                            Integer numValueOf6 = Integer.valueOf(networkScheduledFootballConfig.getDynamicMultiBetBonus().getFactor());
                            BigDecimal bigDecimal2 = s5y.a;
                            bVar = new wr4.b(new BigDecimal(numValueOf6.toString()), new BigDecimal(Long.valueOf(networkScheduledFootballConfig.getDynamicMultiBetBonus().getQualifyingOddsLimit()).toString()), iIntValue, iIntValue2, r10);
                        }
                    }
                }
            }
            if (bVar == null) {
                bVar = wr4.c.a;
            }
        }
        wr4 wr4Var = bVar;
        boolean overallActive = networkScheduledFootballConfig.getOverallActive();
        boolean active = networkScheduledFootballConfig.getActive();
        String sportId = networkScheduledFootballConfig.getSportId();
        if (sportId == null) {
            sportId = "";
        }
        return new x270(overallActive, active, sportId, g070Var, wr4Var, networkScheduledFootballConfig.getGift(), networkScheduledFootballConfig.getEventListPageDefaultSpecifier(), networkScheduledFootballConfig.getStatsEnable());
    }
}
