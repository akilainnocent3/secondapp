package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface duq {

    public static final class a implements duq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -133543938;
        }

        public final String toString() {
            return "SelectGiftTab";
        }
    }

    public static final class b implements duq {
        public final nvp a;

        public b(nvp nvpVar) {
            this.a = nvpVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SendRootAction(rootAction=" + this.a + ")";
        }
    }
}
