package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e7k0 {
    public final qfg0 a;
    public final String b;
    public final uf00<WorldCupTeam> c;
    public final w9l d;
    public final hrp e;

    public e7k0(qfg0 qfg0Var, String str, uf00<WorldCupTeam> uf00Var, w9l w9lVar, hrp hrpVar) {
        qfg0Var.getClass();
        uf00Var.getClass();
        w9lVar.getClass();
        hrpVar.getClass();
        this.a = qfg0Var;
        this.b = str;
        this.c = uf00Var;
        this.d = w9lVar;
        this.e = hrpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7k0)) {
            return false;
        }
        e7k0 e7k0Var = (e7k0) obj;
        return this.a == e7k0Var.a && Intrinsics.g(this.b, e7k0Var.b) && Intrinsics.g(this.c, e7k0Var.c) && Intrinsics.g(this.d, e7k0Var.d) && Intrinsics.g(this.e, e7k0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + yvz.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31);
    }

    public final String toString() {
        return "WorldCupTournamentUiState(selectedTab=" + this.a + ", selectedTeamId=" + this.b + ", teams=" + this.c + ", groupsState=" + this.d + ", knockoutState=" + this.e + ")";
    }

    public e7k0() {
        this(0);
    }

    public e7k0(int i) {
        this(qfg0.a, null, n1a0.c, w9l.c.a, hrp.c.a);
    }
}
