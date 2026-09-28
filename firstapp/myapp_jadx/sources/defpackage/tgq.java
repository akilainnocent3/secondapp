package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface tgq {

    public static final class a implements tgq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1464195174;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements tgq {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -150028782;
        }

        public final String toString() {
            return "ClearFilter";
        }
    }

    public static final class c implements tgq {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1312444709;
        }

        public final String toString() {
            return "CloseFilterDialog";
        }
    }

    public static final class d implements tgq {
        public final String a;

        public d(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("DeleteOrder(orderId=", this.a, ")");
        }
    }

    public static final class e implements tgq {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -645651826;
        }

        public final String toString() {
            return "LoadMore";
        }
    }

    public static final class f implements tgq {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1786435287;
        }

        public final String toString() {
            return "OnRefresh";
        }
    }

    public static final class g implements tgq {
        public final String a;

        public g(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.g(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OpenDetail(orderId=", this.a, ")");
        }
    }

    public static final class h implements tgq {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1588656980;
        }

        public final String toString() {
            return "OpenSettledFilter";
        }
    }

    public static final class i implements tgq {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 2057163255;
        }

        public final String toString() {
            return "OpenWinFilter";
        }
    }

    public static final class j implements tgq {
        public final String a;
        public final String b;
        public final hlr c;

        public j(String str, String str2, hlr hlrVar) {
            str.getClass();
            str2.getClass();
            hlrVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = hlrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.g(this.a, jVar.a) && Intrinsics.g(this.b, jVar.b) && this.c == jVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("ReBet(lotteryId=", this.a, ", orderId=", this.b, ", winningStatus=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class k implements tgq {
        public final ojq a;

        public k(ojq ojqVar) {
            this.a = ojqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a == ((k) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectFilter(filter=" + this.a + ")";
        }
    }
}
