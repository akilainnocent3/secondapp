package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class krv {

    public static final class a extends krv {
        public static final a a = new a();
    }

    public static final class b extends krv {
        public static final b a = new b();
    }

    public static final class c extends krv {
        public final ftv.b a;

        public c(ftv.b bVar) {
            this.a = bVar;
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
            return "Show(mission=" + this.a + ")";
        }
    }
}
