package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class usf {

    public static final class a extends usf {
        public static final a a = new a();
    }

    public static final class b extends usf {
        public static final b a = new b();
    }

    public static final class c extends usf {
        public final wfb0 a;

        public c(wfb0 wfb0Var) {
            wfb0Var.getClass();
            this.a = wfb0Var;
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
            return "Success(uiInfo=" + this.a + ")";
        }
    }
}
