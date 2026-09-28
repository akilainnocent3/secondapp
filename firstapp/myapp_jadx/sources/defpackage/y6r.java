package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface y6r {

    public static final class a implements y6r {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        @Override // defpackage.y6r
        public final int getNumber() {
            return this.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "BonusNumber(number=", ")");
        }
    }

    public static final class b implements y6r {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        @Override // defpackage.y6r
        public final int getNumber() {
            return this.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "MainNumber(number=", ")");
        }
    }

    int getNumber();
}
