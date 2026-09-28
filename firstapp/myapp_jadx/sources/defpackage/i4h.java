package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface i4h {

    public static final class a implements i4h {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 338148622;
        }

        public final String toString() {
            return "NoShow";
        }
    }

    public static final class b implements i4h {
        public final qcn<Integer> a;
        public final boolean b;
        public final long c;

        public b(qcn<Integer> qcnVar, boolean z, long j) {
            qcnVar.getClass();
            this.a = qcnVar;
            this.b = z;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Show(balls=");
            sb.append(this.a);
            sb.append(", hasSound=");
            sb.append(this.b);
            sb.append(", animationTime=");
            return uvh.a(sb, this.c, ')');
        }
    }
}
