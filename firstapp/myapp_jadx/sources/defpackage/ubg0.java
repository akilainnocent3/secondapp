package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class ubg0 implements pdd0 {
    public final brg a;
    public final String b = "home_page__tournament_panel__collapse";

    public ubg0(brg brgVar) {
        this.a = brgVar;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", this.a.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubg0)) {
            return false;
        }
        ubg0 ubg0Var = (ubg0) obj;
        return this.a == ubg0Var.a && this.b.equals(ubg0Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentPanelCollapseClick(source=" + this.a + ", name=" + this.b + ")";
    }
}
