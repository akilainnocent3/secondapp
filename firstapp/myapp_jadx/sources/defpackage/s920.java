package defpackage;

import com.sportybet.plugin.realsports.data.Market;
import java.util.Comparator;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class s920<T> implements Comparator {
    public final /* synthetic */ Map a;

    public s920(Map map) {
        this.a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Market market = (Market) t;
        Pair pair = new Pair(market.id, market.specifier);
        Map map = this.a;
        Market market2 = (Market) t2;
        return vl8.b((Integer) map.get(pair), (Integer) map.get(new Pair(market2.id, market2.specifier)));
    }
}
