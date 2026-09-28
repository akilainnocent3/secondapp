package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface dxn {

    public static final class a implements dxn {
        public final jzn a;

        public a(jzn jznVar) {
            this.a = jznVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            jzn jznVar = this.a;
            if (jznVar == null) {
                return 0;
            }
            return jznVar.hashCode();
        }

        public final String toString() {
            return "CombinationWithOrder(guideMarketType=" + this.a + ")";
        }
    }

    public static final class b implements dxn {
        public final jzn a;

        public b(jzn jznVar) {
            this.a = jznVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            jzn jznVar = this.a;
            if (jznVar == null) {
                return 0;
            }
            return jznVar.hashCode();
        }

        public final String toString() {
            return "CombinationWithoutOrder(guideMarketType=" + this.a + ")";
        }
    }

    public static final class c implements dxn {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 203134215;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class d implements dxn {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -259076667;
        }

        public final String toString() {
            return "Vertical";
        }
    }
}
