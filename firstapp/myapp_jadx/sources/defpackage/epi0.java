package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public interface epi0 {

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements epi0 {
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

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("Expend(id="), this.a, ')');
        }
    }

    public static final class b implements epi0 {
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

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("LoadMore(lastId="), this.a, ')');
        }
    }
}
