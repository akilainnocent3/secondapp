package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface qe60 {

    public static final class a implements qe60 {
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

    public static final class b implements qe60 {
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

    public static final class c implements qe60 {
        public final com.sportygames.newcms.b a;
        public final e860 b;
        public final u760 c;
        public final qcn<skd0> d;
        public final long e;
        public final hg60 f;
        public final iph0 g;

        public c(int i) {
            com.sportygames.newcms.b bVar = new com.sportygames.newcms.b(0);
            BigDecimal bigDecimal = skd0.b;
            n1a0 n1a0Var = n1a0.c;
            this(bVar, new e860(bigDecimal, bigDecimal, bigDecimal, bigDecimal, n1a0Var), new u760(0, 0, 0, 0, n1a0.c), n1a0Var, 0L, new hg60(), new iph0(0));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && this.e == cVar.e && Intrinsics.g(this.f, cVar.f) && Intrinsics.g(this.g, cVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + f87.a(shu.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), this.e, 31)) * 31);
        }

        public final String toString() {
            return "Success(cmsResource=" + this.a + ", defaultBetAmount=" + this.b + ", defaultAutoSpin=" + this.c + ", multipliers=" + this.d + ", configTimestamp=" + this.e + ", walletGift=" + this.f + ", userInfo=" + this.g + ')';
        }

        public c(com.sportygames.newcms.b bVar, e860 e860Var, u760 u760Var, qcn<skd0> qcnVar, long j, hg60 hg60Var, iph0 iph0Var) {
            bVar.getClass();
            qcnVar.getClass();
            hg60Var.getClass();
            this.a = bVar;
            this.b = e860Var;
            this.c = u760Var;
            this.d = qcnVar;
            this.e = j;
            this.f = hg60Var;
            this.g = iph0Var;
        }

        public c() {
            this(0);
        }
    }
}
