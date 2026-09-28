package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface y8r {

    public static final class a implements y8r {
        public final a9r a;

        public a(a9r a9rVar) {
            a9rVar.getClass();
            this.a = a9rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Done(state=" + this.a + ")";
        }
    }

    public static final class b implements y8r {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1666962432;
        }

        public final String toString() {
            return "Init";
        }
    }

    public static final class c implements y8r {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 417388785;
        }

        public final String toString() {
            return "Upload";
        }
    }

    public static final class d implements y8r {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2063179986;
        }

        public final String toString() {
            return "WaitingForScreenShot";
        }
    }
}
