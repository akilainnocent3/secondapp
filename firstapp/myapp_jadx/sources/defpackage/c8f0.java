package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c8f0 {

    public static final class a extends c8f0 {
        public final q7f0 a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public a(q7f0 q7f0Var, String str, String str2, String str3, String str4) {
            q7f0Var.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            this.a = q7f0Var;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(overview=");
            sb.append(this.a);
            sb.append(", selectedTeamInfoTournamentId=");
            sb.append(this.b);
            sb.append(", selectedStandingsTournamentId=");
            hxa.c(sb, this.c, ", teamFormUrl=", this.d, ", standingsUrl=");
            return uf80.a(sb, this.e, ")");
        }
    }

    public static final class b extends c8f0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -365514090;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class c extends c8f0 {
        public final String a = "Failed to load team overview.";

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Error(errorMessage=", this.a, ")");
        }
    }

    public static final class d extends c8f0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1406214075;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
