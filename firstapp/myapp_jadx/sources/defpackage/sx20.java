package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface sx20 {

    public static final class a implements sx20 {
        public static final a a = new a();
    }

    public static final class b implements sx20 {
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
            return b6c.a("Success(isNeedFinishActivity=", ")", this.a);
        }
    }
}
