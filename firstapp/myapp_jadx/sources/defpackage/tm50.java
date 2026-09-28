package defpackage;

import com.appsflyer.internal.p;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface tm50 {

    public static final class a implements tm50 {
        public final List<jpc> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends jpc> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a("Data(items=", ")", this.a);
        }
    }

    public static final class b implements tm50 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 689362183;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class c implements tm50 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 689512898;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class d implements tm50 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 160895194;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class e implements tm50 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1282397578;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
