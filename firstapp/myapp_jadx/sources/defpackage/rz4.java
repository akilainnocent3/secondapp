package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface rz4 {

    public static final class a implements rz4 {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
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
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Match(isMatchIconsVisible=" + this.a + ", isStatsVisible=" + this.b + ")";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class b implements rz4 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1746366640;
        }

        public final String toString() {
            return "Outright";
        }
    }
}
