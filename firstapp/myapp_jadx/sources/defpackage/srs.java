package defpackage;

import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class srs {
    public final String a;
    public final List<RegularMarketRule> b;
    public final rrs c;

    /* JADX WARN: Multi-variable type inference failed */
    public srs(String str, List<? extends RegularMarketRule> list, rrs rrsVar) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = rrsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srs)) {
            return false;
        }
        srs srsVar = (srs) obj;
        return Intrinsics.g(this.a, srsVar.a) && this.b.equals(srsVar.b) && this.c.equals(srsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ai50.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LivePanelMarketsAndEvents(sportId=" + this.a + ", markets=" + this.b + ", liveEvents=" + this.c + ")";
    }
}
