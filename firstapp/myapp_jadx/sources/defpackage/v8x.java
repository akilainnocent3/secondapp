package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface v8x {

    public static final class a implements v8x {
        public final String a;
        public final String b;
        public final String c;
        public final z8x d;
        public final z8x e;

        public a(String str, String str2, String str3, z8x z8xVar, z8x z8xVar2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            z8xVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z8xVar;
            this.e = z8xVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
        }

        public final String toString() {
            return "ButtonDialog(text=" + this.a + ", left=" + this.b + ", right=" + this.c + ", onLeftEvent=" + this.d + ", onRightEvent=" + this.e + ')';
        }
    }

    public static final class b implements v8x {
        public final uf00<GiftItem> a;
        public final double b;
        public final double c;
        public final double d;

        public b(uf00<GiftItem> uf00Var, double d, double d2, double d3) {
            uf00Var.getClass();
            this.a = uf00Var;
            this.b = d;
            this.c = d2;
            this.d = d3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Double.compare(this.b, bVar.b) == 0 && Double.compare(this.c, bVar.c) == 0 && Double.compare(this.d, bVar.d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.d) + nrg0.a(nrg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GiftDialog(giftList=");
            sb.append(this.a);
            sb.append(", maxAmount=");
            sb.append(this.b);
            sb.append(", minAmount=");
            sb.append(this.c);
            sb.append(", betAmount=");
            return org0.a(sb, this.d, ')');
        }
    }

    public static final class c implements v8x {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2017663051;
        }

        public final String toString() {
            return "LoginDialog";
        }
    }

    public static final class d implements v8x {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1921064123;
        }

        public final String toString() {
            return "NoDialog";
        }
    }

    public static final class e implements v8x {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -2073834933;
        }

        public final String toString() {
            return "NoMoneyDialog";
        }
    }

    public static final class f implements v8x {
        public final String a;
        public final iwg b;
        public final boolean c;
        public final boolean d;

        public f(String str, iwg iwgVar, boolean z, boolean z2) {
            iwgVar.getClass();
            this.a = str;
            this.b = iwgVar;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b) && this.c == fVar.c && this.d == fVar.d;
        }

        public final int hashCode() {
            String str = this.a;
            return Boolean.hashCode(this.d) + mtg0.a((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecommendationDialog(message=");
            sb.append(this.a);
            sb.append(", state=");
            sb.append(this.b);
            sb.append(", isShow=");
            sb.append(this.c);
            sb.append(", isLeaveOnly=");
            return ruw.a(sb, this.d, ')');
        }
    }

    public static final class g implements v8x {
        public final String a;
        public final String b;
        public final z8x c;

        public g(String str, String str2, z8x z8xVar) {
            str.getClass();
            str2.getClass();
            z8xVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = z8xVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.g(this.a, gVar.a) && Intrinsics.g(this.b, gVar.b) && Intrinsics.g(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "SingleButtonDialog(text=" + this.a + ", actionButton=" + this.b + ", onClinkEvent=" + this.c + ')';
        }
    }
}
