package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface yr5 {
    public static final dbd a = new dbd();

    public static final class a {
        public final iox a;

        public a(iox ioxVar) {
            this.a = ioxVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            iox ioxVar = this.a;
            if (ioxVar != null) {
                return ioxVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ReadResult(request=null, response=" + this.a + ')';
        }
    }

    b a(iox ioxVar, iox ioxVar2);

    a b(iox ioxVar);

    public static final class b {
        public final iox a;

        static {
            new b();
        }

        public b() {
            this.a = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return Intrinsics.g(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            iox ioxVar = this.a;
            if (ioxVar != null) {
                return ioxVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "WriteResult(response=" + this.a + ')';
        }

        public b(iox ioxVar) {
            this.a = ioxVar;
        }
    }
}
