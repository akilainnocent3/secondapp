package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ov {

    public static final class a extends ov {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 334036202;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b extends ov {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 846718361;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c extends ov {
        public final mv a;

        public c(mv mvVar) {
            this.a = mvVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "Show(payments=" + this.a + ")";
        }
    }
}
