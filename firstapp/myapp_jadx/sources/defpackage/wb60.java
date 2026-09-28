package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface wb60 {

    public static final class a implements wb60 {
        public final qcn<vb60> a;
        public final boolean b;
        public final int c;
        public final BigDecimal d;
        public final String e;
        public final BigDecimal f;
        public final String g;
        public final boolean h;
        public final boolean i;

        public a(uf00 uf00Var, boolean z, int i, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, boolean z2, boolean z3) {
            uf00Var.getClass();
            str.getClass();
            str2.getClass();
            this.a = uf00Var;
            this.b = z;
            this.c = i;
            this.d = bigDecimal;
            this.e = str;
            this.f = bigDecimal2;
            this.g = str2;
            this.h = z2;
            this.i = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.g(this.a, aVar.a) || this.b != aVar.b || this.c != aVar.c) {
                return false;
            }
            BigDecimal bigDecimal = aVar.d;
            BigDecimal bigDecimal2 = skd0.b;
            return this.d.equals(bigDecimal) && Intrinsics.g(this.e, aVar.e) && this.f.equals(aVar.f) && Intrinsics.g(this.g, aVar.g) && this.h == aVar.h && this.i == aVar.i;
        }

        public final int hashCode() {
            int iA = gpp.a(this.c, mtg0.a(this.a.hashCode() * 31, 31, this.b), 31);
            BigDecimal bigDecimal = skd0.b;
            return Boolean.hashCode(this.i) + mtg0.a(gmf0.a(dd3.a(this.f, gmf0.a(dd3.a(this.d, iA, 31), 31, this.e), 31), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HaveCard(cardItems=");
            sb.append(this.a);
            sb.append(", canRebuild=");
            sb.append(this.b);
            sb.append(", winLine=");
            sb.append(this.c);
            sb.append(", betValue=");
            BigDecimal bigDecimal = skd0.b;
            String plainString = this.d.toPlainString();
            plainString.getClass();
            sb.append((Object) plainString);
            sb.append(", bet=");
            sb.append(this.e);
            sb.append(", wonValue=");
            String plainString2 = this.f.toPlainString();
            plainString2.getClass();
            sb.append((Object) plainString2);
            sb.append(", won=");
            sb.append(this.g);
            sb.append(", editable=");
            sb.append(this.h);
            sb.append(", showFakeExtraBallMode=");
            return ruw.a(sb, this.i, ')');
        }
    }

    public static final class b implements wb60 {
        public final boolean a;

        public b(int i, boolean z) {
            this.a = (i & 1) != 0 ? false : z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return mq0.a(new StringBuilder("NoCard(editable="), this.a, ", showFakeExtraBallMode=false)");
        }
    }
}
