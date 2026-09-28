package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public interface zsq {

    public static final class a implements zsq {
        public static final a a = new a();
        public static final String b = "";
        public static final String c = "";

        @Override // defpackage.zsq
        public final String a() {
            return c;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // defpackage.zsq
        public final String getMarketId() {
            return b;
        }

        public final int hashCode() {
            return -1798457009;
        }

        public final String toString() {
            return "Nothing";
        }
    }

    public static final class b implements zsq {
        public final String a;
        public final String b;
        public final String c;
        public final qcn<xxq> d;

        public b(String str, String str2, String str3, uf00 uf00Var) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            uf00Var.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = uf00Var;
        }

        @Override // defpackage.zsq
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d);
        }

        @Override // defpackage.zsq
        public final String getMarketId() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("PBC(name=", this.a, ", marketId=", this.b, ", howToPlay=");
            sbA.append(this.c);
            sbA.append(", otherStateList=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class c implements zsq {
        public final String a;
        public final String b;
        public final String c;
        public final qcn<xxq> d;

        public c(String str, String str2, String str3, uf00 uf00Var) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            uf00Var.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = uf00Var;
        }

        @Override // defpackage.zsq
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d);
        }

        @Override // defpackage.zsq
        public final String getMarketId() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("PSO(name=", this.a, ", marketId=", this.b, ", howToPlay=");
            sbA.append(this.c);
            sbA.append(", otherStateList=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class d implements zsq {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final qcn<kxq> f;
        public final boolean g;

        public d(String str, String str2, String str3, boolean z, boolean z2, uf00 uf00Var, boolean z3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            uf00Var.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = z2;
            this.f = uf00Var;
            this.g = z3;
        }

        @Override // defpackage.zsq
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && Intrinsics.g(this.f, dVar.f) && this.g == dVar.g;
        }

        @Override // defpackage.zsq
        public final String getMarketId() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + shu.a(this.f, mtg0.a(mtg0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("SFN(name=", this.a, ", marketId=", this.b, ", howToPlay=");
            uts.b(this.c, ", isColdSelected=", ", isHotSelected=", sbA, this.d);
            sbA.append(this.e);
            sbA.append(", numbers=");
            sbA.append(this.f);
            sbA.append(", showMainBetPanel=");
            return mq0.a(sbA, this.g, ")");
        }
    }

    public static final class e implements zsq {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final qcn<kxq> f;
        public final boolean g;

        public e(String str, String str2, String str3, boolean z, boolean z2, uf00 uf00Var, boolean z3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            uf00Var.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = z2;
            this.f = uf00Var;
            this.g = z3;
        }

        @Override // defpackage.zsq
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b) && Intrinsics.g(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && Intrinsics.g(this.f, eVar.f) && this.g == eVar.g;
        }

        @Override // defpackage.zsq
        public final String getMarketId() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + shu.a(this.f, mtg0.a(mtg0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("SNB(name=", this.a, ", marketId=", this.b, ", howToPlay=");
            uts.b(this.c, ", isColdSelected=", ", isHotSelected=", sbA, this.d);
            sbA.append(this.e);
            sbA.append(", numbers=");
            sbA.append(this.f);
            sbA.append(", showMainBetPanel=");
            return mq0.a(sbA, this.g, ")");
        }
    }

    public static final class f implements zsq {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final qcn<kxq> f;
        public final q4r g;
        public final boolean h;

        public f(String str, String str2, String str3, boolean z, boolean z2, uf00 uf00Var, q4r q4rVar, boolean z3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            uf00Var.getClass();
            q4rVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = z2;
            this.f = uf00Var;
            this.g = q4rVar;
            this.h = z3;
        }

        @Override // defpackage.zsq
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b) && Intrinsics.g(this.c, fVar.c) && this.d == fVar.d && this.e == fVar.e && Intrinsics.g(this.f, fVar.f) && Intrinsics.g(this.g, fVar.g) && this.h == fVar.h;
        }

        @Override // defpackage.zsq
        public final String getMarketId() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + ((this.g.hashCode() + shu.a(this.f, mtg0.a(mtg0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("SNM(name=", this.a, ", marketId=", this.b, ", howToPlay=");
            uts.b(this.c, ", isColdSelected=", ", isHotSelected=", sbA, this.d);
            sbA.append(this.e);
            sbA.append(", numbers=");
            sbA.append(this.f);
            sbA.append(", quickPickState=");
            sbA.append(this.g);
            sbA.append(", showMainBetPanel=");
            sbA.append(this.h);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class g implements zsq {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final qcn<kxq> f;
        public final qcn<kxq> g;
        public final q4r h;
        public final boolean i;

        /* JADX WARN: Multi-variable type inference failed */
        public g(String str, String str2, String str3, boolean z, boolean z2, qcn<? extends kxq> qcnVar, qcn<? extends kxq> qcnVar2, q4r q4rVar, boolean z3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            qcnVar.getClass();
            qcnVar2.getClass();
            q4rVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = z2;
            this.f = qcnVar;
            this.g = qcnVar2;
            this.h = q4rVar;
            this.i = z3;
        }

        @Override // defpackage.zsq
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.g(this.a, gVar.a) && Intrinsics.g(this.b, gVar.b) && Intrinsics.g(this.c, gVar.c) && this.d == gVar.d && this.e == gVar.e && Intrinsics.g(this.f, gVar.f) && Intrinsics.g(this.g, gVar.g) && Intrinsics.g(this.h, gVar.h) && this.i == gVar.i;
        }

        @Override // defpackage.zsq
        public final String getMarketId() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + ((this.h.hashCode() + shu.a(this.g, shu.a(this.f, mtg0.a(mtg0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("SNMBA(name=", this.a, ", marketId=", this.b, ", howToPlay=");
            uts.b(this.c, ", isColdSelected=", ", isHotSelected=", sbA, this.d);
            sbA.append(this.e);
            sbA.append(", mainNumbers=");
            sbA.append(this.f);
            sbA.append(", bonusNumbers=");
            sbA.append(this.g);
            sbA.append(", quickPickState=");
            sbA.append(this.h);
            sbA.append(", showMainBetPanel=");
            return mq0.a(sbA, this.i, ")");
        }
    }

    String a();

    default boolean b() {
        return !StringsKt.U(a());
    }

    String getMarketId();
}
