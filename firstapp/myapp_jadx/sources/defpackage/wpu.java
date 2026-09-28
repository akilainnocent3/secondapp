package defpackage;

import com.sporty.android.book.domain.entity.SimpleMarket;
import com.sportybet.plugin.realsports.data.Market;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class wpu<T> implements Comparator {
    public final /* synthetic */ List a;

    public wpu(List list) {
        this.a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int i;
        Market market = (Market) t;
        List list = this.a;
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (Intrinsics.g(((SimpleMarket) it.next()).getMarketId(), market.id)) {
                break;
            }
            i3++;
        }
        Integer numValueOf = Integer.valueOf(i3);
        Market market2 = (Market) t2;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.g(((SimpleMarket) it2.next()).getMarketId(), market2.id)) {
                i = i2;
                break;
            }
            i2++;
        }
        return numValueOf.compareTo(Integer.valueOf(i));
    }
}
