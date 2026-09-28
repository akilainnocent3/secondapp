package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vqr implements id90 {

    public static final class a extends vqr {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1242325475;
        }

        public final String toString() {
            return "ExitRegistration";
        }
    }

    public static final class b extends vqr {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1371345041;
        }

        public final String toString() {
            return "NavigateToLogin";
        }
    }

    public static final class c extends vqr {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            wd7.a(str, str2, str3, str4);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f) && Intrinsics.g(this.g, cVar.g) && Intrinsics.g(this.h, cVar.h) && Intrinsics.g(this.i, cVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("NavigateToPersonalInfo(email=", this.a, ", cpf=", this.b, ", password=");
            hxa.c(sbA, this.c, ", fullName=", this.d, ", dateOfBirth=");
            hxa.c(sbA, this.e, ", zipcode=", this.f, ", street=");
            hxa.c(sbA, this.g, ", city=", this.h, ", state=");
            return uf80.a(sbA, this.i, ")");
        }
    }

    public static final class d extends vqr {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public d(String str, String str2, String str3, String str4) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c) && Intrinsics.g(this.d, dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return kwi.a(ux5.a("NavigateToRegistrationValidation(email=", this.a, ", cpf=", this.b, ", phoneNumber="), this.c, ", phoneCountryCode=", this.d, ")");
        }
    }

    public static final class e extends vqr {
        public final String a;
        public final String b;
        public final String c;

        public e(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b) && Intrinsics.g(this.c, eVar.c);
        }

        public final int hashCode() {
            int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return uf80.a(ux5.a("NavigateToVerifyEmail(email=", this.a, ", token=", this.b, ", cpf="), this.c, ")");
        }
    }
}
