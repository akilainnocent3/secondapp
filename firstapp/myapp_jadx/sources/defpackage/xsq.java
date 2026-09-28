package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xsq {
    public abstract v67 a(tsq tsqVar, qxp qxpVar, ssq ssqVar, b390 b390Var);

    public abstract v67 b(ssq ssqVar, tsq tsqVar, v340 v340Var, v340 v340Var2, v340 v340Var3, wwd0 wwd0Var, b390 b390Var);

    public isq c(String str, String str2, qcn<Integer> qcnVar, qcn<Integer> qcnVar2, qcn<Integer> qcnVar3, qcn<Integer> qcnVar4) {
        jrq aVar;
        jrq aVar2;
        qcnVar.getClass();
        qcnVar2.getClass();
        qcnVar3.getClass();
        qcnVar4.getClass();
        boolean z = qcnVar.isEmpty() && qcnVar2.isEmpty();
        if (z) {
            if (str == null) {
                str = "";
            }
            aVar = new jrq.b(str);
        } else {
            aVar = new jrq.a(qcnVar, qcnVar2);
        }
        if (z) {
            if (str2 == null) {
                str2 = "";
            }
            aVar2 = new jrq.b(str2);
        } else {
            aVar2 = new jrq.a(qcnVar3, qcnVar4);
        }
        return new isq(aVar, aVar2);
    }

    public static final class a {
        public final lyh<Boolean> a;
        public final lyh<Boolean> b;
        public final lyh<dqh0> c;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(int i) {
            Boolean bool = Boolean.FALSE;
            this(new gzh(bool), new gzh(bool), new gzh(new dqh0.c(0)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "MarketSelectionFlow(displayBetPanel=" + this.a + ", marketAllowBet=" + this.b + ", userSelected=" + this.c + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(lyh<Boolean> lyhVar, lyh<Boolean> lyhVar2, lyh<? extends dqh0> lyhVar3) {
            this.a = lyhVar;
            this.b = lyhVar2;
            this.c = lyhVar3;
        }

        public a() {
            this(0);
        }
    }
}
