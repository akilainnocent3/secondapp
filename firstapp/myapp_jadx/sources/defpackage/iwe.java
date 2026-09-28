package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface iwe {

    public static final class a implements iwe {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 791159612;
        }

        public final String toString() {
            return "OnBackClicked";
        }
    }

    public static final class b implements iwe {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -549219655;
        }

        public final String toString() {
            return "OnPlaceBetClicked";
        }
    }

    public static final class c implements iwe {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 835920941;
        }

        public final String toString() {
            return "OnViewGiftsClicked";
        }
    }
}
