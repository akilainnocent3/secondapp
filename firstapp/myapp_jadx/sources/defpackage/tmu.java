package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tmu implements qij0 {

    public static final class a extends tmu {
        public final Object a;
        public final boolean b;

        public a(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OnDeleteSavedAsset(id=" + this.a + ", updateOrder=" + this.b + ")";
        }
    }

    public static final class b extends tmu {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1456176278;
        }

        public final String toString() {
            return "OnEnterManageAccount";
        }
    }

    public static final class c extends tmu {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1572129001;
        }

        public final String toString() {
            return "OnLeaveManageAccount";
        }
    }

    public static final class d extends tmu {
        public final int a;
        public final int b;

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return n36.a("OnOrderChanged(from=", this.a, this.b, ", to=", ")");
        }
    }

    public static final class e extends tmu {
        public final Object a;

        public e(Object obj) {
            this.a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return aya.b(this.a, "OnSetAsDefault(id=", ")");
        }
    }
}
