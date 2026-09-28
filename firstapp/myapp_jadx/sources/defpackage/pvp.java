package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface pvp {

    public static final class a implements pvp {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 728148043;
        }

        public final String toString() {
            return "Next";
        }
    }

    public static final class b implements pvp {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1817345048;
        }

        public final String toString() {
            return "PopBackStack";
        }
    }

    public static final class c implements pvp {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 728293077;
        }

        public final String toString() {
            return "Save";
        }
    }

    public static final class d implements pvp {
        public final lk50<qxp> a;

        public d(lk50<qxp> lk50Var) {
            lk50Var.getClass();
            this.a = lk50Var;
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
            return "UpdateBetConfig(config=" + this.a + ")";
        }
    }

    public static final class e implements pvp {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("UpdateCold(selected=", ")", this.a);
        }
    }

    public static final class f implements pvp {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("UpdateHot(selected=", ")", this.a);
        }
    }

    public static final class g implements pvp {
        public final ijf0 a;

        public g(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a.equals(((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vwz.a("UpdateName(name=", this.a, ")");
        }
    }

    public static final class h implements pvp {
        public final zxq a;

        public h(zxq zxqVar) {
            this.a = zxqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a.equals(((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateSelectedNumber(action=" + this.a + ")";
        }
    }
}
