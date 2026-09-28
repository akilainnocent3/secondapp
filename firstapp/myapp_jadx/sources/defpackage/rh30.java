package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class rh30<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return vl8.b(((Selection) CollectionsKt.T((List) t)).a.eventId, ((Selection) CollectionsKt.T((List) t2)).a.eventId);
    }
}
