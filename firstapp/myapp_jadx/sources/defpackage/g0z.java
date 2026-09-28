package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface g0z {

    public static final class a implements g0z {
        public final gz4 a;

        public a(gz4 gz4Var) {
            gz4Var.getClass();
            this.a = gz4Var;
        }

        @Override // defpackage.g0z
        public final int a() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "BookingCodeInfo(uiState=" + this.a + ")";
        }
    }

    public static final class b implements g0z {
        public static final b a = new b();
        public static final int b = 2;

        @Override // defpackage.g0z
        public final int a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -964716128;
        }

        public final String toString() {
            return "NoData";
        }
    }

    public static final class c implements g0z {
        public static final c a = new c();
        public static final int b = 3;

        @Override // defpackage.g0z
        public final int a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 166364211;
        }

        public final String toString() {
            return "NoLogin";
        }
    }

    public static final class d implements g0z {
        public final jj40 a;

        public d(jj40 jj40Var) {
            jj40Var.getClass();
            this.a = jj40Var;
        }

        @Override // defpackage.g0z
        public final int a() {
            return 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RecommendedCodeHeader(uiState=" + this.a + ")";
        }
    }

    int a();
}
