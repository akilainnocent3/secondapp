package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface ovi0 {

    public static final class a implements ovi0 {
        public final uf00<j58> a;
        public final float b;

        public a(uf00<j58> uf00Var, float f) {
            uf00Var.getClass();
            this.a = uf00Var;
            this.b = f;
        }

        @Override // defpackage.ovi0
        public final uf00<j58> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Idle(arrangement=");
            sb.append(this.a);
            sb.append(", angle=");
            return h70.a(sb, this.b, ')');
        }
    }

    public static final class b implements ovi0 {
        public final uf00<j58> a;
        public final float b;
        public final float c;

        public b(uf00<j58> uf00Var, float f, float f2) {
            uf00Var.getClass();
            this.a = uf00Var;
            this.b = f;
            this.c = f2;
        }

        @Override // defpackage.ovi0
        public final uf00<j58> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + tvh.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Spinning(arrangement=");
            sb.append(this.a);
            sb.append(", oldAngle=");
            sb.append(this.b);
            sb.append(", newAngle=");
            return h70.a(sb, this.c, ')');
        }
    }

    uf00<j58> a();
}
