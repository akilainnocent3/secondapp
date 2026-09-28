package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface a8j {

    public static final class a implements a8j {
        public final double a;

        public a(double d) {
            this.a = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Double.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.a);
        }

        public final String toString() {
            return "OnChipSelected(amount=" + this.a + ")";
        }
    }

    public static final class b implements a8j {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2057447958;
        }

        public final String toString() {
            return "OnDisableClicked";
        }
    }

    public static final class c implements a8j {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -461905369;
        }

        public final String toString() {
            return "PlayChipSelectSound";
        }
    }

    public static final class d implements a8j {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("PlayStakeSwitchSound(isOn=", ")", this.a);
        }
    }
}
