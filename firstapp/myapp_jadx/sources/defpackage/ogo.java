package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ogo {

    public static final class c extends ogo {
        public final Float a;
        public final Float b;
        public final int c;
        public final j790 d;

        public c(Float f, Float f2, int i, j790 j790Var) {
            j790Var.getClass();
            this.a = f;
            this.b = f2;
            this.c = i;
            this.d = j790Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            Float f = this.a;
            int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.b;
            return this.d.hashCode() + gpp.a(this.c, (iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            return "ShortcutFilter(min=" + this.a + ", max=" + this.b + ", numResults=" + this.c + ", type=" + this.d + ")";
        }
    }

    public static final class b extends ogo {
        public final Float a;
        public final Float b;
        public final int c;

        public b(Float f, Float f2, int i) {
            this.a = f;
            this.b = f2;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            Float f = this.a;
            int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.b;
            return Integer.hashCode(this.c) + ((iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RegularFilter(min=");
            sb.append(this.a);
            sb.append(", max=");
            sb.append(this.b);
            sb.append(", numResults=");
            return zk1.a(this.c, ")", sb);
        }

        public b() {
            this(0);
        }

        public /* synthetic */ b(int i) {
            this(null, null, 0);
        }
    }

    public static final class a extends ogo {
        public final Float a;
        public final Float b;
        public final int c;

        public /* synthetic */ a(Float f, Float f2, int i, int i2) {
            this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            Float f = this.a;
            int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.b;
            return Integer.hashCode(this.c) + ((iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CustomFilter(min=");
            sb.append(this.a);
            sb.append(", max=");
            sb.append(this.b);
            sb.append(", numResults=");
            return zk1.a(this.c, ")", sb);
        }

        public a(Float f, Float f2, int i) {
            this.a = f;
            this.b = f2;
            this.c = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            Float f = null;
            this(f, f, 7, 0);
        }
    }
}
