package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface yo30 {

    public static final class a implements yo30 {
        public final Throwable a;

        public a(Throwable th) {
            th.getClass();
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vt5.b(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static final class b implements yo30 {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return h70.a(new StringBuilder("Loading(progress="), this.a, ')');
        }
    }

    public static final class c implements yo30 {
        public final com.sportygames.newcms.b a;
        public final BigDecimal b;
        public final BigDecimal c;
        public final BigDecimal d;
        public final qcn<skd0> e;
        public final uq30 f;
        public final iph0 g;

        public c(com.sportygames.newcms.b bVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, qcn<skd0> qcnVar, uq30 uq30Var, iph0 iph0Var) {
            bVar.getClass();
            bigDecimal.getClass();
            bigDecimal2.getClass();
            bigDecimal3.getClass();
            qcnVar.getClass();
            uq30Var.getClass();
            this.a = bVar;
            this.b = bigDecimal;
            this.c = bigDecimal2;
            this.d = bigDecimal3;
            this.e = qcnVar;
            this.f = uq30Var;
            this.g = iph0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!Intrinsics.g(this.a, cVar.a)) {
                return false;
            }
            BigDecimal bigDecimal = cVar.b;
            BigDecimal bigDecimal2 = skd0.b;
            return Intrinsics.g(this.b, bigDecimal) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f) && this.g.equals(cVar.g);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            BigDecimal bigDecimal = skd0.b;
            return this.g.hashCode() + ((this.f.hashCode() + shu.a(this.e, dd3.a(this.d, dd3.a(this.c, dd3.a(this.b, iHashCode, 31), 31), 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(cmsResource=");
            sb.append(this.a);
            sb.append(", minAmount=");
            r03.a(", maxAmount=", sb, this.b);
            r03.a(", defaultAmount=", sb, this.c);
            r03.a(", betChipList=", sb, this.d);
            sb.append(this.e);
            sb.append(", walletGift=");
            sb.append(this.f);
            sb.append(", userInfo=");
            sb.append(this.g);
            sb.append(')');
            return sb.toString();
        }
    }
}
