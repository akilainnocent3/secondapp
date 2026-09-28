package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface v1i0 {

    public static final class a implements v1i0 {
        public static final a a = new a();
    }

    public static final class b implements v1i0 {
        public static final b a = new b();
    }

    public static final class c implements v1i0 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public c(String str, String str2, String str3, String str4, String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Success(pinCode=", this.a, ", fingerprintToken=", this.b, ", pinTokenForReset=");
            hxa.c(sbA, this.c, ", otpCode=", this.d, ", otpToken=");
            return uf80.a(sbA, this.e, ")");
        }
    }

    public static final class d implements v1i0 {
        public static final d a = new d();
    }

    public static final class e implements v1i0 {
        public static final e a = new e();
    }
}
