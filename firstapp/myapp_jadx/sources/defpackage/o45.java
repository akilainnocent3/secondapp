package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface o45 {

    public static final class a implements o45 {
        public final ph60 a;
        public final ph60 b;

        public a(ph60 ph60Var, ph60 ph60Var2) {
            this.a = ph60Var;
            this.b = ph60Var2;
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
            return "LabelAndSubtext(label=" + this.a + ", subtext=" + this.b + ')';
        }
    }

    public static final class b implements o45 {
        public final ph60 a;

        public b(ph60 ph60Var) {
            this.a = ph60Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TextOnly(text=" + this.a + ')';
        }
    }
}
