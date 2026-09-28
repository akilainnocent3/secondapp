package defpackage;

import android.content.Context;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class zog {

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Object bVar;
            Object bVar2;
            String strJ;
            String strJ2;
            Market market = (Market) t;
            try {
                zi50.a aVar = zi50.b;
                String str = market.specifier;
                bVar = (str == null || (strJ2 = zog.j(str)) == null) ? null : Float.valueOf(Float.parseFloat(strJ2));
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            Float f = (Float) bVar;
            try {
                String str2 = ((Market) t2).specifier;
                bVar2 = (str2 == null || (strJ = zog.j(str2)) == null) ? null : Float.valueOf(Float.parseFloat(strJ));
            } catch (Throwable th2) {
                zi50.a aVar3 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            return vl8.b(f, (Float) (bVar2 instanceof zi50.b ? null : bVar2));
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Object bVar;
            Object bVar2;
            String str = (String) t;
            try {
                zi50.a aVar = zi50.b;
                bVar = Float.valueOf(Float.parseFloat(str));
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            Float f = (Float) bVar;
            try {
                bVar2 = Float.valueOf(Float.parseFloat((String) t2));
            } catch (Throwable th2) {
                zi50.a aVar3 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            return vl8.b(f, (Float) (bVar2 instanceof zi50.b ? null : bVar2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    public static final boolean a(Context context, Selection selection, boolean z) {
        boolean z2;
        context.getClass();
        if (iu2.t(selection.a, selection.b, selection.c, z, false, null, 16368)) {
            z2 = true;
        } else {
            if (kni0.m()) {
                iu2.r(context);
            } else {
                if (iu2.l()) {
                    qz3.p(context);
                }
                if (iu2.f(selection)) {
                    qz3.m(context);
                } else {
                    Event event = selection.a;
                    event.getClass();
                    if (iu2.g(event)) {
                        qz3.m(context);
                    }
                }
            }
            z2 = false;
        }
        if (iu2.p() && z && !iu2.o(selection)) {
            iu2.e(context, selection);
        }
        return z2;
    }

    public static final String b(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (!new BigDecimal(str).equals(BigDecimal.ONE)) {
            return oxc.a(gky.a(str), "~", gky.a(str2));
        }
        try {
            String string = new BigDecimal(str2).setScale(1).toString();
            string.getClass();
            return "≤" + gky.a(string);
        } catch (Exception unused) {
            return inm.a("≤", gky.a(str2));
        }
    }

    public static final Market c(String str, String str2, List list) {
        boolean zEquals;
        str.getClass();
        Object obj = null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Market market = (Market) obj2;
            if (!Intrinsics.g(market.id, str)) {
                String str3 = market.id;
                str3.getClass();
                if (k(str3, str)) {
                }
            }
            if (market.showOutcomeByStatus()) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            Market market2 = (Market) obj3;
            if (str2.length() == 0) {
                zEquals = true;
            } else {
                String str4 = market2.specifier;
                if (str4 == null) {
                    str4 = "";
                }
                zEquals = str2.equals(j(str4));
            }
            if (zEquals) {
                obj = obj3;
                break;
            }
        }
        return (Market) obj;
    }

    public static final List d(String str, List list) {
        str.getClass();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Market market = (Market) obj;
                if (!Intrinsics.g(market.id, str)) {
                    String str2 = market.id;
                    str2.getClass();
                    if (k(str2, str)) {
                    }
                }
                if (market.showOutcomeByStatus()) {
                    arrayList.add(obj);
                }
            }
            List listR0 = CollectionsKt.r0(arrayList, new a());
            if (listR0 != null) {
                return listR0;
            }
        }
        return m2g.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0109 A[EDGE_INSN: B:112:0x0109->B:81:0x0109 BREAK  A[LOOP:2: B:71:0x00e1->B:113:0x00e1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0088 A[SYNTHETIC] */
    public static final String e(List<? extends Market> list, String str, String str2, int i, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        List<? extends Market> list2;
        String str4;
        String strJ;
        String strJ2;
        Iterator<T> it;
        Object next;
        Market market;
        String str5;
        Market market2;
        String str6;
        Iterator<T> it2;
        Object next2;
        Market market3;
        String str7;
        Market market4;
        Iterator<T> it3;
        Object next3;
        Market market5;
        String str8;
        Market market6;
        Market marketD;
        String str9;
        str.getClass();
        str2.getClass();
        str3.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        boolean zEquals = str3.equals("near_odds");
        boolean zEquals2 = str3.equals("far_odds");
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        boolean z = (bigDecimal.compareTo(bigDecimal3) == 0 || bigDecimal2.compareTo(bigDecimal3) == 0) ? false : true;
        String str10 = (String) (i == 1 ? tf20.E : tf20.F).get(str2);
        if (str10 != null) {
            return str10;
        }
        String strJ3 = null;
        if (z) {
            list2 = list;
            str4 = str;
            if (list != null && (marketD = vpu.d(list2, str4, bigDecimal, bigDecimal2, zEquals, zEquals2)) != null && (str9 = marketD.specifier) != null) {
                strJ = j(str9);
            }
            if (strJ == null) {
                return strJ;
            }
            if (!g(str4, list2).contains(str3)) {
                if ((!zEquals || zEquals2) && list2 != null) {
                    it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        market6 = (Market) next3;
                        if (!Intrinsics.g(market6.id, str4) && ((market6.isNearOdds() && zEquals) || (market6.isFarOdds() && zEquals2))) {
                            break;
                        }
                    }
                    market5 = (Market) next3;
                    if (market5 != null || (str8 = market5.specifier) == null) {
                        str3 = null;
                    } else {
                        str3 = j(str8);
                    }
                } else {
                    str3 = null;
                }
            }
            if (str3 == null) {
                return str3;
            }
            if (list2 != null) {
                it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    market4 = (Market) next2;
                    if (!Intrinsics.g(market4.id, str4) && market4.isFavorite()) {
                        break;
                    }
                }
                market3 = (Market) next2;
                if (market3 != null || (str7 = market3.specifier) == null) {
                    strJ2 = null;
                } else {
                    strJ2 = j(str7);
                }
            } else {
                strJ2 = null;
            }
            if (strJ2 == null) {
                return strJ2;
            }
            if (list2 != null) {
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    market2 = (Market) next;
                    if (!Intrinsics.g(market2.id, str4)) {
                        str6 = market2.id;
                        str6.getClass();
                        if (k(str6, str4)) {
                            continue;
                        }
                    }
                    if (market2.showOutcomeByStatus()) {
                        break;
                    }
                }
                market = (Market) next;
                if (market != null && (str5 = market.specifier) != null) {
                    strJ3 = j(str5);
                }
            }
            if (strJ3 == null) {
                return "";
            }
            return strJ3;
        }
        list2 = list;
        str4 = str;
        strJ = null;
        if (strJ == null) {
            return strJ;
        }
        if (!g(str4, list2).contains(str3)) {
            if (zEquals) {
                it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    market6 = (Market) next3;
                    if (!Intrinsics.g(market6.id, str4)) {
                    }
                }
                market5 = (Market) next3;
                if (market5 != null) {
                    str3 = null;
                } else {
                    str3 = null;
                }
            } else {
                it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    market6 = (Market) next3;
                    if (!Intrinsics.g(market6.id, str4)) {
                    }
                }
                market5 = (Market) next3;
                if (market5 != null) {
                    str3 = null;
                } else {
                    str3 = null;
                }
            }
        }
        if (str3 == null) {
            return str3;
        }
        if (list2 != null) {
            it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                market4 = (Market) next2;
                if (!Intrinsics.g(market4.id, str4)) {
                }
            }
            market3 = (Market) next2;
            if (market3 != null) {
                strJ2 = null;
            } else {
                strJ2 = null;
            }
        } else {
            strJ2 = null;
        }
        if (strJ2 == null) {
            return strJ2;
        }
        if (list2 != null) {
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                market2 = (Market) next;
                if (!Intrinsics.g(market2.id, str4)) {
                    str6 = market2.id;
                    str6.getClass();
                    if (k(str6, str4)) {
                        continue;
                    }
                }
                if (market2.showOutcomeByStatus()) {
                    break;
                    break;
                }
            }
            market = (Market) next;
            if (market != null) {
                strJ3 = j(str5);
            }
        }
        if (strJ3 == null) {
            return "";
        }
        return strJ3;
    }

    public static final ArrayList f(List list) {
        ArrayList arrayListA = kw5.a(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Market) it.next()).specifier;
            String strJ = str != null ? j(str) : null;
            if (strJ != null) {
                arrayListA.add(strJ);
            }
        }
        return arrayListA;
    }

    public static final List g(String str, List list) {
        String strJ;
        str.getClass();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Market market = (Market) obj;
                if (!Intrinsics.g(market.id, str)) {
                    String str2 = market.id;
                    str2.getClass();
                    if (k(str2, str)) {
                    }
                }
                if (market.showOutcomeByStatus()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                String str3 = ((Market) obj2).specifier;
                if (str3 != null) {
                    str3.getClass();
                    strJ = j(str3);
                } else {
                    strJ = null;
                }
                if (strJ != null) {
                    arrayList2.add(strJ);
                }
            }
            List listR0 = CollectionsKt.r0(arrayList2, new b());
            if (listR0 != null) {
                return listR0;
            }
        }
        return m2g.a;
    }

    public static final boolean h(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        return bigDecimal.compareTo(bigDecimal3) > 0 && bigDecimal2.compareTo(bigDecimal3) > 0;
    }

    public static final boolean i(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        str.getClass();
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (Intrinsics.g(bigDecimal, bigDecimal3) && Intrinsics.g(bigDecimal2, bigDecimal3)) {
            return false;
        }
        try {
            BigDecimal bigDecimal4 = new BigDecimal(str);
            return bigDecimal4.compareTo(bigDecimal) >= 0 && bigDecimal4.compareTo(bigDecimal2) <= 0;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final String j(String str) {
        Object bVar;
        str.getClass();
        if (!StringsKt.M(str, "|", false)) {
            return StringsKt.M(str, "=", false) ? (String) StringsKt__StringsKt.split$default(str, new String[]{"="}, false, 0, 6, null).get(1) : str;
        }
        try {
            zi50.a aVar = zi50.b;
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"|"}, false, 0, 6, null);
            bVar = (String) StringsKt__StringsKt.split$default((String) ((StringsKt.M((CharSequence) listSplit$default.get(0), "total", false) || StringsKt.M((CharSequence) listSplit$default.get(0), "hcp", false)) ? listSplit$default.get(0) : listSplit$default.get(1)), new String[]{"="}, false, 0, 6, null).get(1);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = str;
        if (!(bVar instanceof zi50.b)) {
            obj = bVar;
        }
        return (String) obj;
    }

    public static final boolean k(String str, String str2) {
        str.getClass();
        return Intrinsics.g(str, "223") && Intrinsics.g(str2, "16");
    }
}
