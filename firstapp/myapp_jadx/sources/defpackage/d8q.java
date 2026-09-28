package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface d8q {

    public static final class a implements d8q {
        public final x7q a;
        public final long b;

        public a(x7q x7qVar, long j) {
            this.a = x7qVar;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Card(target=" + this.a + ", requestVersion=" + this.b + ")";
        }
    }

    public static final class b implements d8q {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1362900412;
        }

        public final String toString() {
            return "Global";
        }
    }
}
