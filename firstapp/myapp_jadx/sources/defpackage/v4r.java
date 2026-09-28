package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface v4r {

    public static final class a implements v4r {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1042812342;
        }

        public final String toString() {
            return "None";
        }
    }

    public interface b extends v4r {

        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -860624612;
            }

            public final String toString() {
                return "Failed";
            }
        }

        /* JADX INFO: renamed from: v4r$b$b, reason: collision with other inner class name */
        public static final class C1205b implements b {
            public static final C1205b a = new C1205b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1205b);
            }

            public final int hashCode() {
                return 513681469;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements b {
            public final qcn<t4r> a;
            public final tlq b;

            public c(qcn<t4r> qcnVar, tlq tlqVar) {
                qcnVar.getClass();
                this.a = qcnVar;
                this.b = tlqVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(recentDraws=" + this.a + ", endState=" + this.b + ")";
            }
        }
    }
}
