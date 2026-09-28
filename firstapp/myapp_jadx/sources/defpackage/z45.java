package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface z45 {

    public static final class a implements z45 {
        public final w45.c a;
        public final w45.c b;

        public a(w45.c cVar, w45.c cVar2) {
            this.a = cVar;
            this.b = cVar2;
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
            return "HorizontalButtons(primaryButton=" + this.a + ", secondaryButton=" + this.b + ")";
        }
    }

    public static final class b implements z45 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -542150537;
        }

        public final String toString() {
            return "NoButton";
        }
    }

    public static final class c implements z45 {
        public final w45 a;

        public c(w45 w45Var) {
            this.a = w45Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SingleButton(primaryButton=" + this.a + ")";
        }
    }

    public static final class d implements z45 {
        public final w45 a;
        public final w45 b;

        public d(w45 w45Var, w45 w45Var2) {
            this.a = w45Var;
            this.b = w45Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "VerticalButtons(primaryButton=" + this.a + ", secondaryButton=" + this.b + ")";
        }
    }
}
