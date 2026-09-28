package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m9f0 {

    public static final class a extends m9f0 {
        public final uf00<a4g0> a;
        public final String b;
        public final String c;

        public a(uf00<a4g0> uf00Var, String str, String str2) {
            uf00Var.getClass();
            str.getClass();
            str2.getClass();
            this.a = uf00Var;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(tournaments=");
            sb.append(this.a);
            sb.append(", selectedTournamentId=");
            sb.append(this.b);
            sb.append(", standingsUrl=");
            return uf80.a(sb, this.c, ")");
        }
    }

    public static final class b extends m9f0 {
    }

    public static final class c extends m9f0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1154297659;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
