package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface o860 {

    public static final class a implements o860 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -226417657;
        }

        public final String toString() {
            return "Closed";
        }
    }

    public static final class b implements o860 {
        public final String a;
        public final q860 b;
        public final qcn<g860> c;
        public final qcn<Integer> d;
        public final qcn<Integer> e;
        public final String f;
        public final String g;
        public final boolean h;

        public b(String str, q860 q860Var, qcn<g860> qcnVar, qcn<Integer> qcnVar2, qcn<Integer> qcnVar3, String str2, String str3) {
            str.getClass();
            q860Var.getClass();
            qcnVar.getClass();
            qcnVar2.getClass();
            qcnVar3.getClass();
            this.a = str;
            this.b = q860Var;
            this.c = qcnVar;
            this.d = qcnVar2;
            this.e = qcnVar3;
            this.f = str2;
            this.g = str3;
            this.h = str2 != null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e) && Intrinsics.g(this.f, bVar.f) && Intrinsics.g(this.g, bVar.g);
        }

        public final int hashCode() {
            int iA = shu.a(this.e, shu.a(this.d, shu.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
            String str = this.f;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.g;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Opened(ticketId=");
            sb.append(this.a);
            sb.append(", giftState=");
            sb.append(this.b);
            sb.append(", cards=");
            sb.append(this.c);
            sb.append(", balls=");
            sb.append(this.d);
            sb.append(", extraBall=");
            sb.append(this.e);
            sb.append(", extraBallTicketId=");
            sb.append(this.f);
            sb.append(", extraStakeAmount=");
            return j26.a(sb, this.g, ')');
        }

        public b() {
            this(0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(int i) {
            q860.d dVar = q860.d.a;
            n1a0 n1a0Var = n1a0.c;
            this("", dVar, n1a0Var, n1a0Var, n1a0Var, null, null);
        }
    }
}
