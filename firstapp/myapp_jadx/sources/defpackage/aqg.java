package defpackage;

import com.sporty.android.book.domain.entity.MarketGroup;
import com.sporty.android.book.domain.entity.SimpleMarket;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aqg {
    public final Event a;
    public final List<MarketGroup> b;
    public final List<Integer> c;
    public final List<SimpleMarket> d;

    public aqg(Event event, List<MarketGroup> list, List<Integer> list2, List<SimpleMarket> list3) {
        this.a = event;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public static aqg a(aqg aqgVar, Event event, List list, List list2, int i) {
        if ((i & 1) != 0) {
            event = aqgVar.a;
        }
        List<MarketGroup> list3 = aqgVar.b;
        if ((i & 4) != 0) {
            list = aqgVar.c;
        }
        if ((i & 8) != 0) {
            list2 = aqgVar.d;
        }
        aqgVar.getClass();
        return new aqg(event, list3, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqg)) {
            return false;
        }
        aqg aqgVar = (aqg) obj;
        return Intrinsics.g(this.a, aqgVar.a) && Intrinsics.g(this.b, aqgVar.b) && Intrinsics.g(this.c, aqgVar.c) && Intrinsics.g(this.d, aqgVar.d);
    }

    public final int hashCode() {
        Event event = this.a;
        int iHashCode = (event == null ? 0 : event.hashCode()) * 31;
        List<MarketGroup> list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SimpleMarket> list3 = this.d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventMeta(event=");
        sb.append(this.a);
        sb.append(", marketGroups=");
        sb.append(this.b);
        sb.append(", favoriteMarketIds=");
        return v9d.a(", betBuilderMarkets=", ")", sb, this.c, this.d);
    }

    public aqg() {
        this(null, null, null, null);
    }
}
