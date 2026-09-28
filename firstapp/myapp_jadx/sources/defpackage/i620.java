package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class i620 {

    public static final class a extends i620 {
        public final float a;
        public final float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Absolute(x=" + this.a + ", y=" + this.b + ")";
        }
    }

    public static final class b extends i620 {
        public final c a;
        public final c b;

        public b(c cVar, c cVar2) {
            this.a = cVar;
            this.b = cVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Between(min=" + this.a + ", max=" + this.b + ")";
        }
    }

    public static final class c extends i620 {
        public final double a;
        public final double b;

        public c(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Double.compare(this.a, cVar.a) == 0 && Double.compare(this.b, cVar.b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ffp.a(this.a, "Relative(x=", ", y=");
            sbA.append(this.b);
            sbA.append(")");
            return sbA.toString();
        }
    }
}
