package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface iej {

    public static final class a implements iej {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -846860213;
        }

        public final String toString() {
            return "Disable";
        }
    }

    public static final class b implements iej {
        public final boolean a;
        public final boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Enable(agreedPolicy=" + this.a + ", agreedAge=" + this.b + ")";
        }
    }
}
