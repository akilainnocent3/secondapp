package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface bh7 {

    public static final class a implements bh7 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return j26.a(new StringBuilder("Error(message="), this.a, ')');
        }
    }

    public static final class b implements bh7 {
        public static final b a = new b();
    }

    public static final class c implements bh7 {
        public static final c a = new c();
    }
}
