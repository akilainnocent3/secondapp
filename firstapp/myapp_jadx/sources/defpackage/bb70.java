package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface bb70 {

    public static final class a implements bb70 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1814005088;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements bb70 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 39418077;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class c implements bb70 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1462642831;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d implements bb70 {
        public final qcn<ua70> a;
        public final boolean b;

        public d(qcn<ua70> qcnVar, boolean z) {
            qcnVar.getClass();
            this.a = qcnVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(cellStates=" + this.a + ", shouldShowLoadingCell=" + this.b + ")";
        }
    }
}
