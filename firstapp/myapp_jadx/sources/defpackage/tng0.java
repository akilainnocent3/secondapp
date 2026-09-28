package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface tng0 {

    public static final class a implements tng0 {
        public final String a;
        public final bc6 b;

        public a(String str, bc6 bc6Var) {
            str.getClass();
            this.a = str;
            this.b = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RequestBirthday(tradeId=" + this.a + ", continuation=" + this.b + ")";
        }
    }

    public static final class b implements tng0 {
        public final String a;
        public final bc6 b;

        public b(String str, bc6 bc6Var) {
            str.getClass();
            this.a = str;
            this.b = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RequestCheckHolding(tradeId=" + this.a + ", continuation=" + this.b + ")";
        }
    }

    public static final class c implements tng0 {
        public final String a;
        public final String b;
        public final bc6 c;

        public c(String str, String str2, bc6 bc6Var) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("RequestDialOtp(tradeId=", this.a, ", displayMsg=", this.b, ", continuation=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class d implements tng0 {
        public final String a;
        public final bc6 b;

        public d(String str, bc6 bc6Var) {
            str.getClass();
            this.a = str;
            this.b = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RequestOtp(tradeId=" + this.a + ", continuation=" + this.b + ")";
        }
    }

    public static final class e implements tng0 {
        public final String a;
        public final bc6 b;

        public e(String str, bc6 bc6Var) {
            str.getClass();
            this.a = str;
            this.b = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return Intrinsics.g(this.a, eVar.a) && this.b == eVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RequestPhone(tradeId=" + this.a + ", continuation=" + this.b + ")";
        }
    }

    public static final class f implements tng0 {
        public final String a;
        public final bc6 b;

        public f(String str, bc6 bc6Var) {
            str.getClass();
            this.a = str;
            this.b = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return Intrinsics.g(this.a, fVar.a) && this.b == fVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RequestPin(tradeId=" + this.a + ", continuation=" + this.b + ")";
        }
    }

    public static final class g implements tng0 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final bc6 e;

        public g(String str, String str2, String str3, String str4, bc6 bc6Var) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return Intrinsics.g(this.a, gVar.a) && Intrinsics.g(this.b, gVar.b) && Intrinsics.g(this.c, gVar.c) && Intrinsics.g(this.d, gVar.d) && this.e == gVar.e;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("RequestSecondOtp(tradeId=", this.a, ", counterIconUrl=", this.b, ", counterAuthority=");
            hxa.c(sbA, this.c, ", counterPart=", this.d, ", continuation=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class h implements tng0 {
        public final String a;
        public final String b;
        public final bc6 c;

        public h(String str, String str2, bc6 bc6Var) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return Intrinsics.g(this.a, hVar.a) && this.b.equals(hVar.b) && this.c == hVar.c;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("RequestSms(tradeId=", this.a, ", smsToken=", this.b, ", continuation=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class i implements tng0 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final bc6 e;

        public i(String str, String str2, String str3, String str4, bc6 bc6Var) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Intrinsics.g(this.a, iVar.a) && this.b.equals(iVar.b) && this.c.equals(iVar.c) && this.d.equals(iVar.d) && this.e == iVar.e;
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("RequestUpstreamSms(tradeId=", this.a, ", smsToken=", this.b, ", targetPhoneNumber=");
            hxa.c(sbA, this.c, ", smsCode=", this.d, ", continuation=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }
    }
}
