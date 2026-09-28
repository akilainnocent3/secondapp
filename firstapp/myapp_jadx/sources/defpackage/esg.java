package defpackage;

import com.sporty.android.book.domain.entity.FeaturedBetBuilderMarket;
import com.sportybet.plugin.event.c;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class esg implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List listR0;
        List list = (List) obj2;
        list.getClass();
        Event event = ((c) obj).e.a;
        if (event == null) {
            return new alg(3, (Event) null);
        }
        List<Market> list2 = event.markets;
        if (list2 == null) {
            return new alg(2, event);
        }
        ArrayList arrayListB = u5y.b(list2);
        if (list.isEmpty()) {
            listR0 = m2g.a;
        } else {
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            int i = 0;
            int i2 = 0;
            for (Object obj3 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    b.q();
                    throw null;
                }
                FeaturedBetBuilderMarket featuredBetBuilderMarket = (FeaturedBetBuilderMarket) obj3;
                arrayList.add(new Pair(new Pair(featuredBetBuilderMarket.getId(), featuredBetBuilderMarket.getSpecifier()), Integer.valueOf(i2)));
                i2 = i3;
            }
            Map mapK = kpu.k(arrayList);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayListB.size();
            while (i < size) {
                Object obj4 = arrayListB.get(i);
                i++;
                Market market = (Market) obj4;
                if (mapK.containsKey(new Pair(market.id, market.specifier))) {
                    arrayList2.add(obj4);
                }
            }
            listR0 = CollectionsKt.r0(arrayList2, new s920(mapK));
        }
        return new alg(event, (List<? extends Market>) listR0);
    }
}
