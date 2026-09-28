package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface mue0 {

    public static final class a implements mue0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1720807954;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public static final class b implements mue0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -24932631;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class c implements mue0 {
        public final int a;
        public final int b;
        public final double c;
        public final kze0 d;
        public final boolean e;

        public c(int i, int i2, double d, kze0 kze0Var) {
            kze0Var.getClass();
            this.a = i;
            this.b = i2;
            this.c = d;
            this.d = kze0Var;
            this.e = i2 != 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && Double.compare(this.c, cVar.c) == 0 && Intrinsics.g(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + nrg0.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        }

        public final String toString() {
            return "Success(ticketId=" + this.a + ", symbolIndex=" + this.b + ", payoutAmount=" + this.c + ", gift=" + this.d + ')';
        }

        public c() {
            this(0);
        }

        public /* synthetic */ c(int i) {
            this(-1, 0, 0.0d, kze0.b.a);
        }
    }
}
