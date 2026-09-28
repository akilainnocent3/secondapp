package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface c5q extends chq.c {

    public static final class a implements c5q {
        public static final a a = new a();

        @Override // chq.c
        public final boolean a() {
            return false;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -456758889;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class b implements c5q {
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
            return 1151417644;
        }

        public final String toString() {
            return "Normal";
        }
    }
}
