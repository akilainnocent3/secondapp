package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface l6r {

    public static final class a implements l6r {
        public final qcn<y6r> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(qcn<? extends y6r> qcnVar) {
            qcnVar.getClass();
            this.a = qcnVar;
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
            return vf5.a(this.a, "Number(numbers=", ")");
        }
    }

    public static final class b implements l6r {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1187044749;
        }

        public final String toString() {
            return "Void";
        }
    }
}
