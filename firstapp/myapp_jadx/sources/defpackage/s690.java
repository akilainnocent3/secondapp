package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface s690 {

    public static final class a implements s690 {
        public final zd90 a;
        public final int b;

        public a(zd90 zd90Var, int i) {
            this.a = zd90Var;
            this.b = i;
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
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DialogGuidance(dialogType=" + this.a + ", slotCount=" + this.b + ")";
        }
    }

    public static final class b implements s690 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1560310181;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    public static final class c implements s690 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1139009974;
        }

        public final String toString() {
            return "NeedsRemoval";
        }
    }
}
