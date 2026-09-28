package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.BonusRatio;
import com.sportybet.android.instantwin.newtork.model.response.DynamicMultiBetBonus;
import com.sportybet.android.instantwin.newtork.model.response.MultiBetBonus;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class sqf0 {
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    public static final InstantWinGiftApplicabilityContext a(o4p o4pVar, boolean z, boolean z2, ji2 ji2Var, String str) {
        BigDecimal bigDecimal;
        InstantWinGiftApplicabilityContext.BetCount single;
        InstantWinGiftApplicabilityContext.BetSlipType single2;
        o4pVar.getClass();
        ji2Var.getClass();
        if (str != null) {
            bigDecimal = str.length() == 0 ? BigDecimal.ZERO : new BigDecimal(str);
        } else {
            bigDecimal = o4pVar.j;
        }
        ArrayList arrayList = o4pVar.d;
        if (arrayList.size() > 1) {
            single = InstantWinGiftApplicabilityContext.BetCount.Multiple.a;
        } else if (arrayList.size() == 1) {
            CollectionsKt.p0(arrayList);
            int i = 0;
            ArrayList arrayList2 = ((o4p.a) arrayList.get(0)).b;
            int size = arrayList2.size();
            if (!arrayList2.isEmpty()) {
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    if (ji2Var.b(((o4p.b) obj).a.marketId) && (i = i + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            }
            single = new InstantWinGiftApplicabilityContext.BetCount.Single(size, i);
        } else {
            single = null;
        }
        if (single != null) {
            String str2 = o4pVar.a;
            int iHashCode = str2.hashCode();
            if (iHashCode != -902265784) {
                if (iHashCode != -887328209) {
                    if (iHashCode == 653829648 && str2.equals(SimulateBetConsts.BetslipType.MULTIPLE)) {
                        bigDecimal.getClass();
                        single2 = new InstantWinGiftApplicabilityContext.BetSlipType.Multiple(bigDecimal, single, z, z2);
                    } else {
                        single2 = null;
                    }
                } else if (str2.equals("system")) {
                    bigDecimal.getClass();
                    single2 = new InstantWinGiftApplicabilityContext.BetSlipType.System(bigDecimal);
                } else {
                    single2 = null;
                }
            } else if (str2.equals(SimulateBetConsts.BetslipType.SINGLE)) {
                bigDecimal.getClass();
                single2 = new InstantWinGiftApplicabilityContext.BetSlipType.Single(bigDecimal, single);
            } else {
                single2 = null;
            }
            if (single2 != null) {
                return new InstantWinGiftApplicabilityContext(single2);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final TicketParameter b(String str, String str2, o4p o4pVar, boolean z, boolean z2, spi spiVar, BigDecimal bigDecimal, int i, MultiBetBonus multiBetBonus, DynamicMultiBetBonus dynamicMultiBetBonus, m780 m780Var) {
        String str3;
        String str4;
        Object cutBet;
        ArrayList arrayList;
        int i2;
        BigDecimal bigDecimalMin;
        String giftId;
        int kind;
        BigDecimal oddsThreshold;
        BigDecimal scale;
        BigDecimal scale2;
        BigDecimal bigDecimalMultiply;
        int i3 = i;
        MultiBetBonus multiBetBonus2 = multiBetBonus;
        str.getClass();
        str2.getClass();
        o4pVar.getClass();
        spiVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String str5 = o4pVar.a;
        ArrayList arrayList4 = o4pVar.d;
        if (str5.equals(SimulateBetConsts.BetslipType.SINGLE)) {
            ArrayList arrayList5 = new ArrayList();
            int size = arrayList4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList4.get(i4);
                i4++;
                if (((o4p.a) obj).a.compareTo(BigDecimal.ZERO) > 0) {
                    arrayList5.add(obj);
                }
            }
            str3 = null;
            int size2 = arrayList5.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList5.get(i6);
                int i7 = i6 + 1;
                int i8 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                o4p.a aVar = (o4p.a) obj2;
                ArrayList arrayList6 = arrayList5;
                BigDecimal bigDecimal2 = aVar.a;
                ArrayList arrayList7 = aVar.b;
                arrayList3.add(new TicketParameter.Bet.Single(arrayList7.size(), bigDecimal2.multiply(geo.a).setScale(2, RoundingMode.HALF_UP).longValue(), i5));
                BetSlipData betSlipData = ((o4p.b) arrayList7.get(0)).a;
                String str6 = betSlipData.eventId;
                str6.getClass();
                String str7 = betSlipData.marketId;
                str7.getClass();
                String str8 = betSlipData.outcomeId;
                str8.getClass();
                arrayList2.add(new TicketParameter.Selection(str6, str7, str8));
                arrayList5 = arrayList6;
                size2 = size2;
                i6 = i7;
                i5 = i8;
            }
        } else {
            str3 = null;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            int size3 = arrayList4.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList4.get(i9);
                int i10 = i9 + 1;
                o4p.a aVar2 = (o4p.a) obj3;
                ArrayList arrayList8 = aVar2.b;
                int i11 = size3;
                ArrayList arrayList9 = aVar2.b;
                int size4 = arrayList8.size();
                if (!linkedHashSet.contains(Integer.valueOf(size4)) && aVar2.a.compareTo(BigDecimal.ZERO) > 0) {
                    linkedHashSet.add(Integer.valueOf(size4));
                    arrayList3.add(new TicketParameter.Bet.NonSingle(arrayList9.size(), aVar2.a.multiply(geo.a).setScale(2, RoundingMode.HALF_UP).longValue()));
                }
                int size5 = arrayList9.size();
                int i12 = 0;
                while (i12 < size5) {
                    Object obj4 = arrayList9.get(i12);
                    i12++;
                    o4p.b bVar = (o4p.b) obj4;
                    if (!linkedHashSet2.contains(bVar.b)) {
                        linkedHashSet2.add(bVar.b);
                        BetSlipData betSlipData2 = bVar.a;
                        int i13 = size5;
                        String str9 = betSlipData2.eventId;
                        str9.getClass();
                        LinkedHashSet linkedHashSet3 = linkedHashSet2;
                        String str10 = betSlipData2.marketId;
                        str10.getClass();
                        String str11 = betSlipData2.outcomeId;
                        str11.getClass();
                        arrayList2.add(new TicketParameter.Selection(str9, str10, str11));
                        size5 = i13;
                        linkedHashSet2 = linkedHashSet3;
                    }
                }
                size3 = i11;
                i9 = i10;
                linkedHashSet = linkedHashSet;
            }
        }
        if (z) {
            str4 = SimulateBetConsts.BetslipType.FLEX;
        } else {
            str4 = z2 ? SimulateBetConsts.BetslipType.CUTBET : str3;
        }
        String str12 = (!str5.equals(SimulateBetConsts.BetslipType.MULTIPLE) || str4 == null) ? str5 : str4;
        int i14 = str12.equals(SimulateBetConsts.BetslipType.FLEX) ? spiVar.h : 0;
        long jA = 0;
        if (str12.equals(SimulateBetConsts.BetslipType.CUTBET)) {
            fqy fqyVar = spiVar.g;
            long jLongValue = fqyVar != null ? fqyVar.f.longValue() : 0L;
            fqy fqyVar2 = spiVar.g;
            cutBet = new TicketParameter.CutBet(jLongValue, fqyVar2 != null ? fqyVar2.e.longValue() : 0L);
        } else {
            arrayList2 = arrayList2;
            arrayList3 = arrayList3;
            i14 = i14;
            cutBet = str3;
        }
        boolean z3 = multiBetBonus2 != null ? multiBetBonus2.enable : false;
        if (str12.equals(SimulateBetConsts.BetslipType.SINGLE) || str12.equals(SimulateBetConsts.BetslipType.FLEX)) {
            arrayList = arrayList2;
            i2 = 0;
            bigDecimalMin = BigDecimal.ZERO;
        } else {
            BigDecimal bigDecimalAdd = BigDecimal.ZERO;
            if (i3 == 2) {
                if (dynamicMultiBetBonus == null || (oddsThreshold = dynamicMultiBetBonus.getOddsThreshold()) == null) {
                    oddsThreshold = bigDecimalAdd;
                }
                oddsThreshold.getClass();
            } else {
                if (multiBetBonus2 == null || (oddsThreshold = multiBetBonus2.getOddsThreshold()) == null) {
                    oddsThreshold = bigDecimalAdd;
                }
                oddsThreshold.getClass();
            }
            BigDecimal bigDecimal3 = oddsThreshold;
            int size6 = arrayList4.size();
            int i15 = 0;
            while (i15 < size6) {
                int i16 = i15 + 1;
                o4p.a aVar3 = (o4p.a) arrayList4.get(i15);
                BigDecimal bigDecimal4 = BigDecimal.ONE;
                ArrayList arrayList10 = aVar3.b;
                int size7 = arrayList10.size();
                ArrayList arrayList11 = arrayList4;
                int i17 = 0;
                while (i17 < size7) {
                    Object obj5 = arrayList10.get(i17);
                    int i18 = i17 + 1;
                    ArrayList arrayList12 = arrayList2;
                    BigDecimal bigDecimal5 = new BigDecimal(((o4p.b) obj5).a.odds);
                    if ((i3 == 2 && bigDecimal5.compareTo(bigDecimal3) >= 0) || i3 != 2) {
                        BigDecimal bigDecimalMultiply2 = bigDecimal4.multiply(bigDecimal5);
                        bigDecimal4 = bigDecimalMultiply2;
                    }
                    i17 = i18;
                    arrayList2 = arrayList12;
                }
                bigDecimalAdd = bigDecimalAdd.add(BigDecimal.ONE.multiply(bigDecimal4).multiply(aVar3.a).multiply(c(arrayList10.size(), arrayList10, i3, multiBetBonus2, dynamicMultiBetBonus, str, str2)));
                arrayList2 = arrayList2;
                i3 = i;
                multiBetBonus2 = multiBetBonus;
                i15 = i16;
                arrayList4 = arrayList11;
            }
            arrayList = arrayList2;
            BigDecimal bigDecimal6 = bigDecimalAdd;
            if (bigDecimal == null || (bigDecimalMultiply = bigDecimal.multiply(geo.a)) == null) {
                i2 = 0;
            } else {
                i2 = 0;
                scale = bigDecimalMultiply.setScale(0, RoundingMode.HALF_DOWN);
                if (scale == null) {
                }
                scale2 = bigDecimal6.multiply(geo.a).setScale(i2, RoundingMode.HALF_DOWN);
                if (scale2 == null) {
                    scale2 = BigDecimal.ZERO;
                }
                bigDecimalMin = scale2.min(scale);
                bigDecimalMin.getClass();
            }
            scale = BigDecimal.ZERO;
            scale2 = bigDecimal6.multiply(geo.a).setScale(i2, RoundingMode.HALF_DOWN);
            if (scale2 == null) {
                scale2 = BigDecimal.ZERO;
            }
            bigDecimalMin = scale2.min(scale);
            bigDecimalMin.getClass();
        }
        if (m780Var != null) {
            GiftDetails giftDetails = m780Var.b;
            if (z2) {
                giftId = "";
                kind = i2;
            } else {
                giftId = giftDetails.getGiftId();
                kind = giftDetails.getKind();
                jA = m780Var.a();
            }
        } else {
            giftId = "";
            kind = i2;
        }
        BigDecimal bigDecimal7 = bigDecimalMin;
        bigDecimal7.getClass();
        return new TicketParameter(str, str2, str12, arrayList, arrayList3, i14, cutBet, i, z3, bigDecimal7, giftId, kind, jA);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x019e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static BigDecimal c(int i, List list, int i2, MultiBetBonus multiBetBonus, DynamicMultiBetBonus dynamicMultiBetBonus, String str, String str2) {
        BigDecimal ratio;
        BigDecimal oddsThreshold;
        Object obj;
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimal;
        Iterator it;
        Object bVar;
        Throwable thA;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        String string;
        list.getClass();
        if (i2 != 2) {
            if (multiBetBonus == null || (ratio = multiBetBonus.getRatio(i)) == null) {
                ratio = BigDecimal.ZERO;
            }
            ratio.getClass();
            return ratio;
        }
        if (list.isEmpty()) {
            BigDecimal bigDecimal4 = BigDecimal.ZERO;
            bigDecimal4.getClass();
            return bigDecimal4;
        }
        BigDecimal bigDecimal5 = BigDecimal.ONE;
        BigDecimal bigDecimal6 = BigDecimal.ZERO;
        if (dynamicMultiBetBonus == null || (oddsThreshold = dynamicMultiBetBonus.getOddsThreshold()) == null) {
            bigDecimal6.getClass();
            return bigDecimal6;
        }
        Iterator it2 = list.iterator();
        BigDecimal bigDecimalMultiply = bigDecimal5;
        BigDecimal bigDecimal7 = bigDecimal6;
        BigDecimal bigDecimal8 = bigDecimal7;
        int i3 = 0;
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply;
        while (it2.hasNext()) {
            o4p.b bVar2 = (o4p.b) it2.next();
            try {
                zi50.a aVar = zi50.b;
                BetSlipData betSlipData = bVar2.a;
                List listK = b.k(new Pair("odds", betSlipData.odds), new Pair("probability", betSlipData.probability));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listK) {
                    String str3 = (String) ((Pair) obj2).b;
                    if (((str3 == null || (string = StringsKt.t0(str3).toString()) == null) ? null : kotlin.text.b.g(string)) == null) {
                        arrayList.add(obj2);
                    }
                }
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    Pair pair = (Pair) obj3;
                    String str4 = (String) pair.a;
                    String str5 = (String) pair.b;
                    xdp xdpVar = new xdp();
                    int i5 = size;
                    xdpVar.i("fieldName", str4);
                    it = it2;
                    try {
                        xdpVar.i("fieldValue", str5 == null ? "" : str5);
                        xdpVar.i("sportId", str == null ? "" : str);
                        xdpVar.i("roundId", str2 == null ? "" : str2);
                        String str6 = betSlipData.eventId;
                        if (str6 == null) {
                            str6 = "";
                        }
                        xdpVar.i(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, str6);
                        String str7 = betSlipData.marketId;
                        if (str7 == null) {
                            str7 = "";
                        }
                        xdpVar.i("marketId", str7);
                        String str8 = betSlipData.outcomeId;
                        if (str8 == null) {
                            str8 = "";
                        }
                        xdpVar.i("outcomeId", str8);
                        gph gphVarA = gph.a();
                        if (str5 == null) {
                            str5 = "";
                        }
                        NumberFormatException numberFormatException = new NumberFormatException("Invalid dynamic bonus input: " + str4 + " = " + str5);
                        numberFormatException.setStackTrace(new StackTraceElement[]{new StackTraceElement("Invalid dynamic bonus input in calculateDynamicBonusPercentage", xdpVar.toString(), numberFormatException.getMessage(), 0)});
                        gphVarA.b(numberFormatException);
                        size = i5;
                        it2 = it;
                        betSlipData = betSlipData;
                        arrayList = arrayList;
                    } catch (Throwable th) {
                        th = th;
                        zi50.a aVar2 = zi50.b;
                        bVar = new zi50.b(th);
                        thA = zi50.a(bVar);
                        if (thA != null) {
                            itf0.a aVar3 = itf0.a;
                            aVar3.q(MyLog.TAG_IV_DMBB);
                            aVar3.f(thA, "Failed to track invalid dynamic bonus input", new Object[0]);
                        }
                        String str9 = bVar2.a.odds;
                        str9.getClass();
                        bigDecimal2 = new BigDecimal(StringsKt.t0(str9).toString());
                        String str10 = bVar2.a.probability;
                        str10.getClass();
                        bigDecimal3 = new BigDecimal(StringsKt.t0(str10).toString());
                        if (bigDecimal2.compareTo(oddsThreshold) >= 0) {
                            i3++;
                            BigDecimal bigDecimalMultiply3 = bigDecimal2.multiply(bigDecimal3);
                            bigDecimalMultiply2 = bigDecimalMultiply2.multiply(bigDecimalMultiply3);
                            BigDecimal bigDecimalAdd = bigDecimal7.add(bigDecimalMultiply3.multiply(bigDecimal2));
                            BigDecimal bigDecimalAdd2 = bigDecimal8.add(bigDecimal2);
                            bigDecimal7 = bigDecimalAdd;
                            bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal2);
                            bigDecimal8 = bigDecimalAdd2;
                        }
                        it2 = it;
                    }
                }
                it = it2;
                bVar = Unit.a;
            } catch (Throwable th2) {
                th = th2;
                it = it2;
            }
            thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar4 = itf0.a;
                aVar4.q(MyLog.TAG_IV_DMBB);
                aVar4.f(thA, "Failed to track invalid dynamic bonus input", new Object[0]);
            }
            String str11 = bVar2.a.odds;
            str11.getClass();
            bigDecimal2 = new BigDecimal(StringsKt.t0(str11).toString());
            String str12 = bVar2.a.probability;
            str12.getClass();
            bigDecimal3 = new BigDecimal(StringsKt.t0(str12).toString());
            if (bigDecimal2.compareTo(oddsThreshold) >= 0) {
                i3++;
                BigDecimal bigDecimalMultiply4 = bigDecimal2.multiply(bigDecimal3);
                bigDecimalMultiply2 = bigDecimalMultiply2.multiply(bigDecimalMultiply4);
                BigDecimal bigDecimalAdd3 = bigDecimal7.add(bigDecimalMultiply4.multiply(bigDecimal2));
                BigDecimal bigDecimalAdd4 = bigDecimal8.add(bigDecimal2);
                bigDecimal7 = bigDecimalAdd3;
                bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal2);
                bigDecimal8 = bigDecimalAdd4;
            }
            it2 = it;
        }
        Iterator<T> it3 = dynamicMultiBetBonus.getBonusRatios().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            Object next = it3.next();
            if (((BonusRatio) next).getSelections() == i3) {
                obj = next;
                break;
            }
        }
        BonusRatio bonusRatio = (BonusRatio) obj;
        if (bonusRatio == null) {
            BigDecimal bigDecimal9 = BigDecimal.ZERO;
            bigDecimal9.getClass();
            return bigDecimal9;
        }
        itf0.a aVar5 = itf0.a;
        aVar5.q(MyLog.TAG_IV_DMBB);
        aVar5.a("bonusOddsCount = " + i3, new Object[0]);
        BigDecimal bigDecimal10 = BigDecimal.ZERO;
        if (bigDecimal8.compareTo(bigDecimal10) == 0) {
            bigDecimal10.getClass();
        } else {
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            BigDecimal bigDecimalDivide = bigDecimal7.divide(bigDecimal8, 4, roundingMode);
            BigDecimal bigDecimal11 = new BigDecimal(bonusRatio.getMin());
            BigDecimal bigDecimal12 = geo.a;
            BigDecimal bigDecimalDivide2 = bigDecimal11.divide(bigDecimal12, 2, roundingMode);
            BigDecimal bigDecimalDivide3 = new BigDecimal(bonusRatio.getMax()).divide(bigDecimal12, 2, roundingMode);
            aVar5.q(MyLog.TAG_IV_DMBB);
            StringBuilder sb = new StringBuilder("user rtp = ");
            sb.append(bigDecimalMultiply2);
            sb.append(", target rtp = ");
            iib0.b(sb, bigDecimalDivide, ", min = ", bigDecimalDivide2, ", max = ");
            sb.append(bigDecimalDivide3);
            aVar5.a(sb.toString(), new Object[0]);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dynamicMultiBetBonus.getFactor());
            bigDecimalValueOf.getClass();
            BigDecimal bigDecimalDivide4 = bigDecimalValueOf.divide(bigDecimal12, 2, roundingMode);
            if (bigDecimalDivide4 != null) {
                if (bigDecimalMultiply2.compareTo(bigDecimalDivide) < 0) {
                    try {
                        bigDecimalSubtract = bigDecimalDivide.multiply(bigDecimalDivide4).divide(bigDecimalMultiply2, 2, RoundingMode.FLOOR).subtract(BigDecimal.ONE);
                    } catch (Exception unused) {
                        bigDecimalSubtract = bigDecimalDivide3;
                    }
                    bigDecimal = (BigDecimal) f.i(bigDecimalSubtract, bigDecimalDivide2, bigDecimalDivide3);
                } else {
                    bigDecimal = bigDecimal10;
                }
                itf0.a aVar6 = itf0.a;
                aVar6.q(MyLog.TAG_IV_DMBB);
                aVar6.a("percent = " + bigDecimal, new Object[0]);
                bigDecimal.getClass();
                return bigDecimal;
            }
            bigDecimal10.getClass();
        }
        return bigDecimal10;
    }
}
