package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wo60 extends xsq {
    public final r4r a;
    public final rdd0 b;

    public static final class a {
        public final qcn<kxq> a;
        public final qcn<kxq> b;

        public a(uf00 uf00Var, uf00 uf00Var2) {
            uf00Var.getClass();
            uf00Var2.getClass();
            this.a = uf00Var;
            this.b = uf00Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SNMBAUserSelectedNumber(main=" + this.a + ", bonus=" + this.b + ")";
        }
    }

    public wo60(r4r r4rVar, rdd0 rdd0Var) {
        r4rVar.getClass();
        rdd0Var.getClass();
        this.a = r4rVar;
        this.b = rdd0Var;
    }

    @Override // defpackage.xsq
    public final v67 a(tsq tsqVar, qxp qxpVar, ssq ssqVar, b390 b390Var) {
        tsqVar.getClass();
        qxpVar.getClass();
        b390Var.getClass();
        return hzh.b(new xo60(ssqVar, this, b390Var, qxpVar, null));
    }

    @Override // defpackage.xsq
    public final v67 b(ssq ssqVar, tsq tsqVar, v340 v340Var, v340 v340Var2, v340 v340Var3, wwd0 wwd0Var, b390 b390Var) {
        v340Var.getClass();
        v340Var2.getClass();
        v340Var3.getClass();
        wwd0Var.getClass();
        b390Var.getClass();
        return hzh.b(new yo60(wwd0Var, v340Var2, v340Var, v340Var3, ssqVar, this, b390Var, null));
    }
}
