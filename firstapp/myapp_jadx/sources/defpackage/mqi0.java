package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface mqi0 {

    public static final class a implements mqi0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1530158515;
        }

        public final String toString() {
            return "Default";
        }
    }

    public static final class b implements mqi0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 322005166;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements mqi0 {
        public final boolean a;
        public final double b;
        public final int c;
        public final long d;
        public final uui0 e;

        public c(boolean z, double d, int i, long j, uui0 uui0Var) {
            uui0Var.getClass();
            this.a = z;
            this.b = d;
            this.c = i;
            this.d = j;
            this.e = uui0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Double.compare(this.b, cVar.b) == 0 && this.c == cVar.c && this.d == cVar.d && Intrinsics.g(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + f87.a(gpp.a(this.c, nrg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), this.d, 31);
        }

        public final String toString() {
            return "Success(isWin=" + this.a + ", amount=" + this.b + ", index=" + this.c + ", createTime=" + this.d + ", userAmount=" + this.e + ')';
        }
    }
}
