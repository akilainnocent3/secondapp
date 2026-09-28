package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface l970 {

    public static final class a implements l970 {
        public final String a;
        public final e970 b;

        public a(String str, e970 e970Var) {
            this.a = str;
            this.b = e970Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BetOpen(leagueId=" + this.a + ", matchday=" + this.b + ")";
        }
    }

    public static final class b implements l970 {
        public final String a;
        public final List<o470> b;

        public b(String str, List<o470> list) {
            this.a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return nf.b("ResultReady(matchdayId=", this.a, ", eventResults=", ")", this.b);
        }
    }
}
