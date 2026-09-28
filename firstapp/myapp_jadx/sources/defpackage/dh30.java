package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dh30 {

    public static final class a extends dh30 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1638148000;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b extends dh30 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -32294193;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c extends dh30 {
        public final fg30 a;

        public c(fg30 fg30Var) {
            this.a = fg30Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Show(builder=" + this.a + ")";
        }
    }
}
