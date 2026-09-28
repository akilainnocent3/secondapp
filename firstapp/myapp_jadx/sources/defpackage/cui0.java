package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface cui0 {

    public static final class a implements cui0 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return j26.a(new StringBuilder("SwitchClick(dataStoreKey="), this.a, ')');
        }
    }

    public static final class b implements cui0 {
        public final kui0 a;

        public b(kui0 kui0Var) {
            kui0Var.getClass();
            this.a = kui0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SwitchScreen(page=" + this.a + ')';
        }
    }
}
