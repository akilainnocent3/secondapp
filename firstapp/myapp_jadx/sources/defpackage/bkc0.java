package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface bkc0 {

    public static final class a implements bkc0 {
        public final qjc0 a;

        public a(qjc0 qjc0Var) {
            qjc0Var.getClass();
            this.a = qjc0Var;
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
            return "Failure(error=" + this.a + ")";
        }
    }

    public static final class b implements bkc0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2138385215;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements bkc0 {
        public final pjc0 a;
        public final uhc0 b;

        public c(pjc0 pjc0Var, uhc0 uhc0Var) {
            uhc0Var.getClass();
            this.a = pjc0Var;
            this.b = uhc0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(data=" + this.a + ", screenMode=" + this.b + ")";
        }
    }
}
