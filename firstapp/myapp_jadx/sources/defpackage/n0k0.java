package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface n0k0 {

    public static final class a implements n0k0 {
        public static final a a = new a();

        @Override // defpackage.n0k0
        public final WorldCupTeam a() {
            return null;
        }

        @Override // defpackage.n0k0
        public final uf00<l5k0> b() {
            return null;
        }

        @Override // defpackage.n0k0
        public final uf00<WorldCupTeam> c() {
            return null;
        }

        @Override // defpackage.n0k0
        public final l0k0 d() {
            return null;
        }

        @Override // defpackage.n0k0
        public final boolean e() {
            return false;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 140970881;
        }

        public final String toString() {
            return "Disabled";
        }
    }

    public static final class b implements n0k0 {
        public final uf00<WorldCupTeam> a;
        public final WorldCupTeam b;
        public final l0k0 c;
        public final uf00<l5k0> d;
        public final boolean e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(uf00<WorldCupTeam> uf00Var, WorldCupTeam worldCupTeam, l0k0 l0k0Var, uf00<? extends l5k0> uf00Var2, boolean z) {
            this.a = uf00Var;
            this.b = worldCupTeam;
            this.c = l0k0Var;
            this.d = uf00Var2;
            this.e = z;
        }

        @Override // defpackage.n0k0
        public final WorldCupTeam a() {
            return this.b;
        }

        @Override // defpackage.n0k0
        public final uf00<l5k0> b() {
            return this.d;
        }

        @Override // defpackage.n0k0
        public final uf00<WorldCupTeam> c() {
            return this.a;
        }

        @Override // defpackage.n0k0
        public final l0k0 d() {
            return this.c;
        }

        @Override // defpackage.n0k0
        public final boolean e() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c && this.d.equals(bVar.d) && this.e == bVar.e;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            WorldCupTeam worldCupTeam = this.b;
            return Boolean.hashCode(this.e) + yvz.a(this.d, (this.c.hashCode() + ((iHashCode + (worldCupTeam == null ? 0 : worldCupTeam.hashCode())) * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(teams=");
            sb.append(this.a);
            sb.append(", selectedTeam=");
            sb.append(this.b);
            sb.append(", currentTab=");
            sb.append(this.c);
            sb.append(", tabs=");
            sb.append(this.d);
            sb.append(", goToTournamentButtonEnabled=");
            return mq0.a(sb, this.e, ")");
        }
    }

    public static final class c implements n0k0 {
        public final uf00<WorldCupTeam> a;
        public final WorldCupTeam b;
        public final l0k0 c;
        public final uf00<l5k0> d;
        public final boolean e;

        /* JADX WARN: Multi-variable type inference failed */
        public c(uf00<WorldCupTeam> uf00Var, WorldCupTeam worldCupTeam, l0k0 l0k0Var, uf00<? extends l5k0> uf00Var2, boolean z) {
            this.a = uf00Var;
            this.b = worldCupTeam;
            this.c = l0k0Var;
            this.d = uf00Var2;
            this.e = z;
        }

        @Override // defpackage.n0k0
        public final WorldCupTeam a() {
            return this.b;
        }

        @Override // defpackage.n0k0
        public final uf00<l5k0> b() {
            return this.d;
        }

        @Override // defpackage.n0k0
        public final uf00<WorldCupTeam> c() {
            return this.a;
        }

        @Override // defpackage.n0k0
        public final l0k0 d() {
            return this.c;
        }

        @Override // defpackage.n0k0
        public final boolean e() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c && this.d.equals(cVar.d) && this.e == cVar.e;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            WorldCupTeam worldCupTeam = this.b;
            return Boolean.hashCode(this.e) + yvz.a(this.d, (this.c.hashCode() + ((iHashCode + (worldCupTeam == null ? 0 : worldCupTeam.hashCode())) * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadingEvents(teams=");
            sb.append(this.a);
            sb.append(", selectedTeam=");
            sb.append(this.b);
            sb.append(", currentTab=");
            sb.append(this.c);
            sb.append(", tabs=");
            sb.append(this.d);
            sb.append(", goToTournamentButtonEnabled=");
            return mq0.a(sb, this.e, ")");
        }
    }

    public static final class d implements n0k0 {
        public final uf00<WorldCupTeam> a;
        public final WorldCupTeam b;
        public final l0k0 c;
        public final uf00<l5k0> d;
        public final boolean e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(uf00<WorldCupTeam> uf00Var, WorldCupTeam worldCupTeam, l0k0 l0k0Var, uf00<? extends l5k0> uf00Var2, boolean z) {
            this.a = uf00Var;
            this.b = worldCupTeam;
            this.c = l0k0Var;
            this.d = uf00Var2;
            this.e = z;
        }

        @Override // defpackage.n0k0
        public final WorldCupTeam a() {
            return this.b;
        }

        @Override // defpackage.n0k0
        public final uf00<l5k0> b() {
            return this.d;
        }

        @Override // defpackage.n0k0
        public final uf00<WorldCupTeam> c() {
            return this.a;
        }

        @Override // defpackage.n0k0
        public final l0k0 d() {
            return this.c;
        }

        @Override // defpackage.n0k0
        public final boolean e() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && Intrinsics.g(this.b, dVar.b) && this.c == dVar.c && this.d.equals(dVar.d) && this.e == dVar.e;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            WorldCupTeam worldCupTeam = this.b;
            return Boolean.hashCode(this.e) + yvz.a(this.d, (this.c.hashCode() + ((iHashCode + (worldCupTeam == null ? 0 : worldCupTeam.hashCode())) * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(teams=");
            sb.append(this.a);
            sb.append(", selectedTeam=");
            sb.append(this.b);
            sb.append(", currentTab=");
            sb.append(this.c);
            sb.append(", tabs=");
            sb.append(this.d);
            sb.append(", goToTournamentButtonEnabled=");
            return mq0.a(sb, this.e, ")");
        }
    }

    WorldCupTeam a();

    uf00<l5k0> b();

    uf00<WorldCupTeam> c();

    l0k0 d();

    boolean e();
}
