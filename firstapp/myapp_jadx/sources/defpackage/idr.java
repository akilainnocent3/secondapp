package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface idr {

    public static final class a implements idr {
        public final her a;
        public final d5q b;

        public a(her herVar, d5q d5qVar) {
            this.a = herVar;
            this.b = d5qVar;
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
            her herVar = this.a;
            int iHashCode = (herVar == null ? 0 : herVar.hashCode()) * 31;
            d5q d5qVar = this.b;
            return iHashCode + (d5qVar != null ? d5qVar.hashCode() : 0);
        }

        public final String toString() {
            return "Loading(simpleScreenShot=" + this.a + ", detailScreenShot=" + this.b + ")";
        }
    }

    public static final class b implements idr {
        public final qcn<x8r> a;
        public final String b;
        public final boolean c;

        public b(uf00 uf00Var, String str, boolean z) {
            uf00Var.getClass();
            str.getClass();
            this.a = uf00Var;
            this.b = str;
            this.c = z;
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
            return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(screenShotList=");
            sb.append(this.a);
            sb.append(", shareUrl=");
            sb.append(this.b);
            sb.append(", hasRadioButton=");
            return mq0.a(sb, this.c, ")");
        }
    }
}
