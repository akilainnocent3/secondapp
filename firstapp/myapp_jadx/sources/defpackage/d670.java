package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface d670 {

    public static final class a implements d670 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1627189271;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class b implements d670 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -203964517;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements d670 {
        public final c670 a;

        public c(c670 c670Var) {
            this.a = c670Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            c670 c670Var = this.a;
            if (c670Var == null) {
                return 0;
            }
            return c670Var.hashCode();
        }

        public final String toString() {
            return "Success(state=" + this.a + ")";
        }
    }
}
