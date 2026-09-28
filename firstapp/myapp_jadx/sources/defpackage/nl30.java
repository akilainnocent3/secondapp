package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface nl30 {

    public static final class b implements nl30 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -949899067;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class a implements nl30 {
        public final rq30 a;

        public a() {
            this.a = new rq30.b(0);
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
            return "Display(spineState=" + this.a + ')';
        }

        public a(rq30 rq30Var) {
            rq30Var.getClass();
            this.a = rq30Var;
        }
    }
}
