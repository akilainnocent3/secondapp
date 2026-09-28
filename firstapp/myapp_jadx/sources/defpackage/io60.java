package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface io60 extends zxq.j {

    public static final class a implements io60 {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("SelectCold(isSelected=", ")", this.a);
        }
    }

    public static final class b implements io60 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("SelectHot(isSelected=", ")", this.a);
        }
    }
}
