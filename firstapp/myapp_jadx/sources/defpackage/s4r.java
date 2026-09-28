package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface s4r {

    public static final class a implements s4r {
        public final String a;
        public final String b;
        public final atq c;
        public final String d;
        public final qcn<Integer> e;
        public final qcn<Integer> f;

        public a(String str, String str2, atq atqVar, String str3, uf00 uf00Var, uf00 uf00Var2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            uf00Var.getClass();
            uf00Var2.getClass();
            this.a = str;
            this.b = str2;
            this.c = atqVar;
            this.d = str3;
            this.e = uf00Var;
            this.f = uf00Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + shu.a(this.e, gmf0.a((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Data(marketGroupId=", this.a, ", marketId=", this.b, ", marketType=");
            sbA.append(this.c);
            sbA.append(", outcomeId=");
            sbA.append(this.d);
            sbA.append(", mainNumbers=");
            sbA.append(this.e);
            sbA.append(", bonusNumbers=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b implements s4r {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -885516794;
        }

        public final String toString() {
            return "Error";
        }
    }
}
