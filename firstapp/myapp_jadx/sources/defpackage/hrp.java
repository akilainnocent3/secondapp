package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hrp {

    public static final class a extends hrp {
        public final uf00<t5g0> a;
        public final int b;

        public a(int i, uf00 uf00Var) {
            this.a = uf00Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Content(rounds=" + this.a + ", defaultRoundIndex=" + this.b + ")";
        }
    }

    public static final class b extends hrp {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 103755031;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class c extends hrp {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1554991989;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
