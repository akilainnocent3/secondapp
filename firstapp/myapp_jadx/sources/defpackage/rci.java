package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface rci {

    public static final class a implements rci {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1094102203;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class b implements rci {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 329122551;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements rci {
        public final List<gci> a;

        public c(qcn qcnVar) {
            qcnVar.getClass();
            this.a = qcnVar;
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
            return p.a("Success(eventStates=", ")", this.a);
        }
    }
}
