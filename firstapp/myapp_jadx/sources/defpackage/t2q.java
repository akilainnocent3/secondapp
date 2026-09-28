package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface t2q {

    public static final class a implements b {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ConfirmBetProcess(message=", this.a, ")");
        }
    }

    public interface b extends t2q {
    }

    public static final class c implements t2q {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1699732441;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class d implements b {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            qn4.b(str, str2, str4, str5, str7);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && this.c.equals(dVar.c) && Intrinsics.g(this.d, dVar.d) && Intrinsics.g(this.e, dVar.e) && this.f.equals(dVar.f) && Intrinsics.g(this.g, dVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Success(orderId=", this.a, ", ticketId=", this.b, ", drawTime=");
            hxa.c(sbA, this.c, ", totalStake=", this.d, ", currency=");
            hxa.c(sbA, this.e, ", totalOdds=", this.f, ", potentialWin=");
            return uf80.a(sbA, this.g, ")");
        }
    }

    public static final class e implements b {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -284664684;
        }

        public final String toString() {
            return "Summiting";
        }
    }
}
