package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface rq30 {

    public static final class a implements rq30 {
        public final bp30 a;
        public final tq30 b;
        public final int c;

        public a(bp30 bp30Var, tq30 tq30Var, int i) {
            bp30Var.getClass();
            tq30Var.getClass();
            this.a = bp30Var;
            this.b = tq30Var;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetResult(player=");
            sb.append(this.a);
            sb.append(", result=");
            sb.append(this.b);
            sb.append(", resultSkinIndex=");
            return rr1.b(sb, this.c, ')');
        }
    }

    public static final class c implements rq30 {
        public final bp30 a;

        public c(bp30 bp30Var) {
            bp30Var.getClass();
            this.a = bp30Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PlaceBet(player=" + this.a + ')';
        }
    }

    public static final class b implements rq30 {
        public final bp30 a;

        public b(bp30 bp30Var) {
            bp30Var.getClass();
            this.a = bp30Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Init(player=" + this.a + ')';
        }

        public /* synthetic */ b(int i) {
            this(bp30.ORANGE);
        }
    }
}
