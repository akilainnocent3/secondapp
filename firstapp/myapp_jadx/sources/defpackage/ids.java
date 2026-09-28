package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ids {

    public static final class a extends ids {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1059127722;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b extends ids {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1730130014;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c extends ids {
        public final hds a;

        public c(hds hdsVar) {
            this.a = hdsVar;
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
            return "ShowUI(limitsBettingUiModel=" + this.a + ")";
        }
    }
}
