package defpackage;

import com.appsflyer.internal.x;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface jb40 {

    public interface a {

        /* JADX INFO: renamed from: jb40$a$a, reason: collision with other inner class name */
        public static final class C0716a implements a {
            public static final C0716a a = new C0716a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0716a);
            }

            public final int hashCode() {
                return -2105691156;
            }

            public final String toString() {
                return "Default";
            }
        }

        public static final class b implements a {
            public final Map<Integer, b> a;

            public b(Map<Integer, b> map) {
                map.getClass();
                this.a = map;
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
                return "IdData(data=" + this.a + ")";
            }
        }
    }

    public static final class b {
        public final String a;
        public final long b;

        public b(String str, long j) {
            str.getClass();
            this.a = str;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sbA = x.a(this.b, "CMSStringValue(value=", this.a, ", version=");
            sbA.append(")");
            return sbA.toString();
        }
    }

    Object a(Function1 function1, boolean z, ln5 ln5Var, int i, Object... objArr);

    String b(boolean z, ln5 ln5Var, int i, Object... objArr);

    v340 c();

    boolean d(int i);

    Unit e();

    ob40 getState();
}
