package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class vbg0 implements pdd0 {
    public final brg a;
    public final String b = "home_page__tournament_panel__expand";

    public vbg0(brg brgVar) {
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
        if (!(obj instanceof vbg0)) {
            return false;
        }
        vbg0 vbg0Var = (vbg0) obj;
        return this.a == vbg0Var.a && this.b.equals(vbg0Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentPanelExpandClick(source=" + this.a + ", name=" + this.b + ")";
    }
}
