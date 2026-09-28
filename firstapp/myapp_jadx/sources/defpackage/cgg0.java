package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class cgg0 implements pdd0 {
    public final brg a;
    public final String b = "tournament_page__team_deselect__click";

    public cgg0(brg brgVar) {
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
        if (!(obj instanceof cgg0)) {
            return false;
        }
        cgg0 cgg0Var = (cgg0) obj;
        return this.a == cgg0Var.a && this.b.equals(cgg0Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentTeamDeselectClick(source=" + this.a + ", name=" + this.b + ")";
    }
}
