package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface e0q {

    public static final class a implements e0q {
        public final zsq a;

        public a(zsq zsqVar) {
            this.a = zsqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MainDraw(state=" + this.a + ")";
        }
    }

    public static final class b implements e0q {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -760462443;
        }

        public final String toString() {
            return "None";
        }
    }
}
