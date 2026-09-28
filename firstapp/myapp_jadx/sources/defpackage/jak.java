package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jak {
    public final mgb0 a;
    public final psm b;
    public final u1l c;

    public static final class a {
        public final h400 a;
        public final c100 b;

        public a(h400 h400Var, c100 c100Var) {
            this.a = h400Var;
            this.b = c100Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "KycRequestData(payProvider=" + this.a + ", payChannel=" + this.b + ")";
        }
    }

    public static final class b {
        public final Object a;
        public final Object b;

        public b(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            Object obj2 = bVar.a;
            zi50.a aVar = zi50.b;
            return Intrinsics.g(this.a, obj2) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            zi50.a aVar = zi50.b;
            Object obj = this.a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.b;
            return (obj2 != null ? obj2.hashCode() : 0) + iHashCode;
        }

        public final String toString() {
            return tx5.a("PaymentLimitsResults(fullSummary=", zi50.b(this.a), ", kycLimits=", zi50.b(this.b), ")");
        }
    }

    public jak(mgb0 mgb0Var, psm psmVar, u1l u1lVar) {
        mgb0Var.getClass();
        psmVar.getClass();
        u1lVar.getClass();
        this.a = mgb0Var;
        this.b = psmVar;
        this.c = u1lVar;
    }
}
