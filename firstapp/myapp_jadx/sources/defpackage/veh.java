package defpackage;

import androidx.recyclerview.widget.n;
import com.sportybet.plugin.realsports.data.FeaturedMatch;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class veh extends n.e<FeaturedMatch> {
    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(FeaturedMatch featuredMatch, FeaturedMatch featuredMatch2) {
        FeaturedMatch featuredMatch3 = featuredMatch;
        FeaturedMatch featuredMatch4 = featuredMatch2;
        featuredMatch3.getClass();
        featuredMatch4.getClass();
        if (!Intrinsics.g(featuredMatch3, featuredMatch4) || featuredMatch3.getEvent().status != featuredMatch4.getEvent().status) {
            return false;
        }
        List<Outcome> list = featuredMatch3.getMarket().outcomes;
        list.getClass();
        List<Outcome> list2 = featuredMatch4.getMarket().outcomes;
        list2.getClass();
        int iA = jpu.a(l48.r(list2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Outcome outcome : list2) {
            linkedHashMap.put(outcome.id, outcome.odds);
        }
        if (list.isEmpty()) {
            return true;
        }
        for (Outcome outcome2 : list) {
            if (!Intrinsics.g(linkedHashMap.get(outcome2.id), outcome2.odds)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(FeaturedMatch featuredMatch, FeaturedMatch featuredMatch2) {
        FeaturedMatch featuredMatch3 = featuredMatch;
        FeaturedMatch featuredMatch4 = featuredMatch2;
        featuredMatch3.getClass();
        featuredMatch4.getClass();
        return Intrinsics.g(featuredMatch3.getEvent().eventId, featuredMatch4.getEvent().eventId) && u5y.d(featuredMatch3.getMarket()) == u5y.d(featuredMatch4.getMarket());
    }
}
