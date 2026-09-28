package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface be40 {

    public static final class a implements be40 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1990825382;
        }

        public final String toString() {
            return "CTAPage";
        }
    }

    public static final class b implements be40 {
        public final String a;
        public final String b;
        public final int c;
        public final List<String> d;

        public b(String str, String str2, int i, List<String> list) {
            list.getClass();
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c == bVar.c && Intrinsics.g(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            return at6.b(ux5.a("EpicYearPlay(title=", this.a, ", desc=", this.b, ", totalSports="), this.c, ", sportIdList=", this.d, ")");
        }
    }

    public static final class c implements be40 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 9884676;
        }

        public final String toString() {
            return "InEligiblePage";
        }
    }

    public static final class d implements be40 {
        public final String a;
        public final String b;
        public final int c;
        public final int d;

        public d(String str, String str2, int i, int i2) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c == dVar.c && this.d == dVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            return b7f.a(ux5.a("Tickets(title=", this.a, ", desc=", this.b, ", value="), this.c, ", valueType=", this.d, ")");
        }
    }

    public static final class e implements be40 {
        public final String a;
        public final String b;
        public final List<equ> c;

        public e(String str, String str2, List<equ> list) {
            list.getClass();
            this.a = str;
            this.b = str2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b) && Intrinsics.g(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return ng1.a(ux5.a("TopMarkets(title=", this.a, ", desc=", this.b, ", items="), this.c, ")");
        }
    }
}
