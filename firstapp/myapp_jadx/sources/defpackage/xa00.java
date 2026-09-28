package defpackage;

import com.sporty.android.core.model.sportysim.SimBonusRatiosData;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xa00 {
    public static final /* synthetic */ int a = 0;

    public static BigDecimal a(int i, List list, List list2) {
        double d;
        double d2;
        double d3;
        double d4;
        int i2;
        BigDecimal bigDecimal;
        double dDoubleValue = nh4.c().a.doubleValue();
        double d5 = 1.0d;
        if (i > 0) {
            Iterator it = list.iterator();
            d2 = 1.0d;
            d3 = 0.0d;
            i2 = 0;
            d4 = 0.0d;
            while (it.hasNext()) {
                lw2.a aVar = (lw2.a) it.next();
                double d6 = Double.parseDouble(aVar.c.odds);
                Iterator it2 = it;
                double d7 = aVar.c.probability;
                if (d6 >= dDoubleValue) {
                    i2++;
                    double d8 = d7 * d6;
                    d5 *= d8;
                    d3 += d8 * d6;
                    d4 += d6;
                    d2 *= d6;
                }
                it = it2;
            }
            d = 0.0d;
        } else {
            d = 0.0d;
            d2 = 1.0d;
            d3 = 0.0d;
            d4 = 0.0d;
            i2 = 0;
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            lw2.a aVar2 = (lw2.a) it3.next();
            double d9 = Double.parseDouble(aVar2.c.odds);
            double d10 = dDoubleValue;
            double d11 = aVar2.c.probability;
            if (d9 >= d10) {
                i2++;
                double d12 = d11 * d9;
                d5 *= d12;
                d4 += d9;
                d2 *= d9;
                d3 = (d12 * d9) + d3;
            }
            dDoubleValue = d10;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        BigDecimal bigDecimalDivide = d4 != d ? new BigDecimal(String.valueOf(d3)).divide(new BigDecimal(String.valueOf(d4)), 4, RoundingMode.HALF_UP) : bigDecimal2;
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d5));
        if (i2 < nh4.c().d) {
            return bigDecimal2;
        }
        itf0.a aVar3 = itf0.a;
        aVar3.q("xa00");
        aVar3.a("bonusOddsCount = %s", Integer.valueOf(i2));
        BigDecimal bigDecimalA = dr4.a(list);
        BigDecimal bigDecimalB = nh4.c().b(i2);
        BigDecimal bigDecimalMultiply = nh4.c().a(i2).multiply(bigDecimalA);
        BigDecimal bigDecimal4 = bigDecimalA;
        double d13 = d2;
        if (list2.size() > 0) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(list2);
            BigDecimal bigDecimalA2 = dr4.a(arrayList);
            BigDecimal bigDecimalMultiply2 = nh4.c().a(i2).multiply(bigDecimalA2);
            aVar3.q("xa00");
            StringBuilder sbA = ffp.a(d5, "system user rtp = ", ", target rtp = ");
            sbA.append(d3);
            sbA.append(", min = ");
            sbA.append(bigDecimalB);
            sbA.append(", max = ");
            sbA.append(bigDecimalMultiply2);
            sbA.append(", multi bonusFactor = ");
            sbA.append(dr4.a(arrayList));
            bigDecimal4 = bigDecimalA2;
            aVar3.a(sbA.toString(), new Object[0]);
            bigDecimal = bigDecimalMultiply2;
        } else {
            bigDecimal = bigDecimalMultiply;
        }
        nh4.c().i = bigDecimal4;
        aVar3.q("xa00");
        StringBuilder sb = new StringBuilder("multi user rtp = ");
        sb.append(d5);
        hib0.b(d3, ", target rtp = ", ", min = ", sb);
        iib0.b(sb, bigDecimalB, ", max = ", bigDecimal, ", multi bonusFactor = ");
        sb.append(dr4.a(list));
        aVar3.a(sb.toString(), new Object[0]);
        BigDecimal bigDecimalC = c(bigDecimal3, bigDecimalDivide, nh4.c().e, bigDecimalB, bigDecimal);
        BigDecimal bigDecimalMultiply3 = new BigDecimal(String.valueOf(d13)).multiply(bigDecimalC);
        aVar3.q("xa00");
        aVar3.a("oddsMul = " + d13 + ", percent = " + bigDecimalC + ", bonus = " + bigDecimalMultiply3, new Object[0]);
        return bigDecimalMultiply3;
    }

    public static BigDecimal b(List<Selection> list) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(10000L);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
        BigDecimal bigDecimalDivide = new BigDecimal(SimShareData.INSTANCE.getMultiBetBonusQualifyingOddsLimit()).divide(bigDecimalValueOf, 2, RoundingMode.HALF_UP);
        BigDecimal bigDecimalAdd = bigDecimal;
        BigDecimal bigDecimalAdd2 = bigDecimalAdd;
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply;
        int i = 0;
        for (Selection selection : list) {
            boolean zB = qz3.b(selection);
            Outcome outcome = selection.c;
            if (zB) {
                BigDecimal bigDecimal2 = new BigDecimal(outcome.odds);
                BigDecimal bigDecimal3 = new BigDecimal(outcome.probability);
                if (bigDecimal2.compareTo(bigDecimalDivide) >= 0) {
                    i++;
                    BigDecimal bigDecimalMultiply3 = bigDecimal2.multiply(bigDecimal3);
                    bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimalMultiply3);
                    bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply3.multiply(bigDecimal2));
                    bigDecimalAdd2 = bigDecimalAdd2.add(bigDecimal2);
                    bigDecimalMultiply2 = bigDecimalMultiply2.multiply(bigDecimal2);
                }
            }
        }
        SimShareData simShareData = SimShareData.INSTANCE;
        if (simShareData.getMultiBetBonusRatio().get(Integer.valueOf(i)) == null) {
            return bigDecimal;
        }
        itf0.a aVar = itf0.a;
        aVar.q("xa00");
        aVar.a("bonusOddsCount = %s", Integer.valueOf(i));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal bigDecimalDivide2 = bigDecimalAdd.divide(bigDecimalAdd2, 4, roundingMode);
        SimBonusRatiosData simBonusRatiosData = simShareData.getMultiBetBonusRatio().get(Integer.valueOf(i));
        BigDecimal bigDecimalDivide3 = BigDecimal.valueOf(simBonusRatiosData.getMin()).divide(bigDecimalValueOf, 2, roundingMode);
        BigDecimal bigDecimalDivide4 = BigDecimal.valueOf(simBonusRatiosData.getMax()).divide(bigDecimalValueOf, 2, roundingMode);
        aVar.q("xa00");
        StringBuilder sb = new StringBuilder("user rtp = ");
        sb.append(bigDecimalMultiply);
        sb.append(", target rtp = ");
        iib0.b(sb, bigDecimalDivide2, ", min = ", bigDecimalDivide3, ", max = ");
        sb.append(bigDecimalDivide4);
        aVar.a(sb.toString(), new Object[0]);
        BigDecimal bigDecimalC = c(bigDecimalMultiply, bigDecimalDivide2, new BigDecimal(simShareData.getMultiBetBonusFactor()).divide(bigDecimalValueOf, 2, roundingMode), bigDecimalDivide3, bigDecimalDivide4);
        BigDecimal bigDecimalMultiply4 = bigDecimalMultiply2.multiply(bigDecimalC);
        aVar.q("xa00");
        StringBuilder sb2 = new StringBuilder("oddsMul = ");
        sb2.append(bigDecimalMultiply2);
        sb2.append(", percent = ");
        sb2.append(bigDecimalC);
        sb2.append(", bonus = ");
        sb2.append(bigDecimalMultiply4);
        sb2.append(", DynamicFactor = ");
        aVar.a(mh2.a(" No Stake", sb2, nh4.c().e), new Object[0]);
        return bigDecimalMultiply4;
    }

    public static BigDecimal c(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
        BigDecimal bigDecimalSubtract = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) < 0) {
            try {
                bigDecimalSubtract = bigDecimal2.multiply(bigDecimal3).divide(bigDecimal, 2, RoundingMode.FLOOR).subtract(BigDecimal.ONE);
            } catch (Exception unused) {
                bigDecimalSubtract = bigDecimal5;
            }
        }
        if (bigDecimal4.compareTo(bigDecimal5) <= 0) {
            if (bigDecimalSubtract.compareTo(bigDecimal5) > 0) {
                return bigDecimal5;
            }
            if (bigDecimalSubtract.compareTo(bigDecimal4) >= 0) {
                return bigDecimalSubtract;
            }
        }
        return bigDecimal4;
    }

    public static BigDecimal d(int i, Map map, List list) {
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        if (i == 0) {
            return a(0, new ArrayList(), list);
        }
        if (i > 0) {
            HashMap map2 = new HashMap(map);
            ArrayList arrayList = new ArrayList(map2.keySet());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = map2.values().iterator();
            while (it.hasNext()) {
                arrayList2.add(new ArrayList((HashSet) it.next()));
            }
            ArrayList arrayList3 = new ArrayList();
            lw2.d.k(arrayList3, i, arrayList.size());
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                List list2 = (List) obj;
                if (list2.size() > 0) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add((List) arrayList2.get(((Integer) it2.next()).intValue()));
                    }
                    ArrayList arrayListF = f(arrayList4);
                    int size2 = arrayListF.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj2 = arrayListF.get(i3);
                        i3++;
                        bigDecimalAdd = bigDecimalAdd.add(a(i, (List) obj2, list));
                    }
                }
            }
        }
        return bigDecimalAdd;
    }

    public static BigDecimal e(int i, int i2, Map map, BigDecimal bigDecimal) {
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        lw2 lw2Var = lw2.d;
        if (i == 0) {
            BigDecimal bigDecimalD = nh4.c().d(lw2Var.x());
            if (bigDecimalD != null && bigDecimalD.compareTo(bigDecimalAdd) > 0) {
                return bigDecimal.multiply(bigDecimalD);
            }
        } else if (i > 0 && i + i2 >= nh4.c().d) {
            ArrayList arrayList = new ArrayList(map.keySet());
            ArrayList arrayList2 = new ArrayList();
            for (HashSet hashSet : map.values()) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new BigDecimal(((lw2.a) it.next()).c.odds));
                }
                arrayList2.add(arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            lw2Var.k(arrayList4, i, arrayList.size());
            int size = arrayList4.size();
            int i3 = 0;
            loop2: while (i3 < size) {
                Object obj = arrayList4.get(i3);
                i3++;
                List list = (List) obj;
                if (list.size() > 0) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add((List) arrayList2.get(((Integer) it2.next()).intValue()));
                    }
                    ArrayList arrayListF = f(arrayList5);
                    int size2 = arrayListF.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayListF.get(i4);
                        i4++;
                        List<BigDecimal> list2 = (List) obj2;
                        BigDecimal bigDecimalMultiply = BigDecimal.ZERO;
                        if (i > 0) {
                            BigDecimal bigDecimalMultiply2 = BigDecimal.ONE;
                            BigDecimal bigDecimal2 = nh4.c().a;
                            int i5 = 0;
                            for (BigDecimal bigDecimal3 : list2) {
                                if (bigDecimal3 != null && bigDecimal2 != null && bigDecimal3.compareTo(bigDecimal2) >= 0) {
                                    i5++;
                                }
                                bigDecimalMultiply2 = bigDecimalMultiply2.multiply(bigDecimal3);
                            }
                            BigDecimal bigDecimalMultiply3 = bigDecimalMultiply2.multiply(bigDecimal);
                            BigDecimal bigDecimalD2 = nh4.c().d(i5 + i2);
                            if (bigDecimalD2 != null && bigDecimalD2.compareTo(BigDecimal.ZERO) > 0) {
                                bigDecimalMultiply = bigDecimalMultiply3.multiply(bigDecimalD2);
                            }
                        }
                        bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply);
                        if (bigDecimalAdd.compareTo(ird0.a().e()) >= 0) {
                            break loop2;
                        }
                    }
                }
            }
        }
        return bigDecimalAdd;
    }

    public static ArrayList f(List list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() == 0) {
            arrayList.add(new ArrayList());
            return arrayList;
        }
        List list2 = (List) list.get(0);
        ArrayList arrayListF = f(list.subList(1, list.size()));
        for (Object obj : list2) {
            int size = arrayListF.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayListF.get(i);
                i++;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(obj);
                arrayList2.addAll((List) obj2);
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }
}
