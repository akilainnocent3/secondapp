package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface leq {

    public static final class a implements leq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1983397263;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements leq {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1983246548;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class c implements leq {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1413782176;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d implements leq {
        public final qcn<hfq> a;
        public final String b;
        public final String c;

        public d(qcn<hfq> qcnVar, String str, String str2) {
            qcnVar.getClass();
            str.getClass();
            str2.getClass();
            this.a = qcnVar;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(gifts=");
            sb.append(this.a);
            sb.append(", currency=");
            sb.append(this.b);
            sb.append(", total=");
            return uf80.a(sb, this.c, ")");
        }
    }
}
