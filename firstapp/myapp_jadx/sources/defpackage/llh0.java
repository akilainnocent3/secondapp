package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface llh0 {

    public static final class a implements llh0 {
        public final f2u a;

        public a(f2u f2uVar) {
            this.a = f2uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            f2u f2uVar = this.a;
            if (f2uVar == null) {
                return 0;
            }
            return f2uVar.hashCode();
        }

        public final String toString() {
            return "Error(state=" + this.a + ")";
        }
    }

    public static final class b implements llh0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 269593592;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements llh0 {
        public final f2u a;

        public c(f2u f2uVar) {
            f2uVar.getClass();
            this.a = f2uVar;
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
            return "Success(state=" + this.a + ")";
        }
    }
}
