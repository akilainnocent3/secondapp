package defpackage;

import com.sporty.android.book.domain.entity.EarlyPayoutMarket;
import com.sporty.android.book.domain.entity.OutcomeList;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import com.sportybet.plugin.realsports.data.FilteredMarkets;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.MarketExtend;
import com.sportybet.plugin.realsports.data.Outcome;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes4.dex */
public final class vpu {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OutcomeList.Kind.values().length];
            try {
                iArr[OutcomeList.Kind.ALLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OutcomeList.Kind.DENY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final List a(ArrayList arrayList, rgy rgyVar) {
        if (rgyVar.b() == null && rgyVar.a() == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Market market = (Market) obj;
            Float fB = rgyVar.b();
            float fFloatValue = fB != null ? fB.floatValue() : 0.0f;
            Float fA = rgyVar.a();
            float fFloatValue2 = fA != null ? fA.floatValue() : Float.MAX_VALUE;
            if (market.showOutcomeByStatus() && market.hasAnyOutcomeInOddsRange(new BigDecimal(String.valueOf(fFloatValue)), new BigDecimal(String.valueOf(fFloatValue2)))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0014 A[SYNTHETIC] */
    public static final FilteredMarkets b(String str, List list) {
        double d;
        boolean z;
        String str2;
        String str3;
        list.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        double d2 = 0.0d;
        String lowerCase = str;
        for (Object obj : list) {
            Market market = (Market) obj;
            String str4 = market.name;
            if (str4 != null) {
                if (StringsKt.M(str4, str, true)) {
                    z = true;
                    d2 = 1.0d;
                } else {
                    double dI = i(str4, str);
                    if (dI >= 0.6d && dI > d2) {
                        lowerCase = str4;
                        d2 = dI;
                    }
                    d = 1.0d;
                    List listH = new Regex("\\s+").h(str4);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listH) {
                        if (((String) obj2).length() > 2) {
                            arrayList2.add(obj2);
                        }
                    }
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList2.get(i);
                        i++;
                        String str5 = (String) obj3;
                        double dI2 = i(str5, str);
                        if (dI2 >= 0.6d && dI2 > d2) {
                            lowerCase = str5.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            d2 = dI2;
                        }
                    }
                }
                if (z) {
                    arrayList.add(obj);
                }
            } else {
                d = 1.0d;
            }
            List<Outcome> list2 = market.outcomes;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Outcome outcome = (Outcome) it.next();
                        if (outcome == null || (str3 = outcome.desc) == null) {
                            if (outcome == null && (str2 = outcome.playerName) != null) {
                                if (!StringsKt.M(str2, str, true)) {
                                    double dI3 = i(str2, str);
                                    if (dI3 >= 0.6d && dI3 > d2) {
                                        lowerCase = str2;
                                        d2 = dI3;
                                    }
                                }
                            }
                        } else if (!StringsKt.M(str3, str, true)) {
                            double dI4 = i(str3, str);
                            if (dI4 >= 0.6d && dI4 > d2) {
                                lowerCase = str3;
                                d2 = dI4;
                            }
                            if (outcome == null) {
                            }
                        }
                        z = true;
                        d2 = d;
                    } else {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        if (d2 == 1.0d) {
            lowerCase = str;
        }
        return (!arrayList.isEmpty() || Intrinsics.g(lowerCase, str) || d2 == 1.0d) ? new FilteredMarkets(lowerCase, arrayList) : b(lowerCase, list);
    }

    public static final Market c(String str, String str2, List list) {
        Object next;
        list.getClass();
        str.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            Market market = (Market) next;
            if (Intrinsics.g(market.id, str) && (str2 == null || Intrinsics.g(market.specifier, str2))) {
                return (Market) next;
            }
        }
        next = null;
        return (Market) next;
    }

    public static final Market d(List<? extends Market> list, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2) {
        Object next;
        list.getClass();
        str.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        Object obj = null;
        if (z || z2) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Market market = (Market) next;
                market.getClass();
                if ((Intrinsics.g(str, market.id) && market.showOutcomeByStatus() && market.hasAnyOutcomeInOddsRange(bigDecimal, bigDecimal2)) && ((market.isNearOdds() && z) || (market.isFarOdds() && z2))) {
                    break;
                }
            }
            Market market2 = (Market) next;
            if (market2 != null) {
                return market2;
            }
        }
        for (Object obj2 : list) {
            Market market3 = (Market) obj2;
            market3.getClass();
            if (Intrinsics.g(str, market3.id) && market3.showOutcomeByStatus() && market3.hasAnyOutcomeInOddsRange(bigDecimal, bigDecimal2)) {
                obj = obj2;
                break;
            }
        }
        return (Market) obj;
    }

    public static final Set<Integer> e(Market market, boolean z, int i) {
        Integer intOrNull;
        market.getClass();
        List<Outcome> list = market.outcomes;
        ArrayList arrayListA = kw5.a(list);
        for (Object obj : list) {
            if (((Outcome) obj).isActive == 1) {
                arrayListA.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList();
        int size = arrayListA.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayListA.get(i2);
            i2++;
            String str = ((Outcome) obj2).desc;
            str.getClass();
            String str2 = (String) CollectionsKt.V(z ? 1 : 0, StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null));
            if (str2 != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null && intOrNull.intValue() == i) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList.get(i3);
            i3++;
            String str3 = ((Outcome) obj3).desc;
            str3.getClass();
            String str4 = (String) CollectionsKt.V(!z ? 1 : 0, StringsKt__StringsKt.split$default(str3, new String[]{":"}, false, 0, 6, null));
            Integer intOrNull2 = str4 != null ? StringsKt.toIntOrNull(str4) : null;
            if (intOrNull2 != null) {
                arrayList2.add(intOrNull2);
            }
        }
        return CollectionsKt.E0(arrayList2);
    }

    public static final String f(Outcome outcome, String str) {
        if (str == null) {
            str = "";
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String strP = c.p(c.p(c.p(c.p(lowerCase, " - ", "-", false), " ", "-", false), "(", "", false), ")", "", false);
        String str2 = outcome.desc;
        if (str2 == null) {
            str2 = "";
        }
        String lowerCase2 = str2.toLowerCase(locale);
        lowerCase2.getClass();
        String strP2 = c.p(c.p(c.p(c.p(lowerCase2, " - ", "-", false), " ", "-", false), "(", "", false), ")", "", false);
        if (strP.length() == 0 && strP2.length() == 0) {
            return "";
        }
        if (strP.length() == 0) {
            return strP2;
        }
        return strP2.length() == 0 ? strP : tug.a(strP, "-", strP2);
    }

    public static final String g(Outcome outcome) {
        String str = outcome.playerName;
        if (str != null && !StringsKt.U(str)) {
            return str;
        }
        String str2 = outcome.desc;
        if (str2 == null) {
            str2 = "";
        }
        String string = StringsKt.t0(StringsKt.p0(str2, " ", str2)).toString();
        return string.length() == 0 ? str2 : string;
    }

    public static final ArrayList h(List list, List list2) {
        int i;
        Double dH;
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(l48.r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            rgy rgyVar = (rgy) it.next();
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                List<Outcome> list3 = ((Market) it2.next()).outcomes;
                list3.getClass();
                if (list3.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (Outcome outcome : list3) {
                        if (outcome.isActive == 1) {
                            Float fB = rgyVar.b();
                            float fFloatValue = fB != null ? fB.floatValue() : 0.0f;
                            Float fA = rgyVar.a();
                            float fFloatValue2 = fA != null ? fA.floatValue() : Float.MAX_VALUE;
                            String str = outcome.odds;
                            if (str != null && (dH = b.h(str)) != null) {
                                double dDoubleValue = dH.doubleValue();
                                if (fFloatValue <= dDoubleValue && dDoubleValue <= fFloatValue2 && (i = i + 1) < 0) {
                                    kotlin.collections.b.p();
                                    throw null;
                                }
                            }
                        }
                    }
                }
                i2 += i;
            }
            arrayList.add(new kjy(rgyVar.b(), rgyVar.a(), rgyVar.c(), i2));
        }
        return arrayList;
    }

    public static final double i(String str, String str2) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = str2.toLowerCase(locale);
        lowerCase2.getClass();
        int length = lowerCase.length();
        int length2 = lowerCase2.length();
        int i = length + 1;
        int[][] iArr = new int[i][];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = new int[length2 + 1];
        }
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                if (length2 >= 0) {
                    int i4 = 0;
                    while (true) {
                        if (i3 == 0) {
                            iArr[i3][i4] = i4;
                        } else if (i4 == 0) {
                            iArr[i3][i4] = i3;
                        } else {
                            int i5 = i3 - 1;
                            int i6 = i4 - 1;
                            int i7 = lowerCase.charAt(i5) == lowerCase2.charAt(i6) ? 0 : 1;
                            int[] iArr2 = iArr[i3];
                            int[] iArr3 = iArr[i5];
                            iArr2[i4] = Math.min(iArr3[i4] + 1, Math.min(iArr2[i6] + 1, iArr3[i6] + i7));
                        }
                        if (i4 == length2) {
                            break;
                        }
                        i4++;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        int i8 = iArr[length][length2];
        int iMax = Math.max(length, length2);
        if (iMax == 0) {
            return 0.0d;
        }
        return 1.0d - (((double) i8) / ((double) iMax));
    }

    public static final Market k(com.sporty.android.book.domain.entity.Market market) {
        ArrayList arrayList;
        MarketExtend marketExtend;
        market.getClass();
        Market market2 = new Market();
        market2.id = market.getId();
        market2.product = market.getProduct();
        market2.desc = market.getDesc();
        market2.status = market.getStatus();
        market2.group = market.getGroup();
        market2.groupId = market.getGroupId();
        market2.marketGuide = market.getMarketGuide();
        market2.title = market.getTitle();
        market2.specifier = market.getSpecifier();
        market2.favourite = String.valueOf(market.getFavourite());
        List<com.sporty.android.book.domain.entity.MarketExtend> marketExtendVOS = market.getMarketExtendVOS();
        ArrayList arrayList2 = null;
        if (marketExtendVOS != null) {
            arrayList = new ArrayList(l48.r(marketExtendVOS, 10));
            for (com.sporty.android.book.domain.entity.MarketExtend marketExtend2 : marketExtendVOS) {
                if (marketExtend2 != null) {
                    marketExtend = new MarketExtend();
                    marketExtend.name = marketExtend2.getName();
                    marketExtend.nodeMarketId = marketExtend2.getNodeMarketId();
                    marketExtend.rootMarketId = marketExtend2.getRootMarketId();
                    marketExtend.notSupport = marketExtend2.getNotSupport();
                } else {
                    marketExtend = null;
                }
                arrayList.add(marketExtend);
            }
        } else {
            arrayList = null;
        }
        market2.marketExtendVOS = arrayList;
        List<EarlyPayoutMarket> earlyPayoutMarkets = market.getEarlyPayoutMarkets();
        if (earlyPayoutMarkets != null) {
            ArrayList arrayList3 = new ArrayList(l48.r(earlyPayoutMarkets, 10));
            for (EarlyPayoutMarket earlyPayoutMarket : earlyPayoutMarkets) {
                arrayList3.add(earlyPayoutMarket != null ? new com.sportybet.plugin.realsports.data.EarlyPayoutMarket(earlyPayoutMarket.getName(), earlyPayoutMarket.getSourceMarketId(), earlyPayoutMarket.getSourceSpecifier(), earlyPayoutMarket.getMappedMarketId(), earlyPayoutMarket.getMappedSpecifier(), earlyPayoutMarket.getSupported()) : null);
            }
            arrayList2 = arrayList3;
        }
        market2.earlyPayoutMarkets = arrayList2;
        List<com.sporty.android.book.domain.entity.Outcome> outcomes = market.getOutcomes();
        ArrayList arrayList4 = new ArrayList(l48.r(outcomes, 10));
        Iterator<T> it = outcomes.iterator();
        while (it.hasNext()) {
            arrayList4.add(i8z.c((com.sporty.android.book.domain.entity.Outcome) it.next()));
        }
        market2.outcomes = arrayList4;
        return market2;
    }

    public static final com.sporty.android.book.domain.entity.Market j(Market market) {
        String str;
        ArrayList arrayList;
        market.getClass();
        String str2 = market.id;
        str2.getClass();
        int i = market.product;
        String str3 = market.desc;
        String str4 = LGxrN.NtjpdmJieYgWHoC;
        if (str3 == null) {
            str3 = str4;
            str = str3;
        } else {
            str = str4;
        }
        int i2 = market.status;
        String str5 = market.group;
        if (str5 == null) {
            str5 = str;
        }
        String str6 = market.groupId;
        if (str6 == null) {
            str6 = str;
        }
        String str7 = market.marketGuide;
        if (str7 == null) {
            str7 = str;
        }
        String str8 = market.title;
        if (str8 == null) {
            str8 = str;
        }
        String str9 = market.specifier;
        String str10 = market.favourite;
        if (str10 != null) {
            str = str10;
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        List<Outcome> list = market.outcomes;
        list.getClass();
        ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
        for (Outcome outcome : list) {
            outcome.getClass();
            arrayList2.add(i8z.b(outcome));
        }
        List<MarketExtend> list2 = market.marketExtendVOS;
        if (list2 != null) {
            arrayList = new ArrayList(l48.r(list2, 10));
            for (MarketExtend marketExtend : list2) {
                arrayList.add(marketExtend != null ? new com.sporty.android.book.domain.entity.MarketExtend(marketExtend.name, marketExtend.rootMarketId, marketExtend.nodeMarketId, marketExtend.notSupport) : null);
                str2 = str2;
                i = i;
                str3 = str3;
            }
        } else {
            arrayList = null;
        }
        String str11 = str2;
        int i3 = i;
        String str12 = str3;
        List<com.sportybet.plugin.realsports.data.EarlyPayoutMarket> list3 = market.earlyPayoutMarkets;
        list3.getClass();
        ArrayList arrayList3 = new ArrayList(l48.r(list3, 10));
        for (com.sportybet.plugin.realsports.data.EarlyPayoutMarket earlyPayoutMarket : list3) {
            arrayList3.add(earlyPayoutMarket != null ? new EarlyPayoutMarket(earlyPayoutMarket.getName(), earlyPayoutMarket.getSourceMarketId(), earlyPayoutMarket.getSourceSpecifier(), earlyPayoutMarket.getMappedMarketId(), earlyPayoutMarket.getMappedSpecifier(), earlyPayoutMarket.getSupported()) : null);
        }
        return new com.sporty.android.book.domain.entity.Market(str11, i3, str12, i2, str5, str6, str7, str8, iIntValue, str9, arrayList2, arrayList, arrayList3);
    }
}
