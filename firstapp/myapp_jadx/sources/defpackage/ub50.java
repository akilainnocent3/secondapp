package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface ub50 {

    public static final class a implements ub50 {
        public final String a;
        public final boolean b;
        public final wvz c;

        public a(String str, boolean z, wvz wvzVar) {
            str.getClass();
            this.a = str;
            this.b = z;
            this.c = wvzVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = z620.a("HandleResetPasswordSuccess(mobile=", this.a, ", hasTokens=", ", passwordResetResult=", this.b);
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b implements ub50 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1477746674;
        }

        public final String toString() {
            return "LeaveScreen";
        }
    }

    public static final class c implements ub50 {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("TryResetPassword(token=", this.a, ", password=", this.b, ")");
        }
    }
}
