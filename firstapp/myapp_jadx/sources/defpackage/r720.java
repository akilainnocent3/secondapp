package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface r720 {

    public static final class a implements r720 {
        public static final a a = new a();
    }

    public static final class b implements r720 {
        public static final b a = new b();
    }

    public static final class c implements r720 {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Success(value=", this.a, ")");
        }
    }
}
