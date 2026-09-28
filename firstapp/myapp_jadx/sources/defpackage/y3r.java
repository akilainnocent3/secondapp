package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface y3r {

    public static final class a implements y3r {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1002816846;
        }

        public final String toString() {
            return "Disable";
        }
    }

    public static final class b implements y3r {
        public final x3r a;

        public b(x3r x3rVar) {
            x3rVar.getClass();
            this.a = x3rVar;
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
            return "Enable(playButton=" + this.a + ")";
        }
    }
}
