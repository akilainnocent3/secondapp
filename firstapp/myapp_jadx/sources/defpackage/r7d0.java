package defpackage;

import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class r7d0 implements pdd0 {
    public final String a;

    public r7d0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7d0) && this.a.equals(((r7d0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "sportypicks__league_filter__click";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("LeagueFilterClickEvent(leagueName=", this.a, ")");
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(gvQvkPPtA.QGIAHDLcd, this.a));
    }
}
