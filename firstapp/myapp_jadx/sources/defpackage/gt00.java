package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PickMarketMetadata;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class gt00 {
    public static final b a;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Integer num = 0;
            return (mo40.a((Market) t) ? 1 : num).compareTo(mo40.a((Market) t2) ? 1 : 0);
        }
    }

    public static final class b<T> implements Comparator {
        public final /* synthetic */ a a;
        public final /* synthetic */ tl8 b;

        public b(a aVar, tl8 tl8Var) {
            this.a = aVar;
            this.b = tl8Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String str;
            String str2;
            int iCompare = this.a.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            List list = ((Market) t).outcomes;
            if (list == null) {
                list = m2g.a;
            }
            Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list);
            BigDecimal bigDecimalG = null;
            BigDecimal bigDecimalG2 = (outcome == null || (str2 = outcome.odds) == null) ? null : kotlin.text.b.g(str2);
            List list2 = ((Market) t2).outcomes;
            if (list2 == null) {
                list2 = m2g.a;
            }
            Outcome outcome2 = (Outcome) CollectionsKt.firstOrNull(list2);
            if (outcome2 != null && (str = outcome2.odds) != null) {
                bigDecimalG = kotlin.text.b.g(str);
            }
            return this.b.compare(bigDecimalG2, bigDecimalG);
        }
    }

    static {
        a aVar = new a();
        yex yexVar = yex.a;
        yexVar.getClass();
        a = new b(aVar, new tl8(yexVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public static final ArrayList a(ArrayList arrayList, Set set) {
        int i;
        ?? arrayList2;
        String marketHeadline;
        set.getClass();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Event event = (Event) obj;
            Iterable iterable = event.markets;
            if (iterable == null) {
                iterable = m2g.a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str = ((Market) next).id;
                String str2 = str != null ? str : "";
                Object objA = linkedHashMap.get(str2);
                if (objA == null) {
                    objA = r9i.a(str2, linkedHashMap);
                }
                ((List) objA).add(next);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                List<Market> list = (List) entry.getValue();
                if (list.size() <= 1 || !set.contains(str3)) {
                    i = size;
                    arrayList2 = new ArrayList(l48.r(list, 10));
                    for (Market market : list) {
                        market.getClass();
                        arrayList2.add(new mt00.b(event, market));
                    }
                } else {
                    Market market2 = (Market) CollectionsKt.T(list);
                    PickMarketMetadata pickMarketMetadata = market2.pickMarketMetadata;
                    if ((pickMarketMetadata == null || (marketHeadline = pickMarketMetadata.getMarketHeadline()) == null) && (marketHeadline = market2.desc) == null) {
                        marketHeadline = "";
                    }
                    Iterable iterable2 = market2.outcomes;
                    if (iterable2 == null) {
                        iterable2 = m2g.a;
                    }
                    String str4 = marketHeadline;
                    ArrayList arrayList5 = new ArrayList(l48.r(iterable2, 10));
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        String str5 = ((Outcome) it2.next()).desc;
                        if (str5 == null) {
                            str5 = "";
                        }
                        arrayList5.add(str5);
                    }
                    List<Market> listR0 = CollectionsKt.r0(list, a);
                    ArrayList arrayList6 = new ArrayList(l48.r(listR0, 10));
                    for (Market market3 : listR0) {
                        int i3 = size;
                        PickMarketMetadata pickMarketMetadata2 = market3.pickMarketMetadata;
                        String entityName = pickMarketMetadata2 != null ? pickMarketMetadata2.getEntityName() : null;
                        if (entityName == null) {
                            entityName = "";
                        }
                        arrayList6.add(new mt00.a.C0878a(market3, entityName));
                        size = i3;
                    }
                    i = size;
                    arrayList2 = kotlin.collections.a.c(new mt00.a(event, str3, str4, arrayList5, arrayList6));
                }
                p48.w(arrayList2, arrayList4);
                size = i;
            }
            p48.w(arrayList4, arrayList3);
        }
        return arrayList3;
    }
}
