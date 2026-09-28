package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface bn90 {

    public static final class a implements bn90 {
        public final an90 a;

        public a(an90 an90Var) {
            this.a = an90Var;
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
            return "Failure(error=" + this.a + ")";
        }
    }

    public static final class b implements bn90 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -535850964;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements bn90 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 144500296;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class d implements bn90 {
        public final rq90 a;

        public d(rq90 rq90Var) {
            rq90Var.getClass();
            this.a = rq90Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(ticket=" + this.a + ")";
        }
    }
}
