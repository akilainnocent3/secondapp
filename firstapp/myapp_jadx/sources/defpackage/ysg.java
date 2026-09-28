package defpackage;

import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ysg<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String str;
        String str2;
        List<Outcome> list = ((Market) t2).outcomes;
        list.getClass();
        Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list);
        Double dValueOf = null;
        Double dValueOf2 = (outcome == null || (str2 = outcome.odds) == null) ? null : Double.valueOf(Double.parseDouble(str2));
        List<Outcome> list2 = ((Market) t).outcomes;
        list2.getClass();
        Outcome outcome2 = (Outcome) CollectionsKt.firstOrNull(list2);
        if (outcome2 != null && (str = outcome2.odds) != null) {
            dValueOf = Double.valueOf(Double.parseDouble(str));
        }
        return vl8.b(dValueOf2, dValueOf);
    }
}
