package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface chq {

    public static final class a implements chq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 527907763;
        }

        public final String toString() {
            return "NoDialog";
        }
    }

    public static final class b implements c {
        public static final b a = new b();
        public static final boolean b = true;

        @Override // chq.c
        public final boolean a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1205128739;
        }

        public final String toString() {
            return "ResultDateDialog";
        }
    }

    public interface c extends chq {
        boolean a();
    }
}
