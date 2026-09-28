package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface mze0 {

    public static final class a implements mze0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -108485962;
        }

        public final String toString() {
            return "CancelDigging";
        }
    }

    public static final class b implements mze0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1315370800;
        }

        public final String toString() {
            return "Digging";
        }
    }

    public static final class c implements mze0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1446254485;
        }

        public final String toString() {
            return "NoResult";
        }
    }

    public static final class d implements mze0 {
        public final int a;
        public final int b;
        public final jze0 c;

        public d() {
            this(-1, 0, new jze0(0));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && Intrinsics.g(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "Result(ticketId=" + this.a + ", symbolIndex=" + this.b + ", amount=" + this.c + ')';
        }

        public d(int i, int i2, jze0 jze0Var) {
            this.a = i;
            this.b = i2;
            this.c = jze0Var;
        }
    }
}
