package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface q8q {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a implements q8q {
        public final q7q.b a;

        public a(q7q.b bVar) {
            bVar.getClass();
            this.a = bVar;
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
            return "HomeConfigRefreshing(previous=" + this.a + QWvyvNzGsBpRT.bJAtzuERSX;
        }
    }

    public static final class b implements q8q {
        public final q7q.b a;

        public b(q7q.b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "HomeConfigUpdated(featureMatch=" + this.a + ")";
        }
    }

    public static final class c implements q8q {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1713343118;
        }

        public final String toString() {
            return "Initial";
        }
    }
}
