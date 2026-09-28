package defpackage;

import com.sporty.android.book.domain.entity.BetTypeAnyWinConfig;
import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.realsports.EarlyPayoutConfig;
import com.sporty.android.core.model.sportysim.SimOneCutStatus;
import com.sportybet.android.data.GetInsureBetOddsData;
import com.sportybet.android.data.GetInsureBetResult;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class vuo {
    public static final vuo a = new vuo();

    public static final luo a(BetTypeAnyWinConfig betTypeAnyWinConfig, el0 el0Var, lrm lrmVar) {
        lrmVar.getClass();
        if (betTypeAnyWinConfig == null || betTypeAnyWinConfig.getStatus() == 2) {
            return luo.a;
        }
        if (!iu2.m()) {
            return luo.a;
        }
        if (el0Var != el0.a) {
            return (lrmVar.A() && el0Var == el0.b) ? luo.c : luo.b;
        }
        return luo.c;
    }

    public static ArrayList b(List list) {
        ArrayList arrayListA = kw5.a(list);
        for (Object obj : list) {
            if (qz3.f((Selection) obj)) {
                arrayListA.add(obj);
            }
        }
        return arrayListA;
    }

    public static final luo c(EarlyPayoutConfig earlyPayoutConfig, jrm jrmVar) {
        earlyPayoutConfig.getClass();
        try {
            zi50.a aVar = zi50.b;
            if (!iu2.m()) {
                return luo.a;
            }
            if (g2k.c(earlyPayoutConfig)) {
                return jrmVar.I() ? luo.c : luo.b;
            }
            return luo.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return zi50.a(new zi50.b(th)) != null ? luo.a : luo.a;
        }
    }

    public static final luo d(BetTypeFlexiBetConfig betTypeFlexiBetConfig, krm krmVar) {
        krmVar.getClass();
        if (betTypeFlexiBetConfig == null || betTypeFlexiBetConfig.getStatus() == 2) {
            return luo.a;
        }
        iu2 iu2Var = iu2.a;
        if (iu2Var.j().V() || iu2.i() || (krmVar.P() && iu2.m())) {
            return luo.b;
        }
        if ((krmVar.P() && iu2.m()) || iu2Var.j().u0()) {
            return luo.b;
        }
        int size = krmVar.s().size();
        if (size > gvh.b || size <= gvh.a(size)) {
            return luo.b;
        }
        if (betTypeFlexiBetConfig.getStatus() == 1) {
            return iu2Var.j().p() ? luo.b : luo.c;
        }
        return betTypeFlexiBetConfig.getStatus() == 0 ? luo.c : luo.a;
    }

    public static final GetInsureBetResult e(krm krmVar, GetInsureBetOddsData getInsureBetOddsData) {
        int size;
        Object bVar;
        BetTypeAnyWinConfig betTypeAnyWinConfig;
        Object bVar2;
        BigDecimal scale;
        Object bVar3;
        krmVar.getClass();
        int i = getInsureBetOddsData.betType;
        vuo vuoVar = a;
        if (i == 4 || i == 5) {
            vuoVar.getClass();
            GetInsureBetResult getInsureBetResult = new GetInsureBetResult(null, null, 3, null);
            List<? extends Selection> list = getInsureBetOddsData.selections;
            GetInsureBetResult getInsureBetResult2 = getInsureBetResult;
            if (list != null) {
                BetTypeFlexiBetConfig betTypeFlexiBetConfig = getInsureBetOddsData.flexiBetConfig;
                ArrayList arrayListB = b(list);
                if (!arrayListB.isEmpty()) {
                    int i2 = getInsureBetOddsData.betType;
                    if (i2 == 4) {
                        getInsureBetResult2 = getInsureBetResult;
                        getInsureBetResult2 = getInsureBetResult;
                        size = getInsureBetOddsData.flexibleCount;
                    } else if (i2 == 5) {
                        size = arrayListB.size() - 1;
                    }
                    BigDecimal bigDecimal = new BigDecimal(String.valueOf(krmVar.N(size)));
                    getInsureBetResult2 = getInsureBetResult;
                    if (bigDecimal.compareTo(BigDecimal.ZERO) != 0) {
                        try {
                            zi50.a aVar = zi50.b;
                            BigDecimal bigDecimalA = lvh.a(getInsureBetOddsData.isSimMode, arrayListB, betTypeFlexiBetConfig, bigDecimal, getInsureBetOddsData.currentAppVersion);
                            getInsureBetResult2 = getInsureBetResult;
                            if (bigDecimalA != null) {
                                getInsureBetResult.odds = bigDecimalA.divide(bigDecimal, 12, RoundingMode.HALF_UP);
                                getInsureBetResult.oddsKey = bigDecimalA;
                                bVar = getInsureBetResult;
                                Object obj = getInsureBetResult;
                                if (zi50.a(bVar) == null) {
                                    obj = bVar;
                                }
                                getInsureBetResult2 = (GetInsureBetResult) obj;
                            }
                        } catch (Throwable th) {
                            zi50.a aVar2 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                    }
                }
            }
            getInsureBetResult2 = getInsureBetResult;
            return getInsureBetResult2;
        }
        if (i != 6) {
            return null;
        }
        vuoVar.getClass();
        GetInsureBetResult getInsureBetResult3 = new GetInsureBetResult(null, null, 3, null);
        List<? extends Selection> list2 = getInsureBetOddsData.selections;
        if (list2 == null || (betTypeAnyWinConfig = getInsureBetOddsData.anyWinBetConfig) == null) {
            return getInsureBetResult3;
        }
        ArrayList arrayListB2 = b(list2);
        if (arrayListB2.isEmpty()) {
            return getInsureBetResult3;
        }
        BigDecimal oddsKey = betTypeAnyWinConfig.getOddsKeys().get(Integer.valueOf(arrayListB2.size()));
        if (oddsKey == null) {
            oddsKey = betTypeAnyWinConfig.getOddsKey();
        }
        ArrayList arrayList = new ArrayList(l48.r(arrayListB2, 10));
        int size2 = arrayListB2.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayListB2.get(i4);
            i4++;
            Selection selection = (Selection) obj2;
            String str = selection.c.odds;
            arrayList.add((str != null ? new BigDecimal(str) : BigDecimal.ZERO).multiply(new BigDecimal(selection.c.probability)));
        }
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        int size3 = arrayList.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList.get(i5);
            i5++;
            bigDecimalAdd = bigDecimalAdd.add((BigDecimal) obj3);
        }
        try {
            zi50.a aVar3 = zi50.b;
            bVar2 = bigDecimalAdd.divide(new BigDecimal(arrayListB2.size()), 2, RoundingMode.HALF_UP);
        } catch (Throwable th2) {
            zi50.a aVar4 = zi50.b;
            bVar2 = new zi50.b(th2);
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bVar2 instanceof zi50.b) {
            bVar2 = bigDecimal2;
        }
        bVar2.getClass();
        BigDecimal bigDecimalMin = oddsKey.min((BigDecimal) bVar2);
        ArrayList arrayList2 = new ArrayList(l48.r(arrayListB2, 10));
        int size4 = arrayListB2.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = arrayListB2.get(i6);
            i6++;
            arrayList2.add(new BigDecimal(((Selection) obj4).c.probability));
        }
        if (arrayList2.isEmpty()) {
            scale = BigDecimal.ZERO;
            scale.getClass();
        } else {
            BigDecimal bigDecimal3 = BigDecimal.ONE;
            int size5 = arrayList2.size();
            BigDecimal bigDecimalMultiply = bigDecimal3;
            while (i3 < size5) {
                Object obj5 = arrayList2.get(i3);
                i3++;
                bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal3.subtract((BigDecimal) obj5));
            }
            scale = bigDecimal3.subtract(bigDecimalMultiply).setScale(8, RoundingMode.HALF_UP);
            scale.getClass();
        }
        if (scale.compareTo(BigDecimal.ZERO) == 0) {
            return getInsureBetResult3;
        }
        try {
            zi50.a aVar5 = zi50.b;
            getInsureBetResult3.odds = bigDecimalMin.divide(scale, 8, RoundingMode.HALF_UP);
            getInsureBetResult3.oddsKey = bigDecimalMin;
            bVar3 = getInsureBetResult3;
        } catch (Throwable th3) {
            zi50.a aVar6 = zi50.b;
            bVar3 = new zi50.b(th3);
        }
        Object obj6 = getInsureBetResult3;
        if (zi50.a(bVar3) == null) {
            obj6 = bVar3;
        }
        return (GetInsureBetResult) obj6;
    }

    public static final luo f(lq1 lq1Var, bqy bqyVar, krm krmVar) {
        lq1Var.getClass();
        bqyVar.getClass();
        krmVar.getClass();
        boolean zP = iu2.p();
        iu2 iu2Var = iu2.a;
        if (zP) {
            BOConfigParam bOConfigParam = BOConfigParam.SimCutStatus;
            SimOneCutStatus simOneCutStatus = SimOneCutStatus.DISABLED_ALL;
            int iE = qq1.e(lq1Var, bOConfigParam, simOneCutStatus.getValue());
            if (iE == simOneCutStatus.getValue()) {
                return luo.a;
            }
            if (iu2Var.j().u0() || !krmVar.t()) {
                return luo.b;
            }
            if (iu2Var.j().V() || iu2.i() || iu2Var.j().a0()) {
                return luo.b;
            }
            if (iE == SimOneCutStatus.ENABLED_ALL.getValue()) {
                return luo.c;
            }
            if (iE == SimOneCutStatus.ACCESS_WITHOUT_LIVE.getValue()) {
                return iu2Var.j().p() ? luo.b : luo.c;
            }
        } else {
            bqy.a aVar = bqyVar.b;
            if ((aVar == null ? 2 : aVar.a) == 2) {
                return luo.a;
            }
            if (krmVar.P() || !krmVar.t()) {
                return luo.b;
            }
            if (iu2Var.j().V() || iu2.i()) {
                return luo.b;
            }
            bqy.a aVar2 = bqyVar.b;
            if ((aVar2 == null ? 2 : aVar2.a) == 1) {
                return iu2Var.j().p() ? luo.b : luo.c;
            }
            if ((aVar2 != null ? aVar2.a : 2) == 0) {
                return luo.c;
            }
        }
        return luo.b;
    }
}
