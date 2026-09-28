package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface dge {

    public static final class a implements dge {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2134319028;
        }

        public final String toString() {
            return "BlockDevice";
        }
    }

    public static final class b implements dge {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2064486353;
        }

        public final String toString() {
            return "LogoutDevice";
        }
    }

    public static final class c implements dge {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1344503494;
        }

        public final String toString() {
            return "LogoutOtherDevices";
        }
    }

    public static final class d implements dge {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 624709435;
        }

        public final String toString() {
            return "UnblockDevice";
        }
    }
}
